package com.maple.service.impl;
import java.util.ArrayList;
import java.util.List;

import com.github.pagehelper.PageInfo;
import com.maple.mapper.*;
import com.maple.pojo.*;
import com.maple.pojo.Workdata;
import com.maple.pojo.WorkdataExample;
import entity.*;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.maple.pojo.UserExample.Criteria;
import com.maple.service.UserService;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<User> findAll() {
		return userMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<User> page=   (Page<User>) userMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(User user) {
		userMapper.insert(user);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(User user){
		userMapper.updateByPrimaryKey(user);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public User findOne(Long id){
		return userMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			userMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(User user, int pageNum, int pageSize,String name) {
		PageHelper.startPage(pageNum, pageSize);
		
		UserExample example=new UserExample();
		Criteria criteria = example.createCriteria();
			if(name!=null){
				criteria.andCompidEqualTo(name);
			}
		if(user!=null){			
						if(user.getUserid()!=null && user.getUserid().length()>0){
				criteria.andUseridLike("%"+user.getUserid()+"%");
			}
			if(user.getUsername()!=null && user.getUsername().length()>0){
				criteria.andUsernameLike("%"+user.getUsername()+"%");
			}
			if(user.getPassword()!=null && user.getPassword().length()>0){
				criteria.andPasswordLike("%"+user.getPassword()+"%");
			}
			if(user.getSex()!=null && user.getSex().length()>0){
				criteria.andSexLike("%"+user.getSex()+"%");
			}
			if(user.getStatus()!=null && user.getStatus().length()>0){
				criteria.andStatusLike("%"+user.getStatus()+"%");
			}
			if(user.getPicpath()!=null && user.getPicpath().length()>0){
				criteria.andPicpathLike("%"+user.getPicpath()+"%");
			}
			if(user.getFilepath()!=null && user.getFilepath().length()>0){
				criteria.andFilepathLike("%"+user.getFilepath()+"%");
			}
			if(user.getFilename()!=null && user.getFilename().length()>0){
				criteria.andFilenameLike("%"+user.getFilename()+"%");
			}
			if(user.getEmail()!=null && user.getEmail().length()>0){
				criteria.andEmailLike("%"+user.getEmail()+"%");
			}
			if(user.getWeixin()!=null && user.getWeixin().length()>0){
				criteria.andWeixinLike("%"+user.getWeixin()+"%");
			}
			if(user.getTel()!=null && user.getTel().length()>0){
				criteria.andTelLike("%"+user.getTel()+"%");
			}
			if(user.getRolereq()!=null && user.getRolereq().length()>0){
				criteria.andRolereqLike("%"+user.getRolereq()+"%");
			}
			if(user.getCompid()!=null && user.getCompid().length()>0){
				criteria.andCompidLike("%"+user.getCompid()+"%");
			}
	
		}
		
		Page<User> page= (Page<User>)userMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}

	@Override
	public void updateRolereq(Long id, String rolereq) {
		User user = userMapper.selectByPrimaryKey(id);
		user.setRolereq(rolereq);
		userMapper.updateByPrimaryKey(user);
	}

	@Override
	public void updateStatus(Long id, String status) {
		User user = userMapper.selectByPrimaryKey(id);
		user.setRolereq(status);
		userMapper.updateByPrimaryKey(user);
	}

	@Override
	public User findoneByuserid(String userid) {
		UserExample userExample = new UserExample();
		UserExample.Criteria criteria =userExample.createCriteria();
		criteria.andUseridEqualTo(userid);
		return userMapper.selectByExample(userExample).get(0);
	}

	@Autowired
	private ResumeMapper resumeMapper;
	@Autowired
	private EduMapper eduMapper;
	@Autowired
	private PraticeMapper praticeMapper;
	@Autowired
	private ProjectMapper projectMapper;
	@Override
	public ResumeModel findResumeModel(String name) {
		ResumeModel resumemodel=new ResumeModel();
		//基本信息查询

		User user = findoneByuserid(name);
		resumemodel.setUser(user);
		ResumeExample resumeExample = new ResumeExample();
		ResumeExample.Criteria criteria = resumeExample.createCriteria();
		criteria.andUseridEqualTo(name);
		resumemodel.setResume(resumeMapper.selectByExample(resumeExample).get(0));
		//教育信息查询
		EduExample eduExample = new EduExample();
		EduExample.Criteria criteria1 = eduExample.createCriteria();
		criteria1.andUseridEqualTo(name);
		resumemodel.setEduList(eduMapper.selectByExample(eduExample));


		//实习信息查询
		PraticeExample praticeExample = new PraticeExample();
		PraticeExample.Criteria criteria2 = praticeExample.createCriteria();
		criteria2.andUseridEqualTo(name);
		resumemodel.setPraticeList(praticeMapper.selectByExample(praticeExample));


		//项目经历查询

		ProjectExample projectExample = new ProjectExample();
		ProjectExample.Criteria criteria3 = projectExample.createCriteria();
		criteria3.andUseridEqualTo(name);
		resumemodel.setProjectList(projectMapper.selectByExample(projectExample));

		return resumemodel;
	}

	@Autowired
	private JobMapper jobMapper;
	@Autowired
	private CompyMapper compyMapper;
	@Autowired
	private ProducMapper producMapper;
	@Override
	public List<JobModel>  findJobModel() {
		List<JobModel> jobModels = new ArrayList<>();
		JobExample jobExample = new JobExample();
		JobExample.Criteria criteria9=jobExample.createCriteria();
		criteria9.andStatusEqualTo(0);
		List<Job> jobs = jobMapper.selectByExample(jobExample);

		for(Job j:jobs){
			JobModel jobModel = new JobModel();
			//添加职位详情
			jobModel.setJob(j);
			//添加职位发布者
			jobModel.setUser( findoneByuserid(j.getUserid()));
			//添加公司信息

			CompyExample compyExample = new CompyExample();
			CompyExample.Criteria criteria = compyExample.createCriteria();
			criteria.andCompyidEqualTo(j.getCompid());
			jobModel.setCompy(compyMapper.selectByExample(compyExample).get(0));

			jobModels.add(jobModel);

		}
		return jobModels;
	}

	@Override
	public List<BusModel> findCompyModel() {
		List<BusModel> busModels = new ArrayList<>();
		//公司信息

		List<Compy> compyList = compyMapper.selectByExample(null);
		for(Compy compy:compyList){
			BusModel busModel = new BusModel();
			busModel.setPicpath(compy.getPicpath());
			busModel.setCompyname(compy.getCompyname());
			busModel.setRandom1(compy.getRandom1());
			busModel.setIndustayid(compy.getIndustayid() );
            busModel.setId(compy.getId());
			busModel.setIntoduction(compy.getIntoduction());
			//查询该公司的所有HR
			UserExample userExample = new UserExample();
			UserExample.Criteria criteria = userExample.createCriteria();
			criteria.andCompidEqualTo(compy.getCompyid());
			busModel.setUsers(userMapper.selectByExample(userExample));
			// 查询该公司的所有职位
			JobExample jobExample =new JobExample();
			JobExample.Criteria criteria1 = jobExample.createCriteria();
			criteria1.andCompidEqualTo(compy.getCompyid());
			criteria1.andStatusEqualTo(0);
			busModel.setJobs(jobMapper.selectByExample(jobExample));
			busModel.setHrcount(userMapper.selectByExample(userExample).size());
			busModel.setJobcount(jobMapper.selectByExample(jobExample).size());
			busModels.add(busModel);
		}
		return busModels;
	}

	@Override
	public BusModel findOneCompyModel(int id) {
		//公司信息
		BusModel busModel = new BusModel();
		Compy compy = compyMapper.selectByPrimaryKey(id);


			busModel.setPicpath(compy.getPicpath());
			busModel.setCompyname(compy.getCompyname());
			busModel.setRandom1(compy.getRandom1());
			busModel.setIndustayid(compy.getIndustayid() );
			busModel.setId(compy.getId());
			busModel.setIntoduction(compy.getIntoduction());
			//查询该公司的所有HR
			UserExample userExample = new UserExample();
			UserExample.Criteria criteria = userExample.createCriteria();
			criteria.andCompidEqualTo(compy.getCompyid());
			busModel.setUsers(userMapper.selectByExample(userExample));


			// 查询该公司的所有职位
			JobExample jobExample =new JobExample();
			JobExample.Criteria criteria1 = jobExample.createCriteria();
			criteria1.andCompidEqualTo(compy.getCompyid());
			criteria1.andStatusEqualTo(0);
			busModel.setJobs(jobMapper.selectByExample(jobExample));

			busModel.setHrcount(userMapper.selectByExample(userExample).size());
			busModel.setJobcount(jobMapper.selectByExample(jobExample).size());

			//产品信息
			ProducExample producExample = new ProducExample();
			ProducExample.Criteria criteria2 =producExample.createCriteria();
			criteria2.andCompyidEqualTo(compy.getCompyid());
			busModel.setProducs(producMapper.selectByExample(producExample));

		return busModel;
	}

	@Override
	public List<JobModel> findJobModel(int id) {
		List<JobModel> jobModels = new ArrayList<>();
		Compy compy = compyMapper.selectByPrimaryKey(id);
		JobExample jobExample =new JobExample();
		JobExample.Criteria criteria1 = jobExample.createCriteria();
		criteria1.andStatusEqualTo(0);
		criteria1.andCompidEqualTo(compy.getCompyid());
		List<Job> jobs =jobMapper.selectByExample(jobExample);
		for(Job j:jobs){
			JobModel jobModel = new JobModel();
			//添加职位详情
			jobModel.setJob(j);
			//添加职位发布者
			jobModel.setUser( findoneByuserid(j.getUserid()));
			//添加公司信息

			CompyExample compyExample = new CompyExample();
			CompyExample.Criteria criteria = compyExample.createCriteria();
			criteria.andCompyidEqualTo(j.getCompid());
			jobModel.setCompy(compyMapper.selectByExample(compyExample).get(0));

			jobModels.add(jobModel);

		}
		return jobModels;
	}


	@Override
	public PageResult findJobPage(Job job, int pageNum, int pageSize, String name) {
		PageHelper.startPage(pageNum, pageSize);
		List<JobModel> jobModels = new ArrayList<>();
		JobExample example=new JobExample();
		JobExample.Criteria criteria = example.createCriteria();
		if(job!=null){
			if(job.getName()!=null){
				criteria.andNameLike("%"+job.getName()+"%");
			}

		}
		List<Job> jobs =jobMapper.selectByExample(example);
		for(Job j:jobs) {
			JobModel jobModel = new JobModel();
			//添加职位详情
			jobModel.setJob(j);
			//添加职位发布者
			jobModel.setUser(findoneByuserid(j.getUserid()));
			//添加公司信息

			CompyExample compyExample = new CompyExample();
			CompyExample.Criteria criteria1 = compyExample.createCriteria();
			criteria1.andCompyidEqualTo(j.getCompid());
			jobModel.setCompy(compyMapper.selectByExample(compyExample).get(0));

			jobModels.add(jobModel);

		}

		PageInfo orderPageInfo = new PageInfo(jobs);
        orderPageInfo.setList(jobModels);
		return new PageResult(orderPageInfo.getTotal(), orderPageInfo.getList());
	}

	@Override
	public PageResult findCompyPage(Compy compy1, int pageNum, int pageSize, String name) {
		List<BusModel> busModels = new ArrayList<>();

		CompyExample compyExample = new CompyExample();
		CompyExample.Criteria criteria11 = compyExample.createCriteria();
		List<Compy> compyList = new ArrayList<>();
		//公司信息
		if(compy1!=null){
			criteria11.andCompynameLike("%"+compy1.getCompyname()+"%");
			compyList = compyMapper.selectByExample(compyExample);
		}
		else{
			compyList = compyMapper.selectByExample(null);
		}

		for(Compy compy:compyList){
			BusModel busModel = new BusModel();
			busModel.setPicpath(compy.getPicpath());
			busModel.setCompyname(compy.getCompyname());
			busModel.setRandom1(compy.getRandom1());
			busModel.setIndustayid(compy.getIndustayid() );
			busModel.setId(compy.getId());
			busModel.setIntoduction(compy.getIntoduction());
			//查询该公司的所有HR
			UserExample userExample = new UserExample();
			UserExample.Criteria criteria = userExample.createCriteria();
			criteria.andCompidEqualTo(compy.getCompyid());
			busModel.setUsers(userMapper.selectByExample(userExample));


			// 查询该公司的所有职位
			JobExample jobExample =new JobExample();
			JobExample.Criteria criteria1 = jobExample.createCriteria();
			criteria1.andCompidEqualTo(compy.getCompyid());
			criteria1.andStatusEqualTo(0);
			busModel.setJobs(jobMapper.selectByExample(jobExample));

			busModel.setHrcount(userMapper.selectByExample(userExample).size());
			busModel.setJobcount(jobMapper.selectByExample(jobExample).size());
			busModels.add(busModel);
		}
		PageInfo orderPageInfo = new PageInfo(compyList);
		orderPageInfo.setList(busModels);
		orderPageInfo.setTotal(busModels.size());
		return new PageResult(orderPageInfo.getTotal(), orderPageInfo.getList());
}

	@Autowired
	private WorkdataMapper workdataMapper;
	@Override
	public PageResult findWorkdataPage(Workdata workdata, int pageNum, int pageSize, String name) {
		PageHelper.startPage(pageNum, pageSize);
		WorkdataExample workdataExample = new WorkdataExample();
		WorkdataExample.Criteria criteria= workdataExample.createCriteria();
		if(name!=null){
			criteria.andUseridEqualTo(name);
		}
		criteria.andNumNotEqualTo(0);
		if(workdata!=null){
			criteria.andDatanameLike("%"+workdata.getDataname()+"%");
		}
		Page<Workdata> page=   (Page<Workdata>) workdataMapper.selectByExample(workdataExample);
		return new PageResult(page.getTotal(), page.getResult());
	}

	@Override
	public DataModel findOneDataModel(int id) {
		Workdata workdata = workdataMapper.selectByPrimaryKey(id);
		Job job = jobMapper.selectByPrimaryKey(workdata.getJobid());
		DataModel dataModel = new DataModel();
		dataModel.setJob(job);
		dataModel.setWorkdata(workdata);
		return dataModel;
	}



	@Override
	public ResumeModel finddataResume(String name) {
		ResumeModel resumemodel=new ResumeModel();
		User user = findoneByuserid(name);//基本信息查询
		String str="****";
		StringBuilder sb = new StringBuilder(user.getTel());
		sb.replace(3, 7, str);
		user.setTel(sb.toString());
		String str1=user.getUsername().substring(0,1);
		user.setUsername(str1+"**");
		user.setSex("**");
		resumemodel.setUser(user);
		if(user.getAge()<10){
				resumemodel.setAge("0-10");
		}else if(user.getAge()<20)
		{
			resumemodel.setAge("10-20");
		}else if(user.getAge()<30)
		{
			resumemodel.setAge("20-30");
		}else if(user.getAge()<40)
		{
			resumemodel.setAge("30-40");
		}else if(user.getAge()<50)
		{
			resumemodel.setAge("40-50");
		}else
		{
			resumemodel.setAge(">=50");
		}
		ResumeExample resumeExample = new ResumeExample();
		ResumeExample.Criteria criteria = resumeExample.createCriteria();
		criteria.andUseridEqualTo(name);
		resumemodel.setResume(resumeMapper.selectByExample(resumeExample).get(0));
		//教育信息查询
		EduExample eduExample = new EduExample();
		EduExample.Criteria criteria1 = eduExample.createCriteria();
		criteria1.andUseridEqualTo(name);
		resumemodel.setEduList(eduMapper.selectByExample(eduExample));
		//实习信息查询
		PraticeExample praticeExample = new PraticeExample();
		PraticeExample.Criteria criteria2 = praticeExample.createCriteria();
		criteria2.andUseridEqualTo(name);
		resumemodel.setPraticeList(praticeMapper.selectByExample(praticeExample));
		//项目经历查询
		ProjectExample projectExample = new ProjectExample();
		ProjectExample.Criteria criteria3 = projectExample.createCriteria();
		criteria3.andUseridEqualTo(name);
		resumemodel.setProjectList(projectMapper.selectByExample(projectExample));
		return resumemodel;
	}

}

package com.maple.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.maple.mapper.CompyMapper;
import com.maple.mapper.JobMapper;
import com.maple.mapper.UserMapper;
import com.maple.mapper.UserjobMapper;
import com.maple.pojo.*;
import com.maple.pojo.UserjobExample.Criteria;
import com.maple.service.UserJobService;
import entity.JobModel;
import entity.PageResult;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class UserjobServiceImpl implements UserJobService {

	@Autowired
	private UserjobMapper UserjobMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Userjob> findAll() {
		return UserjobMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<Userjob> page=   (Page<Userjob>) UserjobMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Userjob Userjob) {
		UserjobMapper.insert(Userjob);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Userjob Userjob){
		UserjobMapper.updateByPrimaryKey(Userjob);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Userjob findOne(int id){
		return UserjobMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(int[] ids) {
		for(int id:ids){
			UserjobMapper.deleteByPrimaryKey(id);
		}		
	}

	@Autowired
	private CompyMapper compyMapper;
	@Autowired
	private JobMapper jobMapper;
	@Autowired
	private UserMapper userMapper;
	
		@Override
	public PageResult findPage(Userjob Userjob, int pageNum, int pageSize,String name) {
		PageHelper.startPage(pageNum, pageSize);
		List<JobModel> jobModels =new ArrayList<>();
		UserjobExample example=new UserjobExample();
		Criteria criteria = example.createCriteria();
		if(name!=null){
			criteria.andUseridEqualTo(name);
		}
		List<Userjob> userjobs = UserjobMapper.selectByExample(example);
		for(Userjob userjob : userjobs){

			JobModel jobModel = new JobModel();
			//添加职位详情
			Job job = jobMapper.selectByPrimaryKey(userjob.getJobid());
			jobModel.setJob(job);
			//添加公司信息
			CompyExample compyExample = new CompyExample();
			CompyExample.Criteria criteria1 = compyExample.createCriteria();
			criteria1.andCompyidEqualTo(job.getCompid());
			jobModel.setCompy(compyMapper.selectByExample(compyExample).get(0));
			//添加职位创建人信息
			UserExample userExample = new UserExample();
			UserExample.Criteria criteria2 = userExample.createCriteria();
			criteria2.andUseridEqualTo(userjob.getCreateuserid());
			jobModel.setUser(userMapper.selectByExample(userExample).get(0));

			//添加投递时间
			jobModel.setUserjob(userjob);



			jobModels.add(jobModel);
		}
			PageInfo orderPageInfo = new PageInfo(userjobs);
			orderPageInfo.setList(jobModels);
			return new PageResult(orderPageInfo.getTotal(), orderPageInfo.getList());
	}

	@Override
	public PageResult findUserPage(Userjob user, int page, int rows, String name) {
			//查询出所有投简历的人们  //还需要更改状态信息  所以这里
		PageHelper.startPage(page, rows);
		UserjobExample userjobExample = new UserjobExample();
		UserjobExample.Criteria criteria = userjobExample.createCriteria();
		criteria.andJobidEqualTo(Integer.parseInt(user.getUserid()));
		criteria.andCreateuseridEqualTo(name);
		List<Userjob> userjobs = UserjobMapper.selectByExample(userjobExample);
		List<User> users =new ArrayList<>();
		for(Userjob userjob : userjobs){
			UserExample userExample = new UserExample();
			UserExample.Criteria criteria1 =userExample.createCriteria();
			criteria1.andUseridEqualTo(userjob.getUserid());
			users.add(userMapper.selectByExample(userExample).get(0));
		}
		PageInfo orderPageInfo = new PageInfo(userjobs);
		orderPageInfo.setList(users);
		return new PageResult(orderPageInfo.getTotal(), orderPageInfo.getList());
	}

	@Override
	public void updateUserJobStatus(int jobid, String userid, String createuserid) {
		UserjobExample userjobExample = new UserjobExample();
		UserjobExample.Criteria criteria = userjobExample.createCriteria();
		criteria.andJobidEqualTo(jobid);
		criteria.andCreateuseridEqualTo(createuserid);
		criteria.andUseridEqualTo(userid);
		Userjob userjob = UserjobMapper.selectByExample(userjobExample).get(0);
		userjob.setStatus("面试");
		UserjobMapper.updateByPrimaryKey(userjob);
	}
}

package com.maple.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.maple.mapper.JobMapper;
import com.maple.mapper.ResumesplitMapper;
import com.maple.mapper.UserjobMapper;
import com.maple.mapper.WorkdataMapper;
import com.maple.pojo.*;
import com.maple.pojo.WorkdataExample.Criteria;
import com.maple.service.WorkDataService;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class WorkDataServiceImpl implements WorkDataService {

	@Autowired
	private WorkdataMapper WorkdataMapper;
	@Autowired
	private JobMapper jobMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Workdata> findAll() {
		return WorkdataMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<Workdata> page=   (Page<Workdata>) WorkdataMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Autowired
	private UserjobMapper userjobMapper;
	@Autowired
	private ResumesplitMapper resumesplitMapper;
	@Override
	public void add(Workdata workdata) {
		Job job = jobMapper.selectByPrimaryKey(workdata.getJobid());
		workdata.setDataname(job.getName());
		workdata.setStartnum(1);
//		根据jobid查询所有简历信息
		UserjobExample userjobExample = new UserjobExample();
		UserjobExample.Criteria criteria =userjobExample.createCriteria();
		criteria.andJobidEqualTo(job.getId());
		List<Userjob> userjobs = userjobMapper.selectByExample(userjobExample);
		List<List<Userjob >> sum= averageAssign(userjobs,workdata.getNum());
		WorkdataMapper.insert(workdata);
		WorkdataExample workdataExample = new WorkdataExample();
		WorkdataExample.Criteria criteria1 = workdataExample.createCriteria();
		criteria1.andJobidEqualTo(workdata.getJobid());
		Workdata workdata1 = WorkdataMapper.selectByExample(workdataExample).get(0);
		int num=1;
		for(List<Userjob> userjob :sum){

			for(Userjob userjob1:userjob)
			{
				Resumesplit resumesplit =new Resumesplit();
				resumesplit.setResumeid(userjob1.getUserid());
				resumesplit.setDataid(workdata1.getId());
				resumesplit.setStatus(num);
				resumesplit.setRecomend(0);
				resumesplitMapper.insert(resumesplit);
			}
			num++;

		}

	}

	//众包简历等分
	public static <T>  List<List<Userjob>> averageAssign(List<Userjob> source, int n) {
		List<List<com.maple.pojo.Userjob>> result = new ArrayList<List<com.maple.pojo.Userjob>>();
		int remainder = source.size() % n;  //(先计算出余数)
		int number = source.size() / n;  //然后是商
		int offset = 0;//偏移量
		for (int i = 0; i < n; i++) {
			List<com.maple.pojo.Userjob> value = null;
			if (remainder > 0) {
				value = source.subList(i * number + offset, (i + 1) * number + offset + 1);
				remainder--;
				offset++;
			} else {
				value = source.subList(i * number + offset, (i + 1) * number + offset);
			}
			result.add(value);
		}
		return result;
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Workdata workdata){
		WorkdataMapper.updateByPrimaryKey(workdata);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Workdata findOne(int id){
		return WorkdataMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(int[] ids) {
		for(int id:ids){
			WorkdataMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(Workdata workdata, int pageNum, int pageSize,String name) {
		PageHelper.startPage(pageNum, pageSize);
		
		WorkdataExample example=new WorkdataExample();
		Criteria criteria = example.createCriteria();
		
		if(name!=null){

				criteria.andUseridEqualTo(name);
			}
		Page<Workdata> page= (Page<Workdata>)WorkdataMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}

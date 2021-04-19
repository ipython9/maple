package com.maple.service.impl;
import java.util.List;

import com.maple.mapper.JobMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.maple.pojo.Job;
import com.maple.pojo.JobExample;
import com.maple.pojo.JobExample.Criteria;
import com.maple.service.JobService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class JobServiceImpl implements JobService {

	@Autowired
	private JobMapper jobMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Job> findAll() {
		return jobMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<Job> page=   (Page<Job>) jobMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Job job) {
		jobMapper.insert(job);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Job job){
		jobMapper.updateByPrimaryKey(job);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Job findOne(int id){
		return jobMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(int[] ids) {
		for(int id:ids){
			jobMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(Job job, int pageNum, int pageSize,String name) {
		PageHelper.startPage(pageNum, pageSize);
		
		JobExample example=new JobExample();
		Criteria criteria = example.createCriteria();
		if(name!=null)
		{
			criteria.andUseridEqualTo(name);
		}
		if(job!=null){			
						if(job.getCompid()!=null && job.getCompid().length()>0){
				criteria.andCompidLike("%"+job.getCompid()+"%");
			}
			if(job.getUserid()!=null && job.getUserid().length()>0){
				criteria.andUseridLike("%"+job.getUserid()+"%");
			}
			if(job.getName()!=null && job.getName().length()>0){
				criteria.andNameLike("%"+job.getName()+"%");
			}
			if(job.getJobreq()!=null && job.getJobreq().length()>0){
				criteria.andJobreqLike("%"+job.getJobreq()+"%");
			}
			if(job.getNature()!=null && job.getNature().length()>0){
				criteria.andNatureLike("%"+job.getNature()+"%");
			}
			if(job.getLevel()!=null && job.getLevel().length()>0){
				criteria.andLevelLike("%"+job.getLevel()+"%");
			}
			if(job.getExp()!=null && job.getExp().length()>0){
				criteria.andExpLike("%"+job.getExp()+"%");
			}
			if(job.getContent()!=null && job.getContent().length()>0){
				criteria.andContentLike("%"+job.getContent()+"%");
			}
			if(job.getStartpd()!=null && job.getStartpd().length()>0){
				criteria.andStartpdLike("%"+job.getStartpd()+"%");
			}
			if(job.getEndpd()!=null && job.getEndpd().length()>0){
				criteria.andEndpdLike("%"+job.getEndpd()+"%");
			}
	
		}
		
		Page<Job> page= (Page<Job>)jobMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 获取指定用户的简历
	 * @param name
	 * @return
	 */
	@Override
	public List<Job> findAll(String name) {
		JobExample example=new JobExample();
		Criteria criteria = example.createCriteria();
		if(name!=null) {
			criteria.andUseridEqualTo(name);
		}
		criteria.andStatusEqualTo(1);
		List<Job> jobs = jobMapper.selectByExample(example);
		return jobs;
	}
}

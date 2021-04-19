package com.maple.service.impl;
import java.util.List;

import com.maple.mapper.ResumeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.maple.pojo.Resume;
import com.maple.pojo.ResumeExample;
import com.maple.pojo.ResumeExample.Criteria;
import com.maple.service.ResumeService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class ResumeServiceImpl implements ResumeService {

	@Autowired
	private ResumeMapper resumeMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Resume> findAll() {
		return resumeMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<Resume> page=   (Page<Resume>) resumeMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Resume resume) {
		resumeMapper.insert(resume);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Resume resume){
		resumeMapper.updateByPrimaryKey(resume);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Resume findOne(int id){
		return resumeMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(int[] ids) {
		for(int id:ids){
			resumeMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(Resume resume, int pageNum, int pageSize,String name) {
		PageHelper.startPage(pageNum, pageSize);
		
		ResumeExample example=new ResumeExample();
		Criteria criteria = example.createCriteria();
		if(name!=null){
			criteria.andUseridEqualTo(name);
		}
		if(resume!=null){			
						if(resume.getUserid()!=null && resume.getUserid().length()>0){
				criteria.andUseridLike("%"+resume.getUserid()+"%");
			}
			if(resume.getPeradv()!=null && resume.getPeradv().length()>0){
				criteria.andPeradvLike("%"+resume.getPeradv()+"%");
			}
			if(resume.getStartpd()!=null && resume.getStartpd().length()>0){
				criteria.andStartpdLike("%"+resume.getStartpd()+"%");
			}
			if(resume.getEndpd()!=null && resume.getEndpd().length()>0){
				criteria.andEndpdLike("%"+resume.getEndpd()+"%");
			}
			if(resume.getIndustryid()!=null && resume.getIndustryid().length()>0){
				criteria.andIndustryidLike("%"+resume.getIndustryid()+"%");
			}
			if(resume.getSocialurl()!=null && resume.getSocialurl().length()>0){
				criteria.andSocialurlLike("%"+resume.getSocialurl()+"%");
			}
	
		}
		
		Page<Resume> page= (Page<Resume>)resumeMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}

	@Override
	public Resume findOneByuserid(String userid) {
		ResumeExample resumeExample =new ResumeExample();
		ResumeExample.Criteria criteria =resumeExample.createCriteria();
		criteria.andUseridEqualTo(userid);
		List<Resume> resumes = resumeMapper.selectByExample(resumeExample);
		return resumes.get(0);
	}
}

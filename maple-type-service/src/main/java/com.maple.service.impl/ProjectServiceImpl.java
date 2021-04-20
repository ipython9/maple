package com.maple.service.impl;
import java.util.List;

import com.maple.mapper.ProjectMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.maple.pojo.Project;
import com.maple.pojo.ProjectExample;
import com.maple.pojo.ProjectExample.Criteria;
import com.maple.service.ProjectService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectMapper projectMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Project> findAll() {
		return projectMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<Project> page=   (Page<Project>) projectMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Project project) {
		projectMapper.insert(project);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Project project){
		projectMapper.updateByPrimaryKey(project);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Project findOne(int id){
		return projectMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(int[] ids) {
		for(int id:ids){
			projectMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(Project project, int pageNum, int pageSize,String name) {
		PageHelper.startPage(pageNum, pageSize);
		
		ProjectExample example=new ProjectExample();
		Criteria criteria = example.createCriteria();
		if(name!=null){
			criteria.andUseridEqualTo(name);
		}
		if(project!=null){			
						if(project.getUserid()!=null && project.getUserid().length()>0){
				criteria.andUseridLike("%"+project.getUserid()+"%");
			}
			if(project.getProjectname()!=null && project.getProjectname().length()>0){
				criteria.andProjectnameLike("%"+project.getProjectname()+"%");
			}
			if(project.getRole()!=null && project.getRole().length()>0){
				criteria.andRoleLike("%"+project.getRole()+"%");
			}
			if(project.getUrl()!=null && project.getUrl().length()>0){
				criteria.andUrlLike("%"+project.getUrl()+"%");
			}
			if(project.getContent()!=null && project.getContent().length()>0){
				criteria.andContentLike("%"+project.getContent()+"%");
			}
			if(project.getGrade()!=null && project.getGrade().length()>0){
				criteria.andGradeLike("%"+project.getGrade()+"%");
			}
	
		}
		
		Page<Project> page= (Page<Project>)projectMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}

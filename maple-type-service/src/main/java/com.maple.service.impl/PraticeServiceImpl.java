package com.maple.service.impl;
import java.util.List;

import com.maple.mapper.PraticeMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.maple.pojo.Pratice;
import com.maple.pojo.PraticeExample;
import com.maple.pojo.PraticeExample.Criteria;
import com.maple.service.PraticeService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class PraticeServiceImpl implements PraticeService {

	@Autowired
	private PraticeMapper praticeMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Pratice> findAll() {
		return praticeMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<Pratice> page=   (Page<Pratice>) praticeMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Pratice pratice) {
		praticeMapper.insert(pratice);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Pratice pratice){
		praticeMapper.updateByPrimaryKey(pratice);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Pratice findOne(Long id){
		return praticeMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			praticeMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(Pratice pratice, int pageNum, int pageSize,String name) {
		PageHelper.startPage(pageNum, pageSize);
		
		PraticeExample example=new PraticeExample();
		Criteria criteria = example.createCriteria();
		if(name!=null){
			criteria.andUseridEqualTo(name);
		}
		if(pratice!=null){			
						if(pratice.getUserid()!=null && pratice.getUserid().length()>0){
				criteria.andUseridLike("%"+pratice.getUserid()+"%");
			}
			if(pratice.getCompyname()!=null && pratice.getCompyname().length()>0){
				criteria.andCompynameLike("%"+pratice.getCompyname()+"%");
			}
			if(pratice.getDepartment()!=null && pratice.getDepartment().length()>0){
				criteria.andDepartmentLike("%"+pratice.getDepartment()+"%");
			}
			if(pratice.getPostiname()!=null && pratice.getPostiname().length()>0){
				criteria.andPostinameLike("%"+pratice.getPostiname()+"%");
			}
			if(pratice.getContent()!=null && pratice.getContent().length()>0){
				criteria.andContentLike("%"+pratice.getContent()+"%");
			}
			if(pratice.getGrade()!=null && pratice.getGrade().length()>0){
				criteria.andGradeLike("%"+pratice.getGrade()+"%");
			}
			if(pratice.getSkillid()!=null && pratice.getSkillid().length()>0){
				criteria.andSkillidLike("%"+pratice.getSkillid()+"%");
			}
	
		}
		
		Page<Pratice> page= (Page<Pratice>)praticeMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}

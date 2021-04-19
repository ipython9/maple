package com.maple.service.impl;
import java.util.List;

import com.maple.mapper.IndustryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.maple.pojo.Industry;
import com.maple.pojo.IndustryExample;
import com.maple.pojo.IndustryExample.Criteria;
import com.maple.service.IndustryService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class IndustryServiceImpl implements IndustryService {

	@Autowired
	private IndustryMapper industryMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Industry> findAll() {
		return industryMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<Industry> page=   (Page<Industry>) industryMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Industry industry) {
		industryMapper.insert(industry);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Industry industry){
		industryMapper.updateByPrimaryKey(industry);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Industry findOne(int id){
		return industryMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(int[] ids) {
		for(int id:ids){
			industryMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(Industry industry, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		IndustryExample example=new IndustryExample();
		Criteria criteria = example.createCriteria();
		
		if(industry!=null){			
						if(industry.getName()!=null && industry.getName().length()>0){
				criteria.andNameLike("%"+industry.getName()+"%");
			}
	
		}
		
		Page<Industry> page= (Page<Industry>)industryMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}

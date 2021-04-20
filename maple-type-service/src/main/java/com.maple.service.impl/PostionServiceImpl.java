package com.maple.service.impl;
import java.util.List;

import com.maple.mapper.PostionMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.maple.pojo.Postion;
import com.maple.pojo.PostionExample;
import com.maple.pojo.PostionExample.Criteria;
import com.maple.service.PostionService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class PostionServiceImpl implements PostionService {

	@Autowired
	private PostionMapper postionMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Postion> findAll() {
		return postionMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<Postion> page=   (Page<Postion>) postionMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Postion postion) {
		postionMapper.insert(postion);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Postion postion){
		postionMapper.updateByPrimaryKey(postion);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Postion findOne(int id){
		return postionMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(int[] ids) {
		for(int id:ids){
			postionMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(Postion postion, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		PostionExample example=new PostionExample();
		Criteria criteria = example.createCriteria();
		
		if(postion!=null){			
						if(postion.getName()!=null && postion.getName().length()>0){
				criteria.andNameLike("%"+postion.getName()+"%");
			}
	
		}
		
		Page<Postion> page= (Page<Postion>)postionMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}

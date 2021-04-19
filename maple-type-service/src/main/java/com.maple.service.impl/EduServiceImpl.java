package com.maple.service.impl;
import java.util.List;

import com.maple.mapper.EduMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.maple.pojo.Edu;
import com.maple.pojo.EduExample;
import com.maple.pojo.EduExample.Criteria;
import com.maple.service.EduService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class EduServiceImpl implements EduService {

	@Autowired
	private EduMapper eduMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Edu> findAll() {
		return eduMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<Edu> page=   (Page<Edu>) eduMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Edu edu) {
		eduMapper.insert(edu);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Edu edu){
		eduMapper.updateByPrimaryKey(edu);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Edu findOne(int id){
		return eduMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(int[] ids) {
		for(int id:ids){
			eduMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(Edu edu, int pageNum, int pageSize,String name) {
		PageHelper.startPage(pageNum, pageSize);
		
		EduExample example=new EduExample();
		Criteria criteria = example.createCriteria();
		if(name!=null){
			criteria.andUseridEqualTo(name);
		}
		if(edu!=null){			
						if(edu.getUserid()!=null && edu.getUserid().length()>0){
				criteria.andUseridLike("%"+edu.getUserid()+"%");
			}
			if(edu.getEduname()!=null && edu.getEduname().length()>0){
				criteria.andEdunameLike("%"+edu.getEduname()+"%");
			}
			if(edu.getEdulevel()!=null && edu.getEdulevel().length()>0){
				criteria.andEdulevelLike("%"+edu.getEdulevel()+"%");
			}
			if(edu.getEdupro()!=null && edu.getEdupro().length()>0){
				criteria.andEduproLike("%"+edu.getEdupro()+"%");
			}
			if(edu.getContent()!=null && edu.getContent().length()>0){
				criteria.andContentLike("%"+edu.getContent()+"%");
			}
	
		}
		
		Page<Edu> page= (Page<Edu>)eduMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}

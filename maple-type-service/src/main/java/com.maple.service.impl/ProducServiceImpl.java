package com.maple.service.impl;
import java.util.List;

import com.maple.mapper.ProducMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.maple.pojo.Produc;
import com.maple.pojo.ProducExample;
import com.maple.pojo.ProducExample.Criteria;
import com.maple.service.ProducService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class ProducServiceImpl implements ProducService {

	@Autowired
	private ProducMapper producMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Produc> findAll() {
		return producMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<Produc> page=   (Page<Produc>) producMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Produc produc) {
		producMapper.insert(produc);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Produc produc){
		producMapper.updateByPrimaryKey(produc);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Produc findOne(int id){
		return producMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(int[] ids) {
		for(int id:ids){
			producMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(Produc produc, int pageNum, int pageSize,String name) {
		PageHelper.startPage(pageNum, pageSize);
		
		ProducExample example=new ProducExample();
		Criteria criteria = example.createCriteria();
		if(name!=null){
			criteria.andCompyidEqualTo(name);
		}
		if(produc!=null){			
						if(produc.getCompyid()!=null && produc.getCompyid().length()>0){
				criteria.andCompyidLike("%"+produc.getCompyid()+"%");
			}
			if(produc.getProduname()!=null && produc.getProduname().length()>0){
				criteria.andProdunameLike("%"+produc.getProduname()+"%");
			}
			if(produc.getProducontent()!=null && produc.getProducontent().length()>0){
				criteria.andProducontentLike("%"+produc.getProducontent()+"%");
			}
			if(produc.getProduurl()!=null && produc.getProduurl().length()>0){
				criteria.andProduurlLike("%"+produc.getProduurl()+"%");
			}
			if(produc.getProdupic()!=null && produc.getProdupic().length()>0){
				criteria.andProdupicLike("%"+produc.getProdupic()+"%");
			}
	
		}
		
		Page<Produc> page= (Page<Produc>)producMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}

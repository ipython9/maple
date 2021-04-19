package com.maple.service.impl;
import java.util.List;

import com.maple.mapper.CompyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.maple.pojo.Compy;
import com.maple.pojo.CompyExample;
import com.maple.pojo.CompyExample.Criteria;
import com.maple.service.CompyService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class CompyServiceImpl implements CompyService {

	@Autowired
	private CompyMapper compyMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Compy> findAll() {
		return compyMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<Compy> page=   (Page<Compy>) compyMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Compy compy) {
		compyMapper.insert(compy);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Compy compy){
		compyMapper.updateByPrimaryKey(compy);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Compy findOne(int id){
		return compyMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(int[] ids) {
		for(int id:ids){
			compyMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(Compy compy, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		CompyExample example=new CompyExample();
		Criteria criteria = example.createCriteria();
		
		if(compy!=null){
						if(compy.getCompyid()!=null && compy.getCompyid().length()>0){
				criteria.andCompyidLike("%"+compy.getCompyid()+"%");
			}
			if(compy.getCompyname()!=null && compy.getCompyname().length()>0){
				criteria.andCompynameLike("%"+compy.getCompyname()+"%");
			}
			if(compy.getPassword()!=null && compy.getPassword().length()>0){
				criteria.andPasswordLike("%"+compy.getPassword()+"%");
			}
			if(compy.getPicpath()!=null && compy.getPicpath().length()>0){
				criteria.andPicpathLike("%"+compy.getPicpath()+"%");
			}
			if(compy.getRegaddress()!=null && compy.getRegaddress().length()>0){
				criteria.andRegaddressLike("%"+compy.getRegaddress()+"%");
			}
			if(compy.getCard1()!=null && compy.getCard1().length()>0){
				criteria.andCard1Like("%"+compy.getCard1()+"%");
			}
			if(compy.getCard2()!=null && compy.getCard2().length()>0){
				criteria.andCard2Like("%"+compy.getCard2()+"%");
			}
			if(compy.getRandom1()!=null && compy.getRandom1().length()>0){
				criteria.andRandom1Like("%"+compy.getRandom1()+"%");
			}
			if(compy.getPerson()!=null && compy.getPerson().length()>0){
				criteria.andPersonLike("%"+compy.getPerson()+"%");
			}
			if(compy.getIntoduction()!=null && compy.getIntoduction().length()>0){
				criteria.andIntoductionLike("%"+compy.getIntoduction()+"%");
			}
			if(compy.getJurisname()!=null && compy.getJurisname().length()>0){
				criteria.andJurisnameLike("%"+compy.getJurisname()+"%");
			}
			if(compy.getJuriscontent()!=null && compy.getJuriscontent().length()>0){
				criteria.andJuriscontentLike("%"+compy.getJuriscontent()+"%");
			}
			if(compy.getJurispic()!=null && compy.getJurispic().length()>0){
				criteria.andJurispicLike("%"+compy.getJurispic()+"%");
			}
			if(compy.getStatus()!=null){
							criteria.andStatusEqualTo(compy.getStatus());
			}

	
		}
		
		Page<Compy> page= (Page<Compy>)compyMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}

	@Override
	public void updateStatus(int id, int status) {

		Compy compy = compyMapper.selectByPrimaryKey(id);
		compy.setStatus(status);
		compyMapper.updateByPrimaryKey(compy);
	}

	@Override
	public Compy findoneBycompyid(String compyid) {
		CompyExample compyExample = new CompyExample();
		CompyExample.Criteria criteria = compyExample.createCriteria();
		criteria.andCompyidEqualTo(compyid);
		return  compyMapper.selectByExample(compyExample).get(0);
	}

	@Override
	public void updatePic(int id,String pic) {
		Compy compy = compyMapper.selectByPrimaryKey(id);
		compy.setPicpath(pic);
		System.out.println(pic);
		compyMapper.updateByPrimaryKey(compy);
	}
}

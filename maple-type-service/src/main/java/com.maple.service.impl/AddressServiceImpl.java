package com.maple.service.impl;
import java.util.List;

import com.maple.mapper.AddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.maple.pojo.Address;
import com.maple.pojo.AddressExample;
import com.maple.pojo.AddressExample.Criteria;
import com.maple.service.AddressService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressMapper addressMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Address> findAll() {
		return addressMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<Address> page=   (Page<Address>) addressMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Address address) {
		addressMapper.insert(address);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Address address){
		addressMapper.updateByPrimaryKey(address);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Address findOne(int id){
		return addressMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(int[] ids) {
		for(int id:ids){
			addressMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(Address address, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		AddressExample example=new AddressExample();
		Criteria criteria = example.createCriteria();
		
		if(address!=null){			
						if(address.getName()!=null && address.getName().length()>0){
				criteria.andNameLike("%"+address.getName()+"%");
			}
	
		}
		
		Page<Address> page= (Page<Address>)addressMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}

package com.maple.service;

import com.maple.pojo.Workdata;
import entity.PageResult;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface WorkDataService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<Workdata> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(Workdata Workdata);
	
	
	/**
	 * 修改
	 */
	public void update(Workdata Workdata);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public Workdata findOne(int id);
	
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(int[] ids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(Workdata Workdata, int pageNum, int pageSize,String name);
	
}

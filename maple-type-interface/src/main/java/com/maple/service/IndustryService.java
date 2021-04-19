package com.maple.service;
import java.util.List;

import com.maple.pojo.Industry;

import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface IndustryService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<Industry> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(Industry industry);
	
	
	/**
	 * 修改
	 */
	public void update(Industry industry);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public Industry findOne(int id);
	
	
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
	public PageResult findPage(Industry industry, int pageNum, int pageSize);
	
}

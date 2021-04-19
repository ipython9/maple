package com.maple.service;
import java.util.List;
import com.maple.pojo.Pratice;

import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface PraticeService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<Pratice> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(Pratice pratice);
	
	
	/**
	 * 修改
	 */
	public void update(Pratice pratice);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public Pratice findOne(Long id);
	
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Long[] ids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(Pratice pratice, int pageNum, int pageSize,String name);
	
}

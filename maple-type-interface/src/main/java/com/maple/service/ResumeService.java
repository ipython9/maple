package com.maple.service;
import java.util.List;
import com.maple.pojo.Resume;

import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface ResumeService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<Resume> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(Resume resume);
	
	
	/**
	 * 修改
	 */
	public void update(Resume resume);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public Resume findOne(int id);
	
	
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
	public PageResult findPage(Resume resume, int pageNum, int pageSize,String name);

	public Resume findOneByuserid(String userid);
}

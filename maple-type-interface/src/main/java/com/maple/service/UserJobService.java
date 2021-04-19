package com.maple.service;

import com.maple.pojo.Userjob;
import entity.PageResult;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface UserJobService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<Userjob> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(Userjob userjob);
	
	
	/**
	 * 修改
	 */
	public void update(Userjob userjob);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public Userjob findOne(int id);
	
	
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
	public PageResult findPage(Userjob userjob, int pageNum, int pageSize,String name);

	public PageResult findUserPage(Userjob userjob, int page, int rows,String name);

    void updateUserJobStatus(int jobid, String userid, String createuserid);
}

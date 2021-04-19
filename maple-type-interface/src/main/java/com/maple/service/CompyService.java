package com.maple.service;
import java.util.List;
import com.maple.pojo.Compy;

import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface CompyService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<Compy> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(Compy compy);
	
	
	/**
	 * 修改
	 */
	public void update(Compy compy);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public Compy findOne(int id);
	
	
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
	public PageResult findPage(Compy compy, int pageNum, int pageSize);

	/**
	 * 更新审核状态
	 * @param id
	 * @param status
	 */
	public void updateStatus(int id,int status) ;


	public Compy findoneBycompyid(String compyid);

	public void updatePic(int id,String pic) ;

}

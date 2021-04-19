package com.maple.service;
import java.util.List;
import com.maple.pojo.Address;
import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface AddressService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<Address> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(Address address);
	
	
	/**
	 * 修改
	 */
	public void update(Address address);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public Address findOne(int id);
	
	
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
	public PageResult findPage(Address address, int pageNum, int pageSize);
	
}

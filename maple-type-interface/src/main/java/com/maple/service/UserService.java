package com.maple.service;
import java.util.List;

import com.maple.pojo.Compy;
import com.maple.pojo.Job;
import com.maple.pojo.User;

import com.maple.pojo.Workdata;
import entity.*;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface UserService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<User> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(User user);
	
	
	/**
	 * 修改
	 */
	public void update(User user);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public User findOne(Long id);
	
	
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
	public PageResult findPage(User user,int pageNum,int pageSize,String name);


	/**
	 * 更新shi否为boss
	 * @param id
	 * @param status
	 */
	public void updateRolereq(Long id,String  rolereq) ;

	public void updateStatus(Long id,String status);

	public User findoneByuserid(String userid);

	public ResumeModel findResumeModel(String name);

	public List<JobModel> findJobModel();

	public List<BusModel> findCompyModel();

	public BusModel findOneCompyModel(int id);

	public  List<JobModel> findJobModel(int id);



	public PageResult findJobPage(Job user,int pageNum,int pageSize,String name);

	public PageResult findCompyPage(Compy Compy, int pageNum, int pageSize, String name);

	public PageResult findWorkdataPage(Workdata workdata, int pageNum, int pageSize, String name);

	public DataModel findOneDataModel(int id);
	ResumeModel finddataResume(String name);
}

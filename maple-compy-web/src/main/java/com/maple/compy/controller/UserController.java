package com.maple.compy.controller;

import org.apache.dubbo.config.annotation.Reference;
import com.maple.pojo.User;
import com.maple.service.UserService;
import entity.PageResult;
import entity.Result;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@Reference
	private UserService userService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<User> findAll(){			
		return userService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return userService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param user
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody User user){
		try {
			user.setCreatedate(new Date());
			userService.add(user);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param user
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody User user){
		try {
			userService.update(user);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}	
	
	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	public User findOne(Long id){
		return userService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			userService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody User user, int page, int rows  ){
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		return userService.findPage(user, page, rows,name);
	}




	@RequestMapping("/updateStatus")
	public Result updateStatus(long id, String status){
		try {
			userService.updateStatus(id, status);
			return new Result(true, "审核状态成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "审核状态失败");
		}
	}


	@RequestMapping("/updateRolereq")
	public Result updateRolereq(long id, String rolereq){
		try {
			userService.updateRolereq(id, rolereq);
			return new Result(true, "审核状态成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "审核状态失败");
		}
	}
}

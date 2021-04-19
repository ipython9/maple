package com.maple.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.maple.pojo.Job;
import com.maple.pojo.User;
import com.maple.pojo.Userjob;
import com.maple.service.UserJobService;
import entity.PageResult;
import entity.Result;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/userjob")
public class UserjobController {

	@Reference
	private UserJobService UserjobService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<Userjob> findAll(){			
		return UserjobService.findAll();
	}



	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return UserjobService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param userjob
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody Userjob userjob){
		try {
			userjob.setCreatetime(new Date());
			UserjobService.add(userjob);
			return new Result(true, "投递简历成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "投递简历失败");
		}
	}
	@RequestMapping("/addOne")
	public Result addOne(String userid,int jobid,String createuserid){
		Userjob userjob = new Userjob();
		userjob.setJobid(jobid);
		userjob.setCreateuserid(createuserid);
		userjob.setUserid(userid);
		userjob.setStatus("未回复");
		try {
			userjob.setCreatetime(new Date());
			UserjobService.add(userjob);
			return new Result(true, "投递简历成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "投递简历失败");
		}
	}
	/**
	 * 修改
	 * @param userjob
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody Userjob userjob){
		try {
			UserjobService.update(userjob);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}
	@RequestMapping("/updateUserJobStatus")
	public Result updateUserJobStatus(@RequestParam("jobid") int jobid,@RequestParam("userid") String userid){
		String createuserid = SecurityContextHolder.getContext().getAuthentication().getName();
		try {
			UserjobService.updateUserJobStatus(jobid , userid,createuserid);
			return new Result(true, "通知成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "通知失败");
		}
	}
	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	public Userjob findOne(int id){
		return UserjobService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(int[] ids){
		try {
			UserjobService.delete(ids);
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
	public PageResult search(@RequestBody Userjob userjob, int page, int rows){
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		return UserjobService.findPage(userjob, page, rows,name);
	}


	@RequestMapping("/searchUser")
	public PageResult searchUser(@RequestBody Userjob userjob, int page, int rows ){
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		return UserjobService.findUserPage(userjob, page, rows,name);
	}
	
}

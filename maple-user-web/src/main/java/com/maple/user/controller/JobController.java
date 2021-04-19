package com.maple.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.maple.pojo.Job;
import com.maple.pojo.User;
import com.maple.service.JobService;
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
@RequestMapping("/job")
public class JobController {

	@Reference
	private JobService jobService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<Job> findAll(){			
		return jobService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return jobService.findPage(page, rows);
	}

	@Reference
	private UserService userService;
	/**
	 * 增加
	 * @param job
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody Job job){
		try {
			String name = SecurityContextHolder.getContext().getAuthentication().getName();
			 User user = userService.findoneByuserid(name);
			 job.setUserid(user.getUserid());
			 if(user.getCompid()==null){
				 return new Result(false, "对不起你没有发布职位权限 请先进行公司HR审核");
			 }
			 job.setCompid(user.getCompid());
			 job.setCreatine(new Date());
			jobService.add(job);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param job
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody Job job){
		try {
			jobService.update(job);
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
	public Job findOne(int id){
		return jobService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(int [] ids){
		try {
			jobService.delete(ids);
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
	public PageResult search(@RequestBody Job job, int page, int rows  ){
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		return jobService.findPage(job, page, rows,name);
	}
	
}

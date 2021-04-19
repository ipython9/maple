package com.maple.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.maple.pojo.Project;
import com.maple.service.ProjectService;
import com.maple.service.UserService;
import entity.PageResult;
import entity.Result;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/project")
public class ProjectController {

	@Reference
	private ProjectService projectService;
	@Reference
	private UserService userService;
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<Project> findAll(){			
		return projectService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return projectService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param project
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody Project project){
		try {
			String name = SecurityContextHolder.getContext().getAuthentication().getName();
			String  id = userService.findoneByuserid(name).getUserid();
			project.setUserid(id);
			projectService.add(project);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param project
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody Project project){
		try {
			projectService.update(project);
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
	public Project findOne(int id){
		return projectService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(int [] ids){
		try {
			projectService.delete(ids);
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
	public PageResult search(@RequestBody Project project, int page, int rows  ){
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		return projectService.findPage(project, page, rows,name);
	}
	
}

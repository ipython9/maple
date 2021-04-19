package com.maple.manage.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.maple.service.CompyService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.maple.pojo.Compy;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/compy")
public class CompyController {

	@Reference
	private CompyService compyService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<Compy> findAll(){			
		return compyService.findAll();
	}


	/**
	 * 获取登陆名称
	 * @return
	 */
	@RequestMapping("/name")
	public Map showName(){
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		Map map=new HashMap();
		map.put("loginName", name);
		return map;
	}
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return compyService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param compy
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody Compy compy){
		try {
			compyService.add(compy);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param compy
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody Compy compy){
		try {
			compyService.update(compy);
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
	public Compy findOne(int  id){
		return compyService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(int [] ids){
		try {
			compyService.delete(ids);
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
	public PageResult search(@RequestBody Compy compy, int page, int rows  ){
		return compyService.findPage(compy, page, rows);		
	}


	@RequestMapping("/updateStatus")
	public Result updateStatus(int id, int status){
		try {
			compyService.updateStatus(id, status);
			return new Result(true, "审核状态成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "审核状态失败");
		}
	}
}

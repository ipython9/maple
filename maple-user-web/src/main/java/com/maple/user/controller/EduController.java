package com.maple.user.controller;

import org.apache.dubbo.config.annotation.Reference;
import com.maple.pojo.Edu;
import com.maple.service.EduService;
import com.maple.service.UserService;
import entity.PageResult;
import entity.Result;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utils.DateConvert;

import java.util.List;

/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/edu")
public class EduController {

	@Reference
	private EduService eduService;
	@Reference
	private UserService userService;
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<Edu> findAll(){			
		return eduService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return eduService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param edu
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody Edu edu){
//		DateConvert dateConvert =new DateConvert();
		try {

			String name = SecurityContextHolder.getContext().getAuthentication().getName();
			String  id = userService.findoneByuserid(name).getUserid();
			edu.setUserid(id);
//			edu.setStartdate(dateConvert.convert(statrdate));
//			edu.setEnddate(dateConvert.convert(enddate));
			eduService.add(edu);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param edu
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody Edu edu){
		try {
			eduService.update(edu);
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
	public Edu findOne(int id){
		return eduService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(int  [] ids){
		try {
			eduService.delete(ids);
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
	public PageResult search(@RequestBody Edu edu, int page, int rows  ){
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		return eduService.findPage(edu, page, rows,name);
	}
	
}

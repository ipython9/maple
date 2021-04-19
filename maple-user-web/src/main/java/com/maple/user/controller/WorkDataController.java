package com.maple.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.maple.pojo.Workdata;
import com.maple.service.WorkDataService;
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
@RequestMapping("/workdata")
public class WorkDataController {

	@Reference
	private WorkDataService WorkdataService;
	@Reference
	private UserService userService;
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<Workdata> findAll(){			
		return WorkdataService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return WorkdataService.findPage(page, rows);
	}
	
//	/**
//	 * 增加
//	 * @param Workdata
//	 * @return
//	 */
//	@RequestMapping("/add")
//	public Result add(@RequestBody Workdata Workdata){
////		DateConvert dateConvert =new DateConvert();
//		try {
//
//			String name = SecurityContextHolder.getContext().getAuthentication().getName();
//			String  id = userService.findoneByuserid(name).getUserid();
//			Workdata.setUserid(id);
////			Workdata.setStartdate(dateConvert.convert(statrdate));
////			Workdata.setEnddate(dateConvert.convert(enddate));
//			WorkdataService.add(Workdata);
//			return new Result(true, "增加成功");
//		} catch (Exception e) {
//			e.printStackTrace();
//			return new Result(false, "增加失败");
//		}
//	}
	
	/**
	 * 修改
	 * @param Workdata
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody Workdata Workdata){
		try {
			WorkdataService.update(Workdata);
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
	public Workdata findOne(int id){
		return WorkdataService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(int  [] ids){
		try {
			WorkdataService.delete(ids);
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
	public PageResult search(@RequestBody Workdata Workdata, int page, int rows  ){
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		return WorkdataService.findPage(Workdata, page, rows,name);
	}
	
}

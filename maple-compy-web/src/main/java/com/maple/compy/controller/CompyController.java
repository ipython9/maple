package com.maple.compy.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.maple.pojo.Compy;
import com.maple.pojo.Industry;
import com.maple.service.CompyService;
import com.maple.service.IndustryService;
import entity.PageResult;
import entity.Result;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		String name1 = compyService.findoneBycompyid(name).getCompyname();
		Map map=new HashMap();
		map.put("loginName", name1);
		map.put("entity",compyService.findoneBycompyid(name));
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
		BCryptPasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
		String password = passwordEncoder.encode(compy.getPassword());//加密
		compy.setPassword(password);
		try {
			compy.setCreatime(new Date());
			compy.setStatus(0);
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
	@RequestMapping("/updatePic")
		public Result updatePic(String  pic){
		try {
			String name = SecurityContextHolder.getContext().getAuthentication().getName();
			int id = compyService.findoneBycompyid(name).getId();
			compyService.updatePic(id, pic);
			return new Result(true, "图片更改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "图片更改失败");
		}
	}
	@Reference
	private IndustryService industryService;

	@RequestMapping("/findindustry")
	public List<Industry> findindustry(){
		return industryService.findAll();
	}


}

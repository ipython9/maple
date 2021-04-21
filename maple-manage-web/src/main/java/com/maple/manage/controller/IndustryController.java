package com.maple.manage.controller;
import java.util.List;

import com.maple.service.IndustryService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.dubbo.config.annotation.Reference;
import com.maple.pojo.Industry;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/industry")
public class IndustryController {

	@Reference
	private IndustryService industryService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<Industry> findAll(){			
		return industryService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return industryService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param industry
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody Industry industry){
		try {
			industryService.add(industry);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param industry
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody Industry industry){
		try {
			industryService.update(industry);
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
	public Industry findOne(int id){
		return industryService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(int [] ids){
		try {
			industryService.delete(ids);
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
	public PageResult search(@RequestBody Industry industry, int page, int rows  ){
		return industryService.findPage(industry, page, rows);		
	}
	
}

package com.maple.manage.controller;
import java.util.List;

import com.maple.service.ResumeService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.maple.pojo.Resume;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/resume")
public class ResumeController {

	@Reference
	private ResumeService resumeService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<Resume> findAll(){			
		return resumeService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return resumeService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param resume
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody Resume resume){
		try {
			resumeService.add(resume);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param resume
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody Resume resume){
		try {
			resumeService.update(resume);
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
	public Resume findOne(int id){
		return resumeService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(int [] ids){
		try {
			resumeService.delete(ids);
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
	public PageResult search(@RequestBody Resume resume, int page, int rows  ){
		String name=null;
		return resumeService.findPage(resume, page, rows,name);
	}
	
}

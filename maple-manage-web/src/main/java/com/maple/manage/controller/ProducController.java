package com.maple.manage.controller;
import java.util.List;

import com.maple.service.ProducService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.dubbo.config.annotation.Reference;
import com.maple.pojo.Produc;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/produc")
public class ProducController {

	@Reference
	private ProducService producService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<Produc> findAll(){			
		return producService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return producService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param produc
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody Produc produc){
		try {
			producService.add(produc);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param produc
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody Produc produc){
		try {
			producService.update(produc);
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
	public Produc findOne(int id){
		return producService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(int [] ids){
		try {
			producService.delete(ids);
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
	public PageResult search(@RequestBody Produc produc, int page, int rows  ){
		String name=null;
		return producService.findPage(produc, page, rows,name);
	}
	
}

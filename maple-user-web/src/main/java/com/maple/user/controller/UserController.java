package com.maple.user.controller;

import org.apache.dubbo.config.annotation.Reference;
import com.maple.pojo.Compy;
import com.maple.pojo.Job;
import com.maple.pojo.User;
import com.maple.pojo.Workdata;
import com.maple.service.CompyService;
import com.maple.service.JobService;
import com.maple.service.UserService;
import entity.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/user")
public class  UserController {
	private static final Logger logger =  LoggerFactory.getLogger(DataController.class);
	@Reference
	private UserService userService;

	@Reference
	private CompyService compyService;

	@Reference
	private JobService jobService;
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<User> findAll(){

		return userService.findAll();
	}

	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){
		return userService.findPage(page, rows);
	}

	/**
	 * 增加
	 * @param user
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody User user){
		logger.error("name");
		BCryptPasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
		String password = passwordEncoder.encode(user.getPassword());//加密
		user.setPassword(password);
		try {
			user.setRolereq("0");
			user.setStatus("0");
			userService.add(user);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}

	/**
	 * 修改
	 * @param user
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody User user){
		try {
			userService.update(user);
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
	public User findOne(Long id){
		return userService.findOne(id);
	}

	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			userService.delete(ids);
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
	public PageResult search(@RequestBody User user, int page, int rows  ){
		String name=null;
		try {
			return userService.findPage(user, page, rows,name);
		}catch (Exception e){
			logger.error("cuowu{}",e.getMessage());
		}
		return null;
	}

	@RequestMapping("/searchJob")
	public PageResult search(@RequestBody Job job,int page, int rows ){
		String name=null;
		return userService.findJobPage(job, page, rows,name);
	}
	@RequestMapping("/searchCompy")
	public PageResult search(@RequestBody Compy compy,int page, int rows ){
		String name=null;
		return userService.findCompyPage(compy, page, rows,name);
	}
	@RequestMapping("/searchData")
	public PageResult search(@RequestBody Workdata workdata, int page, int rows ){
		String name=null;
		return userService.findWorkdataPage(workdata, page, rows,name);
	}
	@RequestMapping("/name")
	public Map showName(){
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		String name1 = userService.findoneByuserid(name).getUsername();
		Map map=new HashMap();
		map.put("loginName", name1);
		map.put("entity",userService.findoneByuserid(name));
		return map;
	}

	@RequestMapping("/ResumeModel")
	public ResumeModel getModel(){
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		return userService.findResumeModel(name);
	}

	@RequestMapping("/findResumeModel")
	public ResumeModel findgetModel(@RequestParam("userid") String userid){
		return userService.findResumeModel(userid);
	}

	@RequestMapping("/finddataModel")
	public ResumeModel finddataModel(@RequestParam("userid") String userid){
		return userService.finddataResume(userid);
	}

	@RequestMapping("/JobModel")
	public List<JobModel> getJobModel(){
		return userService.findJobModel();
	}
	@RequestMapping("/CompyModel")
	public List<BusModel> getCompyModel(){
		return userService.findCompyModel();
	}

	@RequestMapping("/jobdetail")
	public ModelAndView jobdetail(int id){
		ModelAndView modelAndView= new ModelAndView();
		Job job = jobService.findOne(id);
		User user1 = userService.findoneByuserid(job.getUserid());
		Compy compy = compyService.findoneBycompyid(job.getCompid());
		modelAndView.addObject("job",job);
		modelAndView.addObject("cm",compy);
		modelAndView.addObject("user1",user1);

		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		User user = userService.findoneByuserid(name);
		modelAndView.addObject("user",user);
		modelAndView.setViewName("jobdetail");
		return modelAndView;
	}

	@RequestMapping("/compydetail")
	public ModelAndView compydetail(int id){
		ModelAndView modelAndView= new ModelAndView();
		modelAndView.addObject("busModel",userService.findOneCompyModel(id));
		modelAndView.addObject("jobs",userService.findJobModel(id));
		modelAndView.setViewName("compydetail");
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		User user = userService.findoneByuserid(name);
		modelAndView.addObject("user",user);
		return modelAndView;
	}
	@RequestMapping("/datadetail")
	public DataModel datadetail(int id){
		return userService.findOneDataModel(id);
	}
}

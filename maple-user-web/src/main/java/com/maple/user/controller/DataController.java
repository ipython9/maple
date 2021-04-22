package com.maple.user.controller;

import org.apache.dubbo.config.annotation.Reference;
import com.maple.pojo.Job;
import com.maple.pojo.Workdata;
import com.maple.service.DataService;
import com.maple.service.JobService;
import com.maple.service.WorkDataService;
import entity.PageResult;
import entity.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @Author:
 * @Description:
 * @Date: Create in 21:00 2019/4/17
 */
@RestController
@RequestMapping("/data")
public class DataController {
    @Reference
    private JobService jobService;
    @Reference
    private DataService dataService;
    @Reference
    private WorkDataService workDataService;

    private static final Logger logger =  LoggerFactory.getLogger(DataController.class);
    @RequestMapping("/findAll")
    public List<Job> findAll(){
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        return jobService.findAll(name);
    }
    @RequestMapping("/findSize")
    public int findSize(@RequestParam("jobid") int jobid){
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        return dataService.findSize(jobid,name);
    }
    @RequestMapping("/add")
    public Result add(@RequestBody Workdata workdata){
        try {

            String name = SecurityContextHolder.getContext().getAuthentication().getName();
            workdata.setCreatedate(new Date());
            workdata.setUserid(name);
            workDataService.add(workdata);
            return new Result(true, "发布成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "发布失败");
        }
    }
    @RequestMapping("/addtask")
    public Result addtask(@RequestParam("id") int id,@RequestParam("num") int num){
        try {
            String name = SecurityContextHolder.getContext().getAuthentication().getName();
            dataService.addUserData(id,num,name);
            return new Result(true, "申请成功，请去控制台完成任务");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "申请失败");
        }
    }
    @RequestMapping("searchOneData")
    public PageResult searchOneData(@RequestBody Workdata workdata,int page,int rows){
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        return dataService.selectOneUserWork(workdata,page,rows,name);
    }
    @RequestMapping("findResume")
    public PageResult findResume(@RequestParam("num") int num,@RequestParam("startnum") int startnum,@RequestParam("id") int id,int page,int rows){
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        return dataService.findResume(num,startnum,id,page,rows,name);
    }
    @RequestMapping("/updateUserJobStatus")
    public Result updateUserJobStatus(@RequestParam("id") int id,@RequestParam("status") int status){
        try {
           dataService.updateUserJobStatus(id ,status);
            return new Result(true, "推荐成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "推荐失败");
        }
    }

    //推荐简历查询
    @RequestMapping("findRecommendResume")
    public PageResult findRecommendResume(@RequestParam("id") int id,int page,int rows){
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        return dataService.findRecommendResume(id,page,rows,name);
    }
}

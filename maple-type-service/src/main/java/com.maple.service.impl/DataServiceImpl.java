package com.maple.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.maple.mapper.*;
import com.maple.pojo.*;
import com.maple.service.DataService;
import entity.DataModel;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:
 * @Description:
 * @Date: Create in 21:24 2019/4/17
 */
@Service
public class DataServiceImpl implements DataService {

    @Autowired
    private UserjobMapper userjobMapper;
    @Override
    public int findSize(int jobid,String name) {
        UserjobExample userjobExample = new UserjobExample();
        UserjobExample.Criteria criteria = userjobExample.createCriteria();
        criteria.andJobidEqualTo(jobid);
        criteria.andCreateuseridEqualTo(name);
        List<Userjob> userjobs = userjobMapper.selectByExample(userjobExample);
        return userjobs.size();
    }

    @Autowired
    private WorkdataMapper workdataMapper;
    @Autowired
    private UserdataMapper userdataMapper;
    @Override
    public void addUserData(int id, int num, String name) {
        Userdata userdata= new Userdata();
        userdata.setDataid(id);
        userdata.setNum(num);
        userdata.setUserid(name);
        userdata.setStartnum( workdataMapper.selectByPrimaryKey(id).getStartnum());
        userdataMapper.insert(userdata);
        Workdata workdata = workdataMapper.selectByPrimaryKey(id);
        workdata.setNum(workdata.getNum()-num);
        workdata.setStartnum(workdata.getStartnum()+num);
        workdataMapper.updateByPrimaryKey(workdata);
    }
    @Autowired
    private JobMapper jobMapper;
    @Override
    public PageResult selectOneUserWork(Workdata workdata, int page, int rows, String name) {
        PageHelper.startPage(page, rows);
        //查询用户的个人接收的任务
        UserdataExample userdataExample = new UserdataExample();
        UserdataExample.Criteria criteria = userdataExample.createCriteria();
        criteria.andUseridEqualTo(name);
        List<Userdata> userdatas = userdataMapper.selectByExample(userdataExample);
        List<DataModel> dataModels  = new ArrayList<DataModel>();
        for(Userdata userdata:userdatas){
            DataModel dataModel=new DataModel();
           Workdata workdata1 = workdataMapper.selectByPrimaryKey(userdata.getDataid());
           Job job = jobMapper.selectByPrimaryKey(workdata1.getJobid());
           dataModel.setWorkdata(workdata1);
           dataModel.setJob(job);
           dataModel.setNum(userdata.getNum());
           dataModel.setStartnum(userdata.getStartnum());
            dataModels.add(dataModel);

        }
        PageInfo orderPageInfo = new PageInfo(userdatas);
        orderPageInfo.setList(dataModels);
        orderPageInfo.setTotal(dataModels.size());
        return new PageResult(orderPageInfo.getTotal(), orderPageInfo.getList());
    }

    @Autowired
    private ResumesplitMapper resumesplitMapper;
    @Override
    public PageResult findResume(int num, int startnum, int id, int page, int rows, String name) {
        PageHelper.startPage(page, rows);
        List<Resumesplit> list=new ArrayList<Resumesplit>();
        int i=1;
        //num 是数量任务包数量   startnum是开始的地方 每包数量不知道
        while(i<=num){
            ResumesplitExample resumesplitExample = new ResumesplitExample();
            ResumesplitExample.Criteria criteria=resumesplitExample.createCriteria();
            criteria.andDataidEqualTo(id);
            criteria.andStatusEqualTo(startnum);
            List<Resumesplit> list1 = resumesplitMapper.selectByExample(resumesplitExample);
            for(Resumesplit r:list1){
                list.add(r);
            }
            startnum++;
            i++;
        }
        PageInfo orderPageInfo = new PageInfo(list);
        orderPageInfo.setList(list);
        orderPageInfo.setTotal(list.size());
        return new PageResult(orderPageInfo.getTotal(), orderPageInfo.getList());
    }

    @Override
    public void updateUserJobStatus(int id, int status) {
       Resumesplit resumesplit =  resumesplitMapper.selectByPrimaryKey(id);
       resumesplit.setRecomend(status);
        resumesplitMapper.updateByPrimaryKey(resumesplit);
    }

    @Override
    public PageResult findRecommendResume(int id,int page, int rows,String name) {
        PageHelper.startPage(page, rows);
            //查询推荐的简历信息
            ResumesplitExample resumesplitExample  = new ResumesplitExample();
            ResumesplitExample.Criteria criteria1 =resumesplitExample.createCriteria();
            criteria1.andDataidEqualTo(id);
            criteria1.andRecomendEqualTo(1);
            //得到推荐的简历信息
            Page<Resumesplit> page1=(Page<Resumesplit>) resumesplitMapper.selectByExample(resumesplitExample);
             return new PageResult(page1.getTotal(), page1.getResult());
    }
}

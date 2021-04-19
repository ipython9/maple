package com.maple.service;

import com.maple.pojo.Workdata;
import entity.PageResult;

/**
 * @Author:
 * @Description:
 * @Date: Create in 21:25 2019/4/17
 */
public interface DataService {
     int findSize(int jobid,String name);
     void addUserData(int id,int num,String name);

    PageResult selectOneUserWork(Workdata workdata, int page, int rows, String name);

    PageResult findResume(int num, int startnum, int id, int page, int rows, String name);

    void updateUserJobStatus(int id, int status);

    PageResult findRecommendResume(int id,int page, int rows,String name);
}

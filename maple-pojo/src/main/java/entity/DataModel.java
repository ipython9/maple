package entity;

import com.maple.pojo.Job;
import com.maple.pojo.Workdata;

import java.io.Serializable;

/**
 * @Author:
 * @Description:
 * @Date: Create in 23:28 2019/4/17
 */
public class DataModel implements Serializable {
    private Job job;
    private Workdata workdata;
    //领取的任务报数
    private int num;
    //开始的索引
    private int startnum;

    public int getStartnum() {
        return startnum;
    }

    public void setStartnum(int startnum) {
        this.startnum = startnum;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Workdata getWorkdata() {
        return workdata;
    }

    public void setWorkdata(Workdata workdata) {
        this.workdata = workdata;
    }
}

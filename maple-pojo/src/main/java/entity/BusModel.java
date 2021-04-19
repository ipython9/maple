package entity;

import com.maple.pojo.Compy;
import com.maple.pojo.Job;
import com.maple.pojo.Produc;
import com.maple.pojo.User;

import java.io.Serializable;
import java.util.List;

/**
 * @Author:
 * @Description:
 * @Date: Create in 20:28 2019/3/26
 */
public class BusModel extends Compy implements Serializable  {
    private int hrcount;
    private int jobcount;
    private List<User> users;
    private List<Job> jobs;
    private  List<Produc> producs;

    public void setProducs(List<Produc> producs) {
        this.producs = producs;
    }

    public List<Produc> getProducs() {
        return producs;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Job> getJobs() {
        return jobs;
    }



    public void setHrcount(int hrcount) {
        this.hrcount = hrcount;
    }

    public void setJobcount(int jobcount) {
        this.jobcount = jobcount;
    }


    public int getHrcount() {
        return hrcount;
    }

    public int getJobcount() {
        return jobcount;
    }
}

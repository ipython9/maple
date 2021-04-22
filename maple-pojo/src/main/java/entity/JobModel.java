package entity;

import com.maple.pojo.Compy;
import com.maple.pojo.Job;
import com.maple.pojo.User;
import com.maple.pojo.Userjob;

import java.io.Serializable;
import java.util.List;

/**
 * @Author:
 * @Description:
 * @Date: Create in 17:42 2019/3/26
 */
public class JobModel  implements Serializable {
    private static final long serialVersionUID = 4625167939605773844L;
    private Job job;
    private Compy compy;
    private User user;
    private Userjob userjob;

    public Userjob getUserjob() {
        return userjob;
    }

    public void setUserjob(Userjob userjob) {
        this.userjob = userjob;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public void setCompy(Compy compy) {
        this.compy = compy;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Job getJob() {
        return job;
    }

    public Compy getCompy() {
        return compy;
    }

    public User getUser() {
        return user;
    }
}

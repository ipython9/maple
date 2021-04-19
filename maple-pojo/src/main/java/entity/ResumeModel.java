package entity;

import com.maple.pojo.*;

import java.io.Serializable;
import java.util.List;

/**
 * @Author:
 * @Description:
 * @Date: Create in 12:37 2019/3/26
 */
public class ResumeModel implements Serializable {
    private Resume resume;
    private String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    private List<Edu> eduList;
    private List<Pratice> praticeList;
    private List<Project> projectList;
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }

    public void setEduList(List<Edu> eduList) {
        this.eduList = eduList;
    }

    public void setPraticeList(List<Pratice> praticeList) {
        this.praticeList = praticeList;
    }

    public void setProjectList(List<Project> projectList) {
        this.projectList = projectList;
    }

    public Resume getResume() {
        return resume;
    }

    public List<Edu> getEduList() {
        return eduList;
    }

    public List<Pratice> getPraticeList() {
        return praticeList;
    }

    public List<Project> getProjectList() {
        return projectList;
    }
}

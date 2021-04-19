package pojo;

import com.maple.pojo.Compy;
import com.maple.pojo.User;

import java.io.Serializable;

/**
 * @Author:
 * @Description:
 * @Date: Create in 15:52 2019/3/21
 */
public class UserCustom implements Serializable {

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private Compy compy;

    public Compy getCompy() {
        return compy;
    }

    public void setCompy(Compy compy) {
        this.compy = compy;
    }
}

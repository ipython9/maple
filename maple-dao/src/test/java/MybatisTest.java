import com.maple.mapper.UserMapper;
import com.maple.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.swing.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author hanyu
 * @version 1.0
 * @description todo
 * @date 2021/4/22
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
//        "classpath:/spring/applicationContext-service.xml",
        "classpath:/spring/applicationContext-dao.xml"
})
public class MybatisTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void getUser(){
        List<User> users = userMapper.selectByExample(null);
        System.out.println(users);
    }
}

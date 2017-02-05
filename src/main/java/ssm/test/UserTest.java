package ssm.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ssm.api.UserService;
import ssm.model.User;
import ssm.service.UserServiceImp;

import javax.annotation.Resource;

/**
 * Created by JacieWu on 2016/12/25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-*.xml")
public class UserTest {

    @Autowired
    public UserServiceImp userServiceImp;

    @Test
    public void UserTest(){
        User user = userServiceImp.selectUser(1);
        System.out.println("userName="+user.getName());
        System.out.println("userAge="+user.getAge());
        System.out.println("userId="+user.getId());
    }
}

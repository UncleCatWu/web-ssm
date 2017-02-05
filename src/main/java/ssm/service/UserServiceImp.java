package ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.api.UserService;
import ssm.dao.UserMapper;
import ssm.model.User;

import javax.annotation.Resource;

/**
 * Created by JacieWu on 2016/12/25.
 */
@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User selectUser(Integer id) {

        User userResult = userMapper.selectByPrimaryKey(id);
        return userResult;
    }
}

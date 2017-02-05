package ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ssm.model.User;
import ssm.service.UserServiceImp;

/**
 * Created by JacieWu on 2016/12/25.
 */
@Controller
@RequestMapping(value = "/admin")
public class UserController {

    @Autowired
    private UserServiceImp userServiceImp;

    @RequestMapping(value = "/selectUser")
    @ResponseBody
    public User selectUser(Integer id) {
        User user = userServiceImp.selectUser(id);
        return user;
    }
}

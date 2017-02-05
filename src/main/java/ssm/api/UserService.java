package ssm.api;

import ssm.model.User;

/**
 * Created by JacieWu on 2016/12/25.
 */
public interface UserService {

    public User selectUser(Integer id);
}

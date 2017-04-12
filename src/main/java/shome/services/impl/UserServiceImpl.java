package shome.services.impl;

import shome.dao.UserDao;
import shome.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shome.services.UserService;

/**
 * @author danielvolkov94@gmail.com
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public boolean login(User user) {
        User existUser = userDao.getUserByLogin(user.getLogin());
        String password = user.getPassword();
        return password.equals(existUser.getPassword());
    }
}

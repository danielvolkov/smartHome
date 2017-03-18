package services.impl;

import dao.UserDao;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import services.UserService;

/**
 * Created by daniel on 2/7/17.
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

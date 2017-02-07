package services.impl;

import entity.User;
import org.springframework.stereotype.Service;
import services.UserService;

/**
 * Created by daniel on 2/7/17.
 */

@Service
public class UserServiceImpl implements UserService {
    @Override
    public boolean login(User user) {
        return false;
    }
}

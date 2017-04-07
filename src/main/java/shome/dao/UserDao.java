package shome.dao;

import shome.entity.User;

/**
 * @author danielvolkov94@gmail.com
 */
public interface UserDao {
    User getUserById(int id);
    User getUserByLogin(String login);
}

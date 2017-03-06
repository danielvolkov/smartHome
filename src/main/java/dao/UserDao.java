package dao;

import entity.User;

/**
 * @author danielvolkov94@gmail.com
 */
public interface UserDao {
    User getUserById(int id);
    User getUserByLogin(String login);
}

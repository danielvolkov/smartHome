package dao.impl;

import dao.UserDao;
import entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

/**
 * @author danielvolkov94@gmail.com
 */
@Repository
public class UserDaoImpl implements UserDao {

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private SessionFactory sessionFactory;

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public User getUserByLogin(String login) {
        Session session = this.sessionFactory.getCurrentSession();
        User user = (User) session.load(User.class, login);
        return user;
    }
}

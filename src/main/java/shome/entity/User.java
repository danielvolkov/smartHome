package shome.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * @author danielvolkov94@gmail.com
 */

@Entity
@Table(name = "users")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "user_id")
    private int userId;

    @Id
    @Column(name = "login", unique = true)
    private String login;
    @Column(name = "password")
    private String password;

    public User(){}


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}

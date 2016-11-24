package model.Entity;

import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * Created by daniel on 26/09/16.
 */

public class User {
    String login;
    String password;
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

    public void setPassword(String password) {
        this.password = password;
    }
}

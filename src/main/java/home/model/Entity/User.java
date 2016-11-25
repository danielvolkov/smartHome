package home.model.Entity;

import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * Created by daniel on 26/09/16.
 */

public class User {
   private String login;
   private String password;
   private boolean status;
    public User(){}

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

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

package home.model.entity;

/**
 *
 * @author danielvolkov94@gmail.com
 */

public class User {
    private String login;
    private String password;
    private String role;

    public User(){}

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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

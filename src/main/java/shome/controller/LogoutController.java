package shome.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 *
 * @author danielvolkov94@gmail.com
 */
@RestController
public class LogoutController {

    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    public String logout(HttpSession session){
        if(session != null) {
            session.invalidate();
        }
        return  "redirect:/";
    }
}

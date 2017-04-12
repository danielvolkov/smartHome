package shome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import shome.entity.User;
import shome.services.UserService;

/**
 *
 * @author danielvolkov94@gmail.com
 */
@RestController
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView login(@ModelAttribute User user, ModelAndView modelAndView){
        if(user != null) {
            if (userService.login(user)) {
                modelAndView.addObject(user.getLogin());
                modelAndView.setViewName("main");
            } else {
                modelAndView.setViewName("index");
            }
        }
        return modelAndView;
    }

    @ModelAttribute("user")
    public User createUser() {
        return new User();
    }
}

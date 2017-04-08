package shome.controller;

import org.springframework.web.bind.annotation.RestController;
import shome.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 *
 * @author danielvolkov94@gmail.com
 */

@RestController
public class IndexController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(User user, HttpSession session, ModelAndView model){

        if(session.isNew()) {
            ModelAndView modelAndView = new ModelAndView("index", "user", new User());
            return modelAndView;
        } else {
            User userCheck = (User) session.getAttribute("user");
            if (userCheck!=null){
                model.setViewName("main");
            }
            return model;
        }

    }
}


package controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import model.Air;
import model.User;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;


@Controller
@SessionAttributes("user")
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(@ModelAttribute("user") User user, HttpSession session, ModelAndView model){
        if(session.isNew()) {
            ModelAndView modelAndView = new ModelAndView("index", "user", new User());
            return modelAndView;
        }else {
            User usercheck = (User) session.getAttribute("user");
            if(usercheck.getLogin().equals("home")){
                model.setViewName("main");
            }
            else{
            model.setViewName("index");}
            return model;
        }

    }
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@ModelAttribute("user") User user,ModelAndView model){

        if(user.getLogin().equals("home") && user.getPassword().equals("pass")){
            model.addObject(user);
            return "redirect:/";
        }
        else{
            return "index";
        }
    }

    @ModelAttribute("user")
    public User createUser() {
        return new User();
    }
}

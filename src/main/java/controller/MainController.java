package controller;

import model.Entity.Air;
import model.Entity.Lighting;
import model.Entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
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
                Air air = AirController.getAir();
                //Lighting lighting = AirController.getLighting();
                model.addObject("temperature",air.getTemperature());
                model.addObject("humidity", air.getHumidity());
                //model.addObject("illumination",lighting.getIlluminatian());
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

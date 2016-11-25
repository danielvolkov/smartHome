package home.controller;

import home.model.Entity.User;
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
        } else {
            User usercheck = (User) session.getAttribute("user");
            if (usercheck.getStatus()) {
                model.setViewName("main");
                    //Air air = AirController.getAir();
                    //Lighting lighting = AirController.getLighting();
                    // model.addObject("temperature",air.getTemperature());
                    // model.addObject("humidity", air.getHumidity());
                    //model.addObject("illumination",lighting.getIlluminatian());
               } else {
                   model.setViewName("index");
               }
            return model;
        }

    }
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView login(@ModelAttribute("user") User user, ModelAndView model){

        if(user.getLogin().equals("home") && user.getPassword().equals("pass")){
            user.setStatus(true);
            model.addObject(user);
            model.setViewName("redirect:/");
            return model;
        }
        else{
            model.setViewName("index");
            return model;
        }
    }

    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    public ModelAndView logout(@ModelAttribute("user") User user, ModelAndView model){
        if(user!=null){
            user.setStatus(false);
            model.setViewName("redirect:/");
        }
        else{
            model.setViewName("index");
        }
        return model;
    }


    @ModelAttribute("user")
    public User createUser() {
        return new User();
    }
}

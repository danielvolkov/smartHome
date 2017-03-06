package controller;

import com.pi4j.io.gpio.*;
import entity.Lighting;
import services.LightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


/**
 *
 * @author danielvolkov94@gmail.com
 */
@Controller
public class LightController {

    @Autowired
    LightService lightService;

    @RequestMapping(value = "/turn", method = RequestMethod.POST)
    public ModelAndView turn(@RequestParam String lightGroup, ModelAndView modelAndView){
        if(lightGroup != null) {
            lightService.turnLight(lightGroup);
        }
        modelAndView.setViewName("main");
        return modelAndView;
    }


    public Lighting lighting() {
        Lighting lighting = new Lighting();
        lighting.setIlluminatian(101);
        return lighting;
    }


}

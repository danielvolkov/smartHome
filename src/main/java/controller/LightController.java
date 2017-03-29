package controller;

import com.pi4j.io.gpio.*;
import entity.Lighting;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;
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
@RestController
public class LightController {

    @Autowired
    LightService lightService;

    @RequestMapping(value = "/turn", method = RequestMethod.POST)
    public void turn(@RequestParam String lightGroup){
        if(lightGroup != null) {
            lightService.turnLight(lightGroup);
        }
    }

}

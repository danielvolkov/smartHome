package shome.controller;

import org.springframework.web.bind.annotation.RestController;
import shome.services.LightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


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

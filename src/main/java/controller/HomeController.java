package controller;

import model.Air;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by daniel on 05/10/16.
 */
@Controller
public class HomeController {
    @RequestMapping(value="/air", method = RequestMethod.GET)
    public ModelMap getair(Air air) {
         //read http://www.instructables.com/id/DHT11-TempHum-Sensor-With-Raspberry-Pi-Using-JAVA/

        ModelMap model = new ModelMap();
        return  model;
    }
}

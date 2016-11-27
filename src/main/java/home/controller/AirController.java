package home.controller;


import home.model.Entity.Air;
import home.model.Entity.User;
import home.model.sensors.DHT11;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by daniel on 05/10/16.
 */
//@Controller
public class AirController {
    final int GPIO_PIN_27 = 27 ;
    //@Autowired
    Air air;

    //@Autowired
    DHT11 dht11;

    //@RequestMapping(value = "/getAir", method = RequestMethod.POST)
    public ModelAndView getAir( ModelAndView model) {
         //read http://www.instructables.com/id/DHT11-TempHum-Sensor-With-Raspberry-Pi-Using-JAVA/
        while ( !dht11.getStatus() ) {
            dht11.getAir(GPIO_PIN_27);
        }
        model.addObject("temperature", air.getTemperature());
        model.addObject("humidity",air.getHumidity());
        model.setViewName("main");
        return model;
    }
}

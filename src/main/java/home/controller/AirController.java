package home.controller;


import home.model.Entity.Air;
import home.model.sensors.DHT11;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by daniel on 05/10/16.
 */
@Controller
public class AirController {
    final int GPIO_PIN_27 = 27 ;
    @Autowired
    Air air;

    @Autowired
    DHT11 dht11;

    @RequestMapping(value = "/getAir", method = RequestMethod.GET)
    public ModelAndView getAir(ModelAndView model) {
         //read http://www.instructables.com/id/DHT11-TempHum-Sensor-With-Raspberry-Pi-Using-JAVA/
        for (int i = 0; i <10 ; i++) {
            dht11.getAir(GPIO_PIN_27);
        }
        model.addObject("temperature", air.getTemperature());
        model.addObject("humidity",air.getHumidity());
        model.setViewName("redirect:/");
        return model;
    }
}

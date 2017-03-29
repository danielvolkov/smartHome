package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author danielvolkov94@gmail.com
 */
@RestController
public class AirController {
    //final int GPIO_PIN_27 = 27 ;

    //DHT11 dht11;

    @RequestMapping(value = "/get/climate", method = RequestMethod.GET)
    public ModelAndView getAir( ModelAndView model) {
         //read http://www.instructables.com/id/DHT11-TempHum-Sensor-With-Raspberry-Pi-Using-JAVA/
        /*while ( !dht11.getStatus() ) {
            dht11.getAir(GPIO_PIN_27);
        }

        model.addObject("temperature", air.getTemperature());
        model.addObject("humidity",air.getHumidity());
        model.setViewName("main");
        */
        return model;
    }
}

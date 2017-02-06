package home.controller;


import home.model.entity.Air;
import home.sensors.DHT11;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author danielvolkov94@gmail.com
 */

public class AirController {
    final int GPIO_PIN_27 = 27 ;

    Air air;


    DHT11 dht11;


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

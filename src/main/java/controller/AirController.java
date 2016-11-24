package controller;

import model.Entity.Air;
import model.Entity.Lighting;
import org.springframework.stereotype.Controller;

/**
 * Created by daniel on 05/10/16.
 */
@Controller
public class AirController {

    public static Air getAir() {
         //read http://www.instructables.com/id/DHT11-TempHum-Sensor-With-Raspberry-Pi-Using-JAVA/

       /* DHT11SensorReader sensor = new DHT11SensorReader();
        float[] readData = sensor.readData();
        String humidity = String.format("%.1f",readData[1]);
        String temperature = String.format("%.1f",readData[0]);*/
        //Logger.getLogger(DHT11SensorReader.class.getName()).log(Level.INFO, msg);

        Air air = new Air();
        //air.setHumidity(humidity);

        //while(!dht.getTemperature().startsWith("temp"))
        //air.setTemperature(temperature);

        return  air;
    }

}

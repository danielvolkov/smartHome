package shome.services.holders;

import com.pi4j.io.gpio.Pin;
import com.pi4j.io.gpio.RaspiPin;
import org.springframework.stereotype.Component;
import shome.exceptions.PinNotFondException;

import javax.annotation.PostConstruct;
import java.util.HashMap;

/**
 * Created by daniel on 2/7/17.
 */
@Component
public class LightGroupHolder {
    private HashMap<String,Pin> lightGroupsMap = new HashMap<String, Pin>();

    @PostConstruct
    public void initHolder(){
        lightGroupsMap.put("A", RaspiPin.GPIO_00);
        lightGroupsMap.put("B", RaspiPin.GPIO_01);
        lightGroupsMap.put("C", RaspiPin.GPIO_02);
        lightGroupsMap.put("D", RaspiPin.GPIO_03);
        lightGroupsMap.put("E", RaspiPin.GPIO_04);
        lightGroupsMap.put("F", RaspiPin.GPIO_05);
        lightGroupsMap.put("G", RaspiPin.GPIO_06);
    }

    public Pin getPin(String lightGroup) throws PinNotFondException{
        Pin pin = lightGroupsMap.get(lightGroup);
        if(pin != null){
            return pin;
        }
        else {
            throw new PinNotFondException("Light group:" +lightGroup + " does not match with Pin");
        }
    }
}

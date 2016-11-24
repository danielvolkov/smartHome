package controller;

import com.pi4j.io.gpio.*;
import model.Entity.Lighting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;

/**
 * Created by daniel on 24/11/16.
 */
@Controller
@SessionAttributes("user")
public class LightController {
    @RequestMapping(value = "/turnA", method = RequestMethod.PUT)
    public void turnA( HttpSession session) throws InterruptedException {
        final GpioController gpio = GpioFactory.getInstance();
        final GpioPinDigitalOutput pin = gpio.provisionDigitalOutputPin(
                RaspiPin.GPIO_00, "ChanelA", PinState.HIGH);
        pin.setShutdownOptions(true, PinState.LOW);
        // should be ON
        Thread.sleep(500);
        pin.low();
        //should be OFF
        gpio.shutdown();
    }

    public Lighting lighting() {
        Lighting lighting = new Lighting();
        lighting.setIlluminatian(101);
        return lighting;
    }
}

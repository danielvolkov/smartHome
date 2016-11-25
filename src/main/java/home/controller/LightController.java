package home.controller;

import com.pi4j.io.gpio.*;
import home.model.Entity.Lighting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by daniel on 24/11/16.
 */
@Controller
public class LightController {
    final GpioController gpio = GpioFactory.getInstance();
    final GpioPinDigitalOutput pin0 = gpio.provisionDigitalOutputPin(
            RaspiPin.GPIO_00, "A", PinState.LOW);


    @RequestMapping(value = "/turnA", method = RequestMethod.POST)
    public ModelAndView turnA(ModelAndView modelAndView){

        pin0.setShutdownOptions(true, PinState.LOW);
        pin0.pulse(400);
        gpio.shutdown();
        gpio.unprovisionPin(pin0);
        modelAndView.setViewName("redirect:/");
        return modelAndView;
    }

    public Lighting lighting() {
        Lighting lighting = new Lighting();
        lighting.setIlluminatian(101);
        return lighting;
    }


}

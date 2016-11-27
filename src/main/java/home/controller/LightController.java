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

    @RequestMapping(value = "/turnA", method = RequestMethod.POST)
    public synchronized ModelAndView turnA(ModelAndView modelAndView){
        final GpioController gpio = GpioFactory.getInstance();
        final GpioPinDigitalOutput pin = gpio.provisionDigitalOutputPin(
                RaspiPin.GPIO_00, "A", PinState.LOW);
        pulse(pin,gpio);
        modelAndView.setViewName("main");
        return modelAndView;
    }

    @RequestMapping(value = "/turnB", method = RequestMethod.POST)
    public synchronized ModelAndView turnB(ModelAndView modelAndView){
        final GpioController gpio = GpioFactory.getInstance();
        final GpioPinDigitalOutput pin = gpio.provisionDigitalOutputPin(
                RaspiPin.GPIO_01, "B", PinState.LOW);
        pulse(pin,gpio);
        modelAndView.setViewName("main");
        return modelAndView;
    }
    @RequestMapping(value = "/turnC", method = RequestMethod.POST)
    public synchronized ModelAndView turnC(ModelAndView modelAndView){
        final GpioController gpio = GpioFactory.getInstance();
        final GpioPinDigitalOutput pin = gpio.provisionDigitalOutputPin(
                RaspiPin.GPIO_02, "C", PinState.LOW);
        pulse(pin,gpio);
        modelAndView.setViewName("main");
        return modelAndView;
    }

    @RequestMapping(value = "/turnD", method = RequestMethod.POST)
    public synchronized ModelAndView turnD(ModelAndView modelAndView){
        final GpioController gpio = GpioFactory.getInstance();
        final GpioPinDigitalOutput pin = gpio.provisionDigitalOutputPin(
                RaspiPin.GPIO_03, "D", PinState.LOW);
        pulse(pin,gpio);
        modelAndView.setViewName("main");
        return modelAndView;
    }

    @RequestMapping(value = "/turnE", method = RequestMethod.POST)
    public synchronized ModelAndView turnE(ModelAndView modelAndView){
        final GpioController gpio = GpioFactory.getInstance();
        final GpioPinDigitalOutput pin = gpio.provisionDigitalOutputPin(
                RaspiPin.GPIO_04, "E", PinState.LOW);
        pulse(pin,gpio);
        modelAndView.setViewName("main");
        return modelAndView;
    }

    @RequestMapping(value = "/turnF", method = RequestMethod.POST)
    public synchronized ModelAndView turnF(ModelAndView modelAndView){
        final GpioController gpio = GpioFactory.getInstance();
        final GpioPinDigitalOutput pin = gpio.provisionDigitalOutputPin(
                RaspiPin.GPIO_05, "F", PinState.LOW);
        pulse(pin,gpio);
        modelAndView.setViewName("main");
        return modelAndView;
    }

    @RequestMapping(value = "/turnG", method = RequestMethod.POST)
    public synchronized ModelAndView turnG(ModelAndView modelAndView){
        final GpioController gpio = GpioFactory.getInstance();
        final GpioPinDigitalOutput pin = gpio.provisionDigitalOutputPin(
                RaspiPin.GPIO_06, "G", PinState.LOW);
        pulse(pin,gpio);
        modelAndView.setViewName("main");
        return modelAndView;
    }

    private void pulse(GpioPinDigitalOutput pin, GpioController gpio) {
        pin.setShutdownOptions(true, PinState.LOW);
        pin.low();
        try {
            Thread.sleep(200);
        }catch ( InterruptedException e){ }
        pin.high();
        //gpio.shutdown();
        gpio.unprovisionPin(pin);
    }

    public Lighting lighting() {
        Lighting lighting = new Lighting();
        lighting.setIlluminatian(101);
        return lighting;
    }


}

package shome.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import shome.entity.Climate;
import shome.services.ClimateService;

/**
 *
 * @author danielvolkov94@gmail.com
 */
@RestController
public class ClimateController {
    //final int GPIO_PIN_27 = 27 ;

    @Autowired
    ClimateService climateService;

    @RequestMapping(value = "/get/climate", method = RequestMethod.GET, produces = "application/json")
    public Climate getClimate() {
        Climate climate = climateService.getCurrentClimate();
        return climate;
    }
}

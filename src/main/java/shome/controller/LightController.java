package shome.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import shome.exceptions.PinNotFondException;
import shome.services.LightService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.spi.ResourceBundleControlProvider;


/**
 *
 * @author danielvolkov94@gmail.com
 */
@RestController
public class LightController {

    @Autowired
    LightService lightService;

    @RequestMapping(value = "/turn/{lightGroup}", method = RequestMethod.POST)
    public ResponseEntity<String> turn(@PathVariable String lightGroup){
        HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
        try {
            lightService.turnLight(lightGroup);
            httpStatus = HttpStatus.ACCEPTED;
        } catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<String>(httpStatus);
    }

}

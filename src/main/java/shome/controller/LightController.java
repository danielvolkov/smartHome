package shome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import shome.services.LightService;


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
        return new ResponseEntity<>(httpStatus);
    }

}

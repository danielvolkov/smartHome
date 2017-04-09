package shome.controller;

import shome.entity.Lighting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import shome.services.IlluminationService;


/**
 *
 * @author danielvolkov94@gmail.com
 */
@RestController
public class IlluminationController  {

    @Autowired
    IlluminationService illuminationService;

    @RequestMapping(value = "/get/illumination", method = RequestMethod.GET, produces = "application/json")
    public Lighting lightStatus() {
        Lighting lighting = illuminationService.getLighting();
        return lighting;
    }
}

package shome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import shome.services.WebCameraService;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @author danielvolkov94@gmail.com
 */
@RestController
public class WebCamController {

    @Autowired
    WebCameraService cameraService;

    @RequestMapping(value = "/get/camshot", method = RequestMethod.GET,
            produces = MediaType.IMAGE_PNG_VALUE)
    public byte[] getCamShotImage() {
        BufferedImage  image = cameraService.makeShot();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ImageIO.write(image, "png", baos);
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] imageData = baos.toByteArray();
        return imageData;
    }
}

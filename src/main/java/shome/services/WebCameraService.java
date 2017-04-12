package shome.services;

import shome.entity.CamShot;

import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * @author danielvolkov94@gmail.com
 */
public interface WebCameraService {
    BufferedImage makeShot();
    void saveShot(CamShot shot);
    BufferedImage getCurrentShot() throws IOException;
}

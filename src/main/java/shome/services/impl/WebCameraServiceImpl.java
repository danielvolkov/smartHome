package shome.services.impl;

import com.github.sarxos.webcam.Webcam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import shome.dao.CamShotDao;
import shome.entity.CamShot;
import shome.services.WebCameraService;
import shome.services.holders.WebCamHolder;

import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * @author danielvolkov94@gmail.com
 */
@Transactional
@Service
public class WebCameraServiceImpl implements WebCameraService {

    @Autowired
    WebCamHolder camHolder;

    @Autowired
    CamShotDao camShotDao;

    @Override
    public BufferedImage makeShot() {

        //CamShot shot = new CamShot();
        BufferedImage bufferedImage = null;
        Webcam webcam = camHolder.getWebCam();
        if(webcam!= null) {
            webcam.open();
            if (webcam.isOpen()) {
                bufferedImage = webcam.getImage();
                        //shot.setImage(bufferedImage.;
                        //shot.setDate(new Date())
                webcam.close();
            }
        }

        return bufferedImage;
    }

    @Override
    public void saveShot(CamShot shot) {

    }

    @Override
    public BufferedImage getCurrentShot() throws IOException {

        return null;
    }
}

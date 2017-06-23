package shome.services.holders;

import com.github.sarxos.webcam.Webcam;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.awt.*;
import java.util.List;

/**
 * @author danielvolkov94@gmail.com
 */
@Component
public class WebCamHolder {

    private List<Webcam> webcamList;
    //only one webCam expected in this case
    private final int CAM_INDEX = 0 ;
    private final int WIDTH = 480;
    private final int HEIGHT = 240;

    @PostConstruct
    public void init(){
        webcamList = Webcam.getWebcams();
        Webcam webcam = null;
        if (!webcamList.isEmpty()) {
             webcam = webcamList.get(CAM_INDEX);
        }
        if (webcam != null) {
            Dimension dimension =  webcam.getViewSize();
            dimension.setSize(WIDTH,HEIGHT);
            webcam.getDevice().setResolution(dimension);
        } else {
            System.out.println("there are no available webcams");
        }
    }

    public Webcam getWebCam(){
        return webcamList.get(CAM_INDEX);
    }

}

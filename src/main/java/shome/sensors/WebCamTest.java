package shome.sensors;
import com.github.sarxos.webcam.Webcam;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author danielvolkov94@gmail.com
 */
public class WebCamTest {
    public static void main(String[] args) throws IOException {
        //http://webcam-capture.sarxos.pl/
        List<Webcam> webcamList = Webcam.getWebcams();
        Webcam webcam = webcamList.get(1);
        System.out.println(webcam.getName());

        System.out.println(webcam.getViewSize());
        Dimension dimension =  webcam.getViewSize();
        dimension.setSize(480,240);
        webcam.getDevice().setResolution(dimension);
        System.out.println(webcam.getDevice());
        webcam.open();
        if(webcam.isOpen()){
            BufferedImage bufferedImage = webcam.getImage();
            ImageIO.write(bufferedImage, "PNG", new File("test.png"));
        }



    }
}

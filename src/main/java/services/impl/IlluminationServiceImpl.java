package services.impl;

import entity.Lighting;
import org.springframework.stereotype.Service;
import services.IlluminationService;


/**
 *
 * @author danielvolkov94@gmail.com
 */
@Service
public class IlluminationServiceImpl implements IlluminationService {

    @Override
    public Lighting getLighting() {
        return new Lighting() ;
    }
}

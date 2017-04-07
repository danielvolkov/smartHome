package shome.services.impl;

import shome.entity.Lighting;
import org.springframework.stereotype.Service;
import shome.services.IlluminationService;


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

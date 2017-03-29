package services.impl;

import entity.Climate;
import org.springframework.stereotype.Service;
import services.ClimateService;

/**
 * Created by Daniel on 29.03.2017.
 */
@Service
public class ClimateServiceImpl implements ClimateService {

    @Override
    public Climate getCurrentClimate() {

        return new Climate();
    }
}

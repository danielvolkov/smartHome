package shome.services.impl;

import shome.entity.Climate;
import org.springframework.stereotype.Service;
import shome.services.ClimateService;

/**
 * Created by Daniel on 29.03.2017.
 */
@Service
public class ClimateServiceImpl implements ClimateService {

    @Override
    public Climate getCurrentClimate() {

        Climate climate = new Climate();
        climate.setClimateId(1);
        climate.setHumidity(4);
        climate.setTemperature(17);
        return climate;
    }
}

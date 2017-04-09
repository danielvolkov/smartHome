package shome.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import shome.dao.ClimateDao;
import shome.entity.Climate;
import org.springframework.stereotype.Service;
import shome.services.ClimateService;

/**
 * Created by Daniel on 29.03.2017.
 */
@Service
@Transactional
public class ClimateServiceImpl implements ClimateService {

    @Autowired
    ClimateDao climateDao;

    @Override
    public Climate getCurrentClimate() {
        return climateDao.getCurrentClimate();
    }
}

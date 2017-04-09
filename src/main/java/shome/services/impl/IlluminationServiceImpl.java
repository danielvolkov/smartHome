package shome.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import shome.dao.IlluminationDao;
import shome.entity.Lighting;
import org.springframework.stereotype.Service;
import shome.services.IlluminationService;

/**
 *
 * @author danielvolkov94@gmail.com
 */
@Service
@Transactional
public class IlluminationServiceImpl implements IlluminationService {

    @Autowired
    IlluminationDao illuminationDao;

    @Override
    public Lighting getLighting() {
        return illuminationDao.getCurrent() ;
    }
}

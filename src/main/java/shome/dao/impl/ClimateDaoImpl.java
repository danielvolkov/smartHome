package shome.dao.impl;

import org.springframework.stereotype.Repository;
import shome.dao.ClimateDao;
import shome.entity.Climate;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author danielvolkov94@gmail.com
 */
@Repository
public class ClimateDaoImpl implements ClimateDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Climate getClimateById(int id) {
        return null;
    }
}

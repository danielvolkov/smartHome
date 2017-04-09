package shome.dao.impl;

import org.springframework.stereotype.Repository;
import shome.dao.ClimateDao;
import shome.entity.Climate;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * @author danielvolkov94@gmail.com
 */
@Repository
public class ClimateDaoImpl implements ClimateDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Climate getClimateById(int id) {
        return entityManager.find(Climate.class,id);
    }

    @Override
    public Climate getCurrentClimate() {
        Query query = entityManager
                .createQuery("select c from Climate c where c.climateId = (select max(c2.climateId) from Climate c2)");
        List<Climate> climateList = query.setMaxResults(1).getResultList();
        Climate climate = climateList.get(0);
        return climate;
    }
}

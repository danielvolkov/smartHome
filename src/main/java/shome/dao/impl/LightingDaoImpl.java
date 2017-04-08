package shome.dao.impl;

import org.springframework.stereotype.Repository;
import shome.dao.LightingDao;
import shome.entity.Lighting;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author danielvolkov94@gmail.com
 */
@Repository
public class LightingDaoImpl implements LightingDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Lighting getLightingById(int id) {
        return null;
    }
}

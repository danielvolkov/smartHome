package shome.dao.impl;

import org.springframework.stereotype.Repository;
import shome.dao.IlluminationDao;
import shome.entity.Lighting;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * @author danielvolkov94@gmail.com
 */
@Repository
public class IlluminationDaoImpl implements IlluminationDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Lighting getCurrent() {
        Query query = entityManager
                .createQuery("select l from Lighting l where " +
                        "l.illuminationId = (select max(l2.illuminationId) from Lighting l2)");
        List<Lighting> lightingList = query.setMaxResults(1).getResultList();
        Lighting lighting = lightingList.get(0);
        return lighting;
    }
}

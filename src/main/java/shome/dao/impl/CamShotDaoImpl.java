package shome.dao.impl;

import org.springframework.stereotype.Repository;
import shome.dao.CamShotDao;
import shome.entity.CamShot;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.Objects;

/**
 * @author danielvolkov94@gmail.com
 */
@Repository
public class CamShotDaoImpl implements CamShotDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public CamShot getCurrent() {
        Query query = entityManager
                .createQuery("select c from CamShot c where c.camshotId = (select max(c2.camshotId) from CamShot c2)");
        List<CamShot> camShotList = query.setMaxResults(1).getResultList();
        CamShot camShot = camShotList.get(0);
        return camShot;
    }

    @Override
    public void persistCurrentCumshot(CamShot camShot) {
            Objects.requireNonNull(camShot);
            entityManager.persist(camShot);
    }

    @Override
    public void deleteOld() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getSumOfRecords() {
        return 0;
    }
}

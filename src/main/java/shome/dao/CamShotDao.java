package shome.dao;

import shome.entity.CamShot;

/**
 * @author danielvolkov94@gmail.com
 */
public interface CamShotDao {
    CamShot getCurrent();
    void persistCurrentCumshot(CamShot camShot);
    void deleteOld();
    int getSumOfRecords();
}

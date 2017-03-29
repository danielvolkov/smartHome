package entity;

import javax.persistence.Entity;
import java.util.Date;

/**
 *
 * @author danielvolkov94@gmail.com
 */
@Entity
public class Lighting {
    private Date lastDateTime;
    private float illuminatian;
    private boolean predicateStatus;

    public float getIlluminatian() {
        return illuminatian;
    }

    public void setIlluminatian(float illuminatian) {
        this.illuminatian = illuminatian;
    }


    public boolean isPredicateStatus() {
        return predicateStatus;
    }

    public void setPredicateStatus(boolean predicateStatus) {
        this.predicateStatus = predicateStatus;
    }

    public Date getLastDateTime() {
        return lastDateTime;
    }

    public void setLastDateTime(Date lastDateTime) {
        this.lastDateTime = lastDateTime;
    }
}

package shome.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author danielvolkov94@gmail.com
 */
@Entity
@Table(name = "lighting")
public class Lighting implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "illumination_id")
    @Id
    private int illuminationId;

    @Column(name = "data_time")
    private Date lastDateTime;

    @Column(name = "illumination")
    private float illuminatian;

    @Column(name = "status")
    private boolean predicateStatus;

    public Lighting() {
    }

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

    public int getIlluminationId() {
        return illuminationId;
    }

    public void setIlluminationId(int illuminationId) {
        this.illuminationId = illuminationId;
    }
}

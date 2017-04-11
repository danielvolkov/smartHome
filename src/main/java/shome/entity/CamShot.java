package shome.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author danielvolkov94@gmail.com
 */
@Entity
@Table(name = "camshots")
public class CamShot implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "camshot_id")
    @Id
    @GeneratedValue
    private int camshotId;

    @Column(name = "camshot_image")
    private byte[] image;

    @Column(name = "date_time")
    private Date date;

    public int getCamshotId() {
        return camshotId;
    }

    public CamShot() {
    }

    public void setCamshotId(int camshotId) {
        this.camshotId = camshotId;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

package shome.entity;

import shome.Room;

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
@Table(name = "climate")
public class Climate implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "climate_id")
    @Id
    private int climateId;

    @Column(name = "temperature")
    private double temperature;

    @Column(name = "humidity")
    private double humidity;

    @Column(name = "date_time")
    private Date currentDateTime;

    public Climate() {
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }


    public int getClimateId() {
        return climateId;
    }

    public void setClimateId(int climateId) {
        this.climateId = climateId;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }
}

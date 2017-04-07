package shome.entity;

import shome.Room;

import java.util.Date;

/**
 *
 * @author danielvolkov94@gmail.com
 */


public class Climate {

    private double temperature;
    private int humidity;
    private Room room;
    private Date currentDateTime;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}

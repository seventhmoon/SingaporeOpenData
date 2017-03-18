package sg.gov.data.environment.model;

import android.support.annotation.Keep;

/**
 * Created by fung on 3/18/2017.
 */
@Keep
public class Reading {

    private double east;
    private double central;
    private double south;
    private double north;
    private double west;
    private double national;

    public double getEast() {
        return east;
    }

    public void setEast(double east) {
        this.east = east;
    }

    public double getCentral() {
        return central;
    }

    public void setCentral(double central) {
        this.central = central;
    }

    public double getSouth() {
        return south;
    }

    public void setSouth(double south) {
        this.south = south;
    }

    public double getNorth() {
        return north;
    }

    public void setNorth(double north) {
        this.north = north;
    }

    public double getWest() {
        return west;
    }

    public void setWest(double west) {
        this.west = west;
    }

    public double getNational() {
        return national;
    }

    public void setNational(double national) {
        this.national = national;
    }
}

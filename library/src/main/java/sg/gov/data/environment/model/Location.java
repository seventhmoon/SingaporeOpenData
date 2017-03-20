package sg.gov.data.environment.model;

import android.support.annotation.Keep;

import com.google.gson.annotations.SerializedName;

/**
 * Created by fung on 3/18/2017.
 */
@SuppressWarnings("unused")
@Keep
public class Location {

    @SerializedName("latitude")
    private double latitude;
    @SerializedName("longitude")
    private double longitude;

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}

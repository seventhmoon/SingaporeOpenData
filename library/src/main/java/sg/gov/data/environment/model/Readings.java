package sg.gov.data.environment.model;

import android.support.annotation.Keep;

import com.google.gson.annotations.SerializedName;

/**
 * Created by fung on 3/18/2017.
 */
@SuppressWarnings("unused")
@Keep
public class Readings {

    @SerializedName("pm25_one_hourly")
    private Reading pm25OneHourly;

    public Reading getPm25OneHourly() {
        return pm25OneHourly;
    }

    public void setPm25OneHourly(Reading pm25OneHourly) {
        this.pm25OneHourly = pm25OneHourly;
    }
}

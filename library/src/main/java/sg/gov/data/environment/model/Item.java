package sg.gov.data.environment.model;

import android.support.annotation.Keep;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Created by fung on 3/18/2017.
 */
@SuppressWarnings("unused")
@Keep
public class Item {

    @SerializedName("imestamp")
    private Date timestamp;

    @SerializedName("update_timestamp")
    private Date updateTimeStamp;
    @SerializedName("readings")
    private Readings readings;

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Date getUpdateTimeStamp() {
        return updateTimeStamp;
    }

    public void setUpdateTimeStamp(Date updateTimeStamp) {
        this.updateTimeStamp = updateTimeStamp;
    }

    public Readings getReadings() {
        return readings;
    }

    public void setReadings(Readings readings) {
        this.readings = readings;
    }
}

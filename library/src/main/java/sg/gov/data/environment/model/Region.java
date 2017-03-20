package sg.gov.data.environment.model;

import android.support.annotation.Keep;

import com.google.gson.annotations.SerializedName;

/**
 * Created by fung on 3/18/2017.
 */
@SuppressWarnings("unused")
@Keep
public class Region {
    @SerializedName("name")
    private String name;
    @SerializedName("label_location")
    private Location labelLocation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLabelLocation() {
        return labelLocation;
    }

    public void setLabelLocation(Location labelLocation) {
        this.labelLocation = labelLocation;
    }
}

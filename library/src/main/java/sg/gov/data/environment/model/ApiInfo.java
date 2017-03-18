package sg.gov.data.environment.model;

import android.support.annotation.Keep;

import com.google.gson.annotations.SerializedName;

/**
 * Created by fung on 3/18/2017.
 */
@Keep
public class ApiInfo {

    @SerializedName("status")
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

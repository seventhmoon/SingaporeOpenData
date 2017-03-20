package sg.gov.data.environment.model;

import android.support.annotation.Keep;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by fung on 3/18/2017.
 */
@SuppressWarnings("unused")
@Keep
public class Pm25Response {

    @SerializedName("region_metadata")
    private List<Region> regions;

    @SerializedName("items")
    private List<Item> items;

    @SerializedName("api_info")
    private ApiInfo apiInfo;

    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public ApiInfo getApiInfo() {
        return apiInfo;
    }

    public void setApiInfo(ApiInfo apiInfo) {
        this.apiInfo = apiInfo;
    }
}

package sg.gov.data;

import android.support.annotation.Keep;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import sg.gov.data.environment.model.Pm25Response;

/**
 * Created by fung on 3/5/2017.
 */
@Keep
public interface GovDataApiService {

    @SuppressWarnings("SameParameterValue")
    @GET("environment/pm25")
    Call<Pm25Response> getPm25Readings(@Header ("api-key") String apiKey);
}

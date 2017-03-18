package com.androidfung.opendata;


import android.support.annotation.Keep;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import sg.gov.data.GovDataApiService;

/**
 * Created by fung on 3/4/2017.
 */
@Keep
public class ApiServices {

    private static final String DATA_API_BASE_URL = "https://api.data.gov.sg/v1/";


    public static GovDataApiService getGovDataApiService(OkHttpClient okHttpClient) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(DATA_API_BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(GovDataApiService.class);

    }


    public static GovDataApiService getGovDataApiService() {

        return getGovDataApiService(new OkHttpClient());

    }
}

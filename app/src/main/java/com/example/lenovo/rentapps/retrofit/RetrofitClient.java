package com.example.lenovo.rentapps.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static final String API_BASE_URLS ="http://192.168.0.107:9091/";

    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(API_BASE_URLS)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public static RestApi requestCall(){
        return retrofit.create(RestApi.class);
    }
}

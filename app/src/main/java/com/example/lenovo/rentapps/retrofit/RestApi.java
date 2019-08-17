package com.example.lenovo.rentapps.retrofit;

import com.example.lenovo.rentapps.model.Owner;
import com.example.lenovo.rentapps.model.RegisterUserModel;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface RestApi {

    @Headers("Content-Type: application/json")
    @POST("/create")
    Call<String> getRegister(
            @Body RegisterUserModel registerUser
    );

    @Headers("Content-Type: application/json")
    @POST("/post/add")
    Call<String> getPosts(
            @Body Owner owner
    );
}

package com.example.retrofitapiregistratsiya;

import com.example.retrofitapiregistratsiya.Request.Login;
import com.example.retrofitapiregistratsiya.Response.LoginResponse;
import com.example.retrofitapiregistratsiya.Response.ProductsResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface Api {

    @Headers({"Content-Type: application/json"})
    @POST("authenticate")
    Call<LoginResponse> loginuser(@Body Login login);

    @GET("products")
    Call<List<ProductsResponse>> hammamahsulot(@Header("Authorization") String token);

}

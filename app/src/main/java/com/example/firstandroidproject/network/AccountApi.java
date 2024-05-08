package com.example.firstandroidproject.network;

import com.example.firstandroidproject.dto.category.user.UserItemDTO;
import com.example.firstandroidproject.dto.category.user.UserLoginDTO;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface AccountApi {
    @POST("api/Account/login")
    public Call<UserItemDTO> login(@Body UserLoginDTO model);
}

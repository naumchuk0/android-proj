package com.example.firstandroidproject.network;
import com.example.firstandroidproject.dto.category.CategoryCreateDTO;
import com.example.firstandroidproject.dto.category.CategoryItemDTO;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface CategoriesApi {
    @GET("/api/categories")
    public Call<List<CategoryItemDTO>> list();

    @POST("/api/categories")
    public Call<CategoryItemDTO> create(@Body CategoryCreateDTO model);
}

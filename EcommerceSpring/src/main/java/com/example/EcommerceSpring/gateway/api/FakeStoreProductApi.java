package com.example.EcommerceSpring.gateway.api;

import com.example.EcommerceSpring.dto.FakeStoreProductByIdResponse;
import com.example.EcommerceSpring.dto.FakeStoreProductsByCategoryResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.io.IOException;

public interface FakeStoreProductApi {
    @GET("products/category")
    public Call<FakeStoreProductsByCategoryResponse> getProductsByCategory(@Query("type") String type) throws IOException;

    @GET("products/{id}")
    public Call<FakeStoreProductByIdResponse> getProductById(@Path("id") Long id) throws IOException;
}

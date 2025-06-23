package com.example.EcommerceSpring.gateway.api;

import com.example.EcommerceSpring.dto.FakeStoreCategoryResponse;
import retrofit2.Call;
import retrofit2.http.GET;


public interface FakeStoreCategoryApi {
    @GET("products/category")
    Call<FakeStoreCategoryResponse> getAllFakeStoreCategories();
}

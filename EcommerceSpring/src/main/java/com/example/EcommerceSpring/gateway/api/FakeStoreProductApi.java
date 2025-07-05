package com.example.EcommerceSpring.gateway.api;

import com.example.EcommerceSpring.dto.controllerDTO.Response.CreateProductResponse;
import com.example.EcommerceSpring.dto.controllerDTO.Resquest.CreateProductRequest;
import com.example.EcommerceSpring.dto.gatewayDTO.Response.FakeStoreProductByIdResponse;
import com.example.EcommerceSpring.dto.gatewayDTO.Response.FakeStoreProductsByCategoryResponse;
import com.example.EcommerceSpring.dto.gatewayDTO.Request.FakeStoreCreateProductRequest;
import com.example.EcommerceSpring.dto.gatewayDTO.Response.FakeStoreCreateProductResponse;
import org.springframework.web.bind.annotation.RequestBody;
import retrofit2.Call;
import retrofit2.http.*;

import java.io.IOException;

public interface FakeStoreProductApi {
    @GET("products/category")
    public Call<FakeStoreProductsByCategoryResponse> getProductsByCategory(@Query("type") String type) throws IOException;

    @GET("products/{id}")
    public Call<FakeStoreProductByIdResponse> getProductById(@Path("id") Long id) throws IOException;

    @POST("products")
    public Call<FakeStoreCreateProductResponse> createProduct(@Body CreateProductRequest request) throws IOException;
}

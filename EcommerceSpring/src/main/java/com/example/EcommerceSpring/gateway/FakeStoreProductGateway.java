package com.example.EcommerceSpring.gateway;

import com.example.EcommerceSpring.dto.FakeStoreProductByIdResponse;
import com.example.EcommerceSpring.dto.FakeStoreProductsByCategoryResponse;
import com.example.EcommerceSpring.dto.ProductDTO;
import com.example.EcommerceSpring.gateway.api.FakeStoreProductApi;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class FakeStoreProductGateway implements IProductGateway {
    private final FakeStoreProductApi fakeStoreProductApi;

    public FakeStoreProductGateway(FakeStoreProductApi fakeStoreProductApi) {
        this.fakeStoreProductApi = fakeStoreProductApi;
    }

    @Override
    public List<ProductDTO> getProductsByCategory(String type) throws IOException {
        FakeStoreProductsByCategoryResponse response = fakeStoreProductApi.getProductsByCategory(type).execute().body();
        return response.getProducts().stream()
                .map( product -> ProductDTO.builder()
                        .price(product.getPrice())
                        .title(product.getTitle())
                        .brand(product.getBrand())
                        .model(product.getModel()).build()
                ).toList();
    }

    @Override
    public ProductDTO getProductById(Long Id) throws IOException {
        FakeStoreProductByIdResponse response = fakeStoreProductApi.getProductById(Id).execute().body();

        return ProductDTO.builder()
                .title(response.getProduct().getTitle())
                .price(response.getProduct().getPrice())
                .brand(response.getProduct().getBrand())
                .model(response.getProduct().getModel()).build();
    }
}

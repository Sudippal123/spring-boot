package com.example.EcommerceSpring.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class FakeStoreProductsByCategoryResponse {
    private String status;
    private String message;
    private List<FakeStoreProductDetail> products;
}

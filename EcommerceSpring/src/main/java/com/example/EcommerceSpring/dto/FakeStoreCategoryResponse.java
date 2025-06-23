package com.example.EcommerceSpring.dto;

import lombok.Getter;

import java.util.List;

@Getter
public class FakeStoreCategoryResponse {
    private String status;
    private String message;
    private List<String> categories;
}

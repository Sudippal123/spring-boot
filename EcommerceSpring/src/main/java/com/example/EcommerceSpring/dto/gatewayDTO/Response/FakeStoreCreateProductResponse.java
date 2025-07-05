package com.example.EcommerceSpring.dto.gatewayDTO.Response;

import com.example.EcommerceSpring.dto.Product;
import lombok.Getter;

@Getter
public class FakeStoreCreateProductResponse{
	private Product product;
	private String message;
	private String status;
}

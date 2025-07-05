package com.example.EcommerceSpring.services;

import com.example.EcommerceSpring.dto.controllerDTO.Response.ProductDTO;
import com.example.EcommerceSpring.dto.controllerDTO.Response.CreateProductResponse;
import com.example.EcommerceSpring.dto.controllerDTO.Resquest.CreateProductRequest;

import java.io.IOException;
import java.util.List;

public interface IProductService {
    List<ProductDTO> getProductByCategory(String type) throws IOException;
    ProductDTO getProductById(Long Id) throws IOException;
    CreateProductResponse addProduct(CreateProductRequest product) throws IOException;
}

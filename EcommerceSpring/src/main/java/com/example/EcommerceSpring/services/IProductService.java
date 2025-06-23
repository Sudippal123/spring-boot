package com.example.EcommerceSpring.services;

import com.example.EcommerceSpring.dto.ProductDTO;

import java.io.IOException;
import java.util.List;

public interface IProductService {
    List<ProductDTO> getProductByCategory(String type) throws IOException;
    ProductDTO getProductById(Long Id) throws IOException;
}

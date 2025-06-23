package com.example.EcommerceSpring.gateway;

import com.example.EcommerceSpring.dto.ProductDTO;

import java.io.IOException;
import java.util.List;

public interface IProductGateway {
    List<ProductDTO> getProductsByCategory(String type) throws IOException;
    ProductDTO getProductById(Long Id) throws IOException;
}

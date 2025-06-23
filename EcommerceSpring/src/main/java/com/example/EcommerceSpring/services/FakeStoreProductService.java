package com.example.EcommerceSpring.services;

import com.example.EcommerceSpring.dto.ProductDTO;
import com.example.EcommerceSpring.gateway.IProductGateway;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class FakeStoreProductService implements IProductService{
    private final IProductGateway productGateway;

    public FakeStoreProductService(IProductGateway productGateway) {
        this.productGateway = productGateway;
    }

    @Override
    public List<ProductDTO> getProductByCategory(String type) throws IOException {
        return this.productGateway.getProductsByCategory(type);
    }

    @Override
    public ProductDTO getProductById(Long Id) throws IOException {
        return this.productGateway.getProductById(Id);
    }
}

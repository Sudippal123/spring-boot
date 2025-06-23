package com.example.EcommerceSpring.controllers;

import com.example.EcommerceSpring.dto.ProductDTO;
import com.example.EcommerceSpring.services.FakeStoreProductService;
import com.example.EcommerceSpring.services.IProductService;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final IProductService productService;

    public ProductController(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/category")
    public List<ProductDTO> getProductByCategory(@RequestParam("type") String type) throws IOException {
        return this.productService.getProductByCategory(type);
    }
    @GetMapping("/{id}")
    public ProductDTO getProduct(@PathVariable("id") Long id) throws IOException {
        return this.productService.getProductById(id);
    }
}

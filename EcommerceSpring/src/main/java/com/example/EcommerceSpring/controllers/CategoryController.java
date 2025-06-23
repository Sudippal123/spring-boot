package com.example.EcommerceSpring.controllers;


import com.example.EcommerceSpring.dto.CategoryDTO;
import com.example.EcommerceSpring.services.ICategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/")
public class CategoryController {

    private final ICategoryService categoryService;
    CategoryController(ICategoryService categoryService){
        this.categoryService = categoryService;
    }
    @GetMapping("categories")
    public List<CategoryDTO> getAllCategories() throws IOException {
        return this.categoryService.getAllCategories();
    }
}

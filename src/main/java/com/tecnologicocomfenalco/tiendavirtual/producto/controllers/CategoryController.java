package com.tecnologicocomfenalco.tiendavirtual.producto.controllers;

import com.tecnologicocomfenalco.tiendavirtual.producto.models.dtos.CategoryDTO;
import com.tecnologicocomfenalco.tiendavirtual.producto.services.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping("category")
    public void create(CategoryDTO categoryDTO){
        categoryService.create(categoryDTO);
    }

    @GetMapping("category")
    public List<CategoryDTO> findAll(){
        return categoryService.findAll();
    }
}

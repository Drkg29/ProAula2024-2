package com.tecnologicocomfenalco.tiendavirtual.producto.services;

import com.tecnologicocomfenalco.tiendavirtual.producto.models.dtos.CategoryDTO;

import java.util.List;

public interface CategoryService {
    void create(CategoryDTO category);
    List<CategoryDTO> findAll();
}

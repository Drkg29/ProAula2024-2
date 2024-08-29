package com.tecnologicocomfenalco.tiendavirtual.producto.services.impl;

import com.tecnologicocomfenalco.tiendavirtual.producto.models.dtos.CategoryDTO;
import com.tecnologicocomfenalco.tiendavirtual.producto.services.CategoryService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Override
    public void create(CategoryDTO category) {
        System.out.println("Crear");
    }

    @Override
    public List<CategoryDTO> findAll() {
        List<CategoryDTO> list= Arrays
                .asList(new CategoryDTO("1","Proteinas"),
                        new CategoryDTO("2","Creatinas"),
                        new CategoryDTO("3","Combos"),
                        new CategoryDTO("4","Accesorios")  );
        return list;
    }
}

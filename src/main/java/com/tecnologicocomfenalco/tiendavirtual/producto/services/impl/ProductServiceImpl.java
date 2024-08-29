package com.tecnologicocomfenalco.tiendavirtual.producto.services.impl;

import com.tecnologicocomfenalco.tiendavirtual.producto.models.dtos.ProductDTO;
import com.tecnologicocomfenalco.tiendavirtual.producto.services.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public List<ProductDTO> findAll() {
        return List.of();
    }
}

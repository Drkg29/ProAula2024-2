package com.tecnologicocomfenalco.tiendavirtual.producto.services;

import com.tecnologicocomfenalco.tiendavirtual.producto.models.dtos.ProductDTO;

import java.util.List;

public interface ProductService {
    List<ProductDTO> findAll();
}

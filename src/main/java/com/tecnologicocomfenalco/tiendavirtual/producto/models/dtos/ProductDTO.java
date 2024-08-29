package com.tecnologicocomfenalco.tiendavirtual.producto.models.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class ProductDTO {
    private String sku;
    private String name;
    private int quantity;
    private float price;
    private List<CategoryDTO> categories;
}



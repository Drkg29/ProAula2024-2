package com.tecnologicocomfenalco.tiendavirtual.producto.models.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Product {
    private int id;
    private String sku;
    private String name;
    private int quantity;
    private float price;
    private List<Category> categories;
}



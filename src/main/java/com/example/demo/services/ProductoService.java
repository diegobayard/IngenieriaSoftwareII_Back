package com.example.demo.services;

import java.util.List;
import com.example.demo.model.Producto;

public interface ProductoService {

    Producto insert(Producto producto);

	List<Producto> getProductos();

    void borrarProductos(Producto producto);
    
}

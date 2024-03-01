package com.example.demo.services.impl;

import java.util.List;

import com.example.demo.model.Producto;
import com.example.demo.repositories.ProductoRepository;
import com.example.demo.services.ProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository repo;

    @Override
    public Producto insert(Producto producto) {
        return repo.save(producto);
    }

    @Override
    public List<Producto> getProductos() {
        return repo.findAll();
    }

    @Override
    public void borrarProductos(Producto producto){
        repo.delete(producto);
    }
}

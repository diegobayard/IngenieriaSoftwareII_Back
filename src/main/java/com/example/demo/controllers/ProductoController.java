package com.example.demo.controllers;

import java.util.List;

import com.example.demo.model.Producto;
import com.example.demo.services.ProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productos")
@CrossOrigin
public class ProductoController {

    @Autowired
	private ProductoService service;
    
    @PostMapping
    public Producto save(@RequestBody Producto producto){
        return service.insert(producto);
    }

    @GetMapping
	public List<Producto> getProductos() {
		return service.getProductos();
    }

    @DeleteMapping("/{id}")
    public void borrarProductos(@RequestBody Producto producto){
        service.borrarProductos(producto);
    }
}

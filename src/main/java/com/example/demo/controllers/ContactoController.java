package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.example.demo.model.Contacto;
import com.example.demo.services.ContactoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/contactos")
@CrossOrigin
public class ContactoController {

    @Autowired
	private ContactoService service;
    
    @PostMapping
    public Contacto save(@RequestBody Contacto contacto){
        return service.insert(contacto);
    }

    @GetMapping
	public List<Contacto> getMensajes() {
		return service.getAll();
    }
}
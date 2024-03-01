package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Producto {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
private String Nombre;
private String Descripcion;
private float Precio;
private boolean Disponible;
private float Coste;
private int Cantidad;
private String Proveedor;
}

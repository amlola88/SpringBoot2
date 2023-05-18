package com.example.colegioelite.entidades;

import jakarta.persistence.*;

@Entity
@Table(name="materias")
public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="nombres",nullable = false, length=30)
    private String nombre;
    @Column(name="creditos",nullable = false)
    private Integer numeroCreditos;

    public Materia() {
    }

    public Materia(Integer id, String nombre, Integer numeroCreditos) {
        this.id = id;
        this.nombre = nombre;
        this.numeroCreditos = numeroCreditos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumeroCreditos() {
        return numeroCreditos;
    }

    public void setNumeroCreditos(Integer numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }
}

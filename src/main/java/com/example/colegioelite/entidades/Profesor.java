package com.example.colegioelite.entidades;

import jakarta.persistence.*;

@Entity
@Table(name="profesor")

public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="nombres",nullable = false, length=30)
    private String nombre;
    @Column(name="escalafon",nullable = false, length=30)
    private Integer escalafon;

    public Profesor() {
    }

    public Profesor(Integer id, String nombre, Integer escalafon) {
        this.id = id;
        this.nombre = nombre;
        this.escalafon = escalafon;
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

    public Integer getEscalafon() {
        return escalafon;
    }

    public void setEscalafon(Integer escalafon) {
        this.escalafon = escalafon;
    }
}

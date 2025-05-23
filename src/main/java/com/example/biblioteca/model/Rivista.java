package com.example.biblioteca.model;

import jakarta.persistence.*;

@Entity
public class Rivista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titolo;
    private int numero;
    private int anno;

    @Override
    public String toString() {
        return "Rivista{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", numero=" + numero +
                ", anno=" + anno +
                '}';
    }
}

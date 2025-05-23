package com.example.biblioteca;

import jakarta.persistence.*;

@Entity
public class Libro extends ElementoCatalogo {
    private String autore;
    private String genere;

    public Libro() {}

    public Libro(String isbn, String titolo, int annoPubblicazione, int numeroPagine, String autore, String genere) {
        super(isbn, titolo, annoPubblicazione, numeroPagine);
        this.autore = autore;
        this.genere = genere;
    }

    // Getters e Setters
}

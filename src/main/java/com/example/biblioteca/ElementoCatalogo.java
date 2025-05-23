package com.example.biblioteca;

import jakarta.persistence.*;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class ElementoCatalogo {
    @Id
    private String isbn;
    private String titolo;
    private int annoPubblicazione;
    private int numeroPagine;

    public ElementoCatalogo() {}

    public ElementoCatalogo(String isbn, String titolo, int annoPubblicazione, int numeroPagine) {
        this.isbn = isbn;
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.numeroPagine = numeroPagine;
    }

    // Getters e Setters
}

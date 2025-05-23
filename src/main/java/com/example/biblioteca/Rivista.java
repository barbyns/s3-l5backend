package com.example.biblioteca;

import jakarta.persistence.*;

@Entity
public class Rivista extends ElementoCatalogo {
    @Enumerated(EnumType.STRING)
    private Periodicita periodicita;

    public Rivista() {}

    public Rivista(String isbn, String titolo, int annoPubblicazione, int numeroPagine, Periodicita periodicita) {
        super(isbn, titolo, annoPubblicazione, numeroPagine);
        this.periodicita = periodicita;
    }

    // Getters e Setters
}

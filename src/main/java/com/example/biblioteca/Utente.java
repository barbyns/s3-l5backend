package com.example.biblioteca;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Utente {
    @Id
    private String numeroTessera;
    private String nome;
    private String cognome;
    private LocalDate dataNascita;

    public Utente() {}

    public Utente(String numeroTessera, String nome, String cognome, LocalDate dataNascita) {
        this.numeroTessera = numeroTessera;
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
    }

    // Getters e Setters
}

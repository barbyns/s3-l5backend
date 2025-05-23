package com.example.biblioteca;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Prestito {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Utente utente;

    @ManyToOne
    private ElementoCatalogo elemento;

    private LocalDate dataInizioPrestito;
    private LocalDate dataRestituzionePrevista;
    private LocalDate dataRestituzioneEffettiva;

    public Prestito() {}

    public Prestito(Utente utente, ElementoCatalogo elemento, LocalDate dataInizioPrestito) {
        this.utente = utente;
        this.elemento = elemento;
        this.dataInizioPrestito = dataInizioPrestito;
        this.dataRestituzionePrevista = dataInizioPrestito.plusDays(30);
    }

    // Getters e Setters
}

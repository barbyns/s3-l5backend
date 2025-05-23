// Prestito.java
package com.example.biblioteca.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Prestito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Utente utente;

    private String tipoMateriale; // "Libro" o "Rivista"
    private Long materialeId;     // ID del libro o rivista

    private LocalDate dataInizio;
    private LocalDate dataFine;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public String getTipoMateriale() {
        return tipoMateriale;
    }

    public void setTipoMateriale(String tipoMateriale) {
        this.tipoMateriale = tipoMateriale;
    }

    public LocalDate getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(LocalDate dataInizio) {
        this.dataInizio = dataInizio;
    }

    public Long getMaterialeId() {
        return materialeId;
    }

    public void setMaterialeId(Long materialeId) {
        this.materialeId = materialeId;
    }

    public LocalDate getDataFine() {
        return dataFine;
    }

    public void setDataFine(LocalDate dataFine) {
        this.dataFine = dataFine;
    }
}
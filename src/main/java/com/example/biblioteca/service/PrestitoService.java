// PrestitoService.java
package com.example.biblioteca.service;

import com.example.biblioteca.model.*;
import com.example.biblioteca.repository.PrestitoRepository;

import java.time.LocalDate;
import java.util.List;

public class PrestitoService {
    private PrestitoRepository repository;

    public PrestitoService(PrestitoRepository repository) {
        this.repository = repository;
    }

    public void creaPrestito(Utente utente, String tipo, Long materialeId) {
        Prestito p = new Prestito();
        p.setUtente(utente);
        p.setTipoMateriale(tipo);
        p.setMaterialeId(materialeId);
        p.setDataInizio(LocalDate.now());
        p.setDataFine(LocalDate.now().plusDays(30));
        repository.save(p);
    }

    public List<Prestito> listaPrestiti() {
        return repository.findAll();
    }
}

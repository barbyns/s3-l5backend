package com.example.biblioteca.model;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;

    @OneToMany(mappedBy = "utente")
    private List<Prestito> prestiti = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Prestito> getPrestiti() {
        return prestiti;
    }

    public void setPrestiti(List<Prestito> prestiti) {
        this.prestiti = prestiti;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

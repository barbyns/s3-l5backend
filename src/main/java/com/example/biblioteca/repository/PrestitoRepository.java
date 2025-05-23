// PrestitoRepository.java
package com.example.biblioteca.repository;

import com.example.biblioteca.model.Prestito;
import jakarta.persistence.*;
import java.util.*;

public class PrestitoRepository {
    private EntityManager em;

    public PrestitoRepository(EntityManager em) {
        this.em = em;
    }

    public void save(Prestito p) {
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
    }

    public List<Prestito> findAll() {
        return em.createQuery("SELECT p FROM Prestito p", Prestito.class).getResultList();
    }
}
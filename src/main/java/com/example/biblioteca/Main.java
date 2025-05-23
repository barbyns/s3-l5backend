// Main.java
package com.example.biblioteca;

import com.example.biblioteca.repository.PrestitoRepository;
import com.example.biblioteca.service.PrestitoService;

import jakarta.persistence.*;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("catalogoPU");
        EntityManager em = emf.createEntityManager();

        PrestitoRepository repo = new PrestitoRepository(em);
        PrestitoService service = new PrestitoService(repo);

        Utente u = new Utente();
        u.setNome("Mario Rossi");
        u.setEmail("mario@example.com");

        em.getTransaction().begin();
        em.persist(u);
        em.getTransaction().commit();

        service.creaPrestito(u, "Libro", 1L);

        service.listaPrestiti().forEach(p -> {
            System.out.println("Prestito: " + p.getTipoMateriale() + " (ID: " + p.getMaterialeId() + ")");
        });

        em.close();
        emf.close();
    }
}

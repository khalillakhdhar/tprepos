package com.td.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.td.model.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Long> {
Page<Commande> findAll(Pageable page);
}

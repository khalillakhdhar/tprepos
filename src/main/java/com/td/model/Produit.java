package com.td.model;


import jakarta.persistence.*;

import java.util.List;

import lombok.Data;
@Data
@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String description;
    private double prix;
    private int quantite;

    // Getters et Setters

    @ManyToMany(mappedBy = "produits", fetch = FetchType.LAZY)
    private List<Commande> commandes;
}

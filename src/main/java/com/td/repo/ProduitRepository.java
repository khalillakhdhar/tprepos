package com.td.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.td.model.Produit;
@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long> {
	

}

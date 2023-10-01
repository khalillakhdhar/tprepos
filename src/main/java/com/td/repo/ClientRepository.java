package com.td.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ch.qos.logback.core.net.server.Client;
@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
	List<Client> findByNomAndPrenom(String nom,String prenom);
	List<Client> findByEmailAndMdp(String email,String mdp);

}

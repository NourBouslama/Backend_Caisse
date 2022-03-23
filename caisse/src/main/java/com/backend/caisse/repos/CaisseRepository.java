package com.backend.caisse.repos;

import java.util.List;

import com.backend.caisse.entities.Caisse;
import com.backend.caisse.entities.ModePaiement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface CaisseRepository extends JpaRepository<Caisse, Long> {

	@Query("select p from Caisse p where p.modes = ?1")
	List<Caisse> findByModes(ModePaiement mode);

	List<Caisse> findByModesCode(Long code);

	// void desactiverCaisseById(Long id);
	@Transactional
	@Modifying
	@Query("update Caisse p set p.etat = 'activer' where p.numC = ?1")
	void updateEtatAct(long numc);

	@Transactional
	@Modifying
	@Query("update Caisse p set p.etat ='desactiver' where p.numC = ?1")
	void updateEtatDesact(long numc);

	@Transactional
	@Modifying
	@Query("update Caisse p set p.etatJournal ='fermer' where p.numC = ?1")
	void updateEtatJournal(long numc);
}
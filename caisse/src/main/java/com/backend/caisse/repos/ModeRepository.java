package com.backend.caisse.repos;

import com.backend.caisse.entities.ModePaiement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface ModeRepository extends JpaRepository <ModePaiement, Long> {
    @Transactional
	@Modifying
	@Query("update ModePaiement p set p.etatM = 'activer' where p.code = ?1")
	void updateEtatAct(long code);

	@Transactional
	@Modifying
	@Query("update ModePaiement p set p.etatM ='desactiver' where p.code = ?1")
	void updateEtatDesact(long code);
}

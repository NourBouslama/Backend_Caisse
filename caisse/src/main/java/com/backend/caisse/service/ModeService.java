package com.backend.caisse.service;

import java.util.List;

import com.backend.caisse.entities.ModePaiement;

public interface ModeService {

    ModePaiement ajouterModePaiement(ModePaiement p);

    ModePaiement modifierModePaiement(ModePaiement p);

    void desactiverModePaiementById(Long code);

    void activerModePaiementById(Long code);

    List<ModePaiement> listerModePaiements();

    ModePaiement consulterModePaiement(Long id);

    // void desactiverModePaiement(ModePaiement p);
}

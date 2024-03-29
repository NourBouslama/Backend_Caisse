package com.backend.caisse.serviceImp;

import java.util.List;

import com.backend.caisse.entities.ModePaiement;
import com.backend.caisse.repos.ModeRepository;
import com.backend.caisse.service.ModeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ModeServiceImpl implements ModeService {
    
    @Autowired
	private ModeRepository modeRepository;
    
    @Override
    public ModePaiement ajouterModePaiement(ModePaiement p) {
    
        return modeRepository.save(p);
    }

    @Override
    public ModePaiement modifierModePaiement(ModePaiement p) {
    
        return modeRepository.save(p);
    }

    @Override
    public void desactiverModePaiementById(Long code) {
    
        modeRepository.updateEtatDesact(code);
        
    }

    @Override
    public void activerModePaiementById(Long code) {
    
        modeRepository.updateEtatAct(code);
    }

    @Override
    public List<ModePaiement> listerModePaiements() {
    
        return modeRepository.findAll();
    }

    @Override
    public ModePaiement consulterModePaiement(Long code) {
    
        return modeRepository.findById(code).get();
    }
    
}

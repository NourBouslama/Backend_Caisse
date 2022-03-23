package com.backend.caisse.RestController;

import java.util.List;

import com.backend.caisse.entities.ModePaiement;
import com.backend.caisse.service.ModeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/modeapi")
@CrossOrigin(origins = "*")
public class ModeRestController {

    @Autowired
    ModeService modeService;

    @RequestMapping(method = RequestMethod.GET)
    public List<ModePaiement> ListerModePaiements() {
        return modeService.listerModePaiements();
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModePaiement ajouterModePaiement(@RequestBody ModePaiement ModePaiement) {
        return modeService.ajouterModePaiement(ModePaiement);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ModePaiement modifierModePaiement(@RequestBody ModePaiement ModePaiement) {
        return modeService.modifierModePaiement(ModePaiement);
    }

    @RequestMapping(value = "/{code}", method = RequestMethod.GET)
    public ModePaiement consulterModePaiement(@PathVariable("code") Long code) {
        return modeService.consulterModePaiement(code);
    }

    @RequestMapping(value = "/desactiverMode/{code}", method = RequestMethod.PUT)
    public void desactiverMode(@PathVariable("code") Long code) {
        modeService.desactiverModePaiementById(code);
    }

    @RequestMapping(value = "/activerMode/{code}", method = RequestMethod.PUT)
    public void activerMode(@PathVariable("code") Long code) {
        modeService.activerModePaiementById(code);
    }
}
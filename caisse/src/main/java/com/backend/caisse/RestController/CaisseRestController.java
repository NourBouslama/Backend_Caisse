package com.backend.caisse.RestController;

import com.backend.caisse.service.CaisseService;

import java.util.List;

import com.backend.caisse.entities.Caisse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class CaisseRestController {
    @Autowired
    CaisseService caisseService;

    @RequestMapping(path = "all", method = RequestMethod.GET)
    public List<Caisse> listerCaisses() {
        return caisseService.listerCaisses();
    }

    @RequestMapping(value = "/{numC}", method = RequestMethod.GET)
    public Caisse consulterCaisse(@PathVariable("numC") Long numC) {
        return caisseService.consulterCaisse(numC);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Caisse ajouterCaisse(@RequestBody Caisse Caisse) {
        return caisseService.ajouterCaisse(Caisse);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Caisse modifierCaisse(@RequestBody Caisse Caisse) {
        return caisseService.modifierCaisse(Caisse);
    }

    @RequestMapping(value = "/desactiverCaisse/{numC}",method = RequestMethod.PUT)
    public void desactiverCaisse(@PathVariable("numC") Long numc) {
         caisseService.desactiverCaisseById(numc);
    }

    @RequestMapping(value = "/activerCaisse/{numC}",method = RequestMethod.PUT)
    public void activerCaisse(@PathVariable("numC") Long numc) {
         caisseService.activerCaisseById(numc);
    }

    @RequestMapping(value = "/Caissemode/{code}", method = RequestMethod.GET)
    public List<Caisse> chercherCaissesParModeCode(@PathVariable("code") Long code) {
        return caisseService.chercherCaissesbyModeCode(code);
    }

    
    @RequestMapping(value = "/fermerJournalCaisse/{numC}",method = RequestMethod.PUT)
    public void fermerJournalCaisse(@PathVariable("numC") Long numc) {
         caisseService.fermerJournalCaisse(numc);
    }
}

package com.backend.caisse.RestController;

import java.util.List;

import com.backend.caisse.service.CaissierService;
import com.backend.caisse.entities.Caissier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/caissierapi")
@CrossOrigin(origins = "*")

public class CaissierRestController {

    @Autowired
    CaissierService CaissierService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Caissier> listerCaissiers() {
        return CaissierService.listerCaissiers();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Caissier ajouterCaissier(@RequestBody Caissier Caissier) {
        return CaissierService.ajouterCaissier(Caissier);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Caissier modifierCaissier(@RequestBody Caissier Caissier) {
        return CaissierService.modifierCaissier(Caissier);
    }

    @RequestMapping(value = "/{matricule}", method = RequestMethod.GET)
    public Caissier consulterCaissier(@PathVariable("matricule") Long matricule) {
        return CaissierService.consulterCaissier(matricule);
    }

    @RequestMapping(value = "/desactiverCaissier/{matricule}", method = RequestMethod.PUT)
    public void desactiverCaissier(@PathVariable("matricule") Long mat) {
        CaissierService.desactiverCaissierByMat(mat);
    }

    @RequestMapping(value = "/activerCaissier/{matricule}", method = RequestMethod.PUT)
    public void activerCaissier(@PathVariable("matricule") Long mat) {
        CaissierService.activerCaissierByMat(mat);
    }

}

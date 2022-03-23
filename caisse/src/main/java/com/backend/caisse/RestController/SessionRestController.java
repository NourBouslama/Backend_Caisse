package com.backend.caisse.RestController;

import java.util.List;

import com.backend.caisse.entities.SessionCaisse;
import com.backend.caisse.service.SessionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/session")
@CrossOrigin(origins = "*")
public class SessionRestController {
    @Autowired
    SessionService sessionService;

    @RequestMapping(path = "all", method = RequestMethod.GET)
    public List<SessionCaisse> listerSessionCaisses() {
        return sessionService.listerSessionCaisses();
    }

    @RequestMapping(value = "/{numS}", method = RequestMethod.GET)
    public SessionCaisse cosulterSessionCaisse(@PathVariable("numS") Long numS) {
        return sessionService.consulterSessionCaisse(numS);
    }

    @RequestMapping(method = RequestMethod.POST)
    public SessionCaisse CréerSessionCaisse(@RequestBody SessionCaisse SessionCaisse) {
        return sessionService.CréerSessionCaisse(SessionCaisse);
    }

    @RequestMapping(value = "/fermerCaisse/{NumS}",method = RequestMethod.PUT)
    public void fermerSessionCaisse(@PathVariable("NumS") Long nums) {
        sessionService.fermerSessionCaisseById(nums);
    }

    @RequestMapping(value = "/ouvrirCaisse/{NumS}",method = RequestMethod.PUT)
    public void OuvrirSessionCaisse(@PathVariable("NumS") Long nums) {
        sessionService.OuvrirSessionCaisseById(nums);
    }

}

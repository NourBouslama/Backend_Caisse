package com.backend.caisse.entities;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class SessionCaisse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long NumS;
    private double montantInit;
    private double montantSession;
    private Date dateOuverture;
    private Date datefermeture;
    private Long nbFacture;
    private String etat="en cours"; 

    @ManyToOne
    private Caisse caisse;

    @ManyToOne
    private Caissier caissier;
    
}

package com.backend.caisse.entities;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
public class Caissier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long matricule;
    private String prenom;
    private String nom;
    private String adresse;
    private String email;
    private String etat;
    private String poste;

   @OneToMany(mappedBy = "caissier")
    private List<SessionCaisse> sessions;
    
}

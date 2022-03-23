package com.backend.caisse.entities;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
public class Caisse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numC;
    private String etat="activé";
    private String etatJournal;

    @OneToMany(mappedBy = "caisse")
    private List<SessionCaisse> sessions;
    
    @ManyToMany(mappedBy = "caisses")
    private List<ModePaiement> modes;

  
    
}

package com.backend.caisse.entities;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

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
public class ModePaiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;
    private String libelle;
    private String etatM;
   
    @ManyToMany
    @JoinTable(
        name="affect_mode",
        joinColumns = @JoinColumn(name="mode_id"),
        inverseJoinColumns = @JoinColumn(name="caisse_id")
    )
    private List<Caisse> caisses;

    
}
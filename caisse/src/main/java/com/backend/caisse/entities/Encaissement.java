package com.backend.caisse.entities;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

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
public class Encaissement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idE;
    private Date dateE;
    private double montantE;

    @OneToOne(mappedBy="encaissement")
    private Paiement paiement;
    
}

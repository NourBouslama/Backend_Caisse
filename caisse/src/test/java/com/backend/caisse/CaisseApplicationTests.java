package com.backend.caisse;

import com.backend.caisse.entities.Caisse;
import com.backend.caisse.repos.CaisseRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CaisseApplicationTests {

	/*@Test
	void contextLoads() {
	}*/

	@Autowired
    private CaisseRepository caisseRepository;

	@Test
    public void testdesactiverEtat() {
    //Caisse prod = new Livre("apprendre à aimer",25,"fff");
    //livreRepository.save(prod);
	/*Caisse c=new Caisse();
	caisseRepository.save(c);*/
	caisseRepository.updateEtatAct(2);
	}

}

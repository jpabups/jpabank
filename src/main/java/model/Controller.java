package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Controller {
	
	public boolean test(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpabups");
		EntityManager em = emf.createEntityManager();
		
		Kunde k = new Kunde();
		k.setName("Walter");
		
		em.getTransaction().begin();
		em.persist(k);
		em.getTransaction().commit();
		em.close();
		emf.close();
		return true;
	}

}

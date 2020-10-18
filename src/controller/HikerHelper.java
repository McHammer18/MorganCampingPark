package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import models.Hiker;
import models.camper;

public class HikerHelper {
	static	EntityManagerFactory	emfactory	=	
			Persistence.createEntityManagerFactory("CampingPark");
	
	public void insertItem(Hiker h ) {
		EntityManager	em	=	emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(h);
		em.getTransaction().commit();
		em.close();
	}
	
	public	void deleteItem(Hiker toDelete)	{
		EntityManager	em	=	emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Hiker> typedQuery = em.createQuery("select c from hiker c where c.firstName = :firstName and c.lastName = :selectedName and c.phone = :phone", Hiker.class);
		
		typedQuery.setParameter("firstName",	toDelete.getFirstName());
		typedQuery.setParameter("lastName",	toDelete.getLastName());
		typedQuery.setParameter("phone", toDelete.getPhone());
		
		//gives one result
		typedQuery.setMaxResults(1);
		
		//get the result and save it into a	new	list item
		Hiker result	= typedQuery.getSingleResult();
		
		//remove it
		em.remove(result);
		em.getTransaction().commit();
		em.close();
		}
	
	
}

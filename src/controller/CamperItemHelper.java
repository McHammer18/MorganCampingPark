package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import models.camper;

public class CamperItemHelper {
	static	EntityManagerFactory	emfactory	=	
			Persistence.createEntityManagerFactory("CampingPark");
	//Method to insert new items to the table
	public void insertItem(camper c) {
		EntityManager	em	=	emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		em.close();
	}
	//Method to show all items in the table
	public List<camper> showAllItems(){
		EntityManager em = emfactory.createEntityManager();
		List<camper> allItems = em.createQuery("SELECT i FROM TeamItem i").getResultList();
		return allItems;
	}
	
	public	void	deleteItem(camper	toDelete)	{
		EntityManager	em	=	emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<camper> typedQuery = em.createQuery("select c from camper c where c.firstName and c.lastName = :selectedName and c.phone = :selectedPhone", camper.class);
		
		typedQuery.setParameter("selectedCity",	toDelete.getFirstName());
		typedQuery.setParameter("selectedNickName",	toDelete.getLastName());
		typedQuery.setParameter("selectedNumOfPlayers", toDelete.getPhone());
		
		//gives one result
		typedQuery.setMaxResults(1);
		
		//get the result and save it into a	new	list item
		camper result	= typedQuery.getSingleResult();
		
		//remove it
		em.remove(result);
		em.getTransaction().commit();
		em.close();
		}
	public List<camper> searchForItemByCamper(String camperName) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<camper> typedQuery	= em.createQuery("select c from camper c where c.firsrName = :selectedFisrtName", camper.class);
		typedQuery.setParameter("selectedFisrtName",	camperName);
		List<camper> foundItems =	typedQuery.getResultList();
		em.close();
		return	foundItems;
		}
	
	public camper searchForItemById(int idToEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		camper found = em.find(camper.class, idToEdit);
		em.close();
		return	found;
	}
	public void updateItem(camper toEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.merge(toEdit);
		em.getTransaction().commit();
		em.close();
		
	}
	public void cleanUp() {
		emfactory.close();
	}
	
	
}

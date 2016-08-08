package util;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import controller.ClientDM;
import controller.PeopleDM;
import model.Client;
import model.People;
import model.Project;
import model.ProjectPeople;

public class PersistInitialData {
	
	private ArrayList<Client> clientloadedData = null;
	private ArrayList<People> peopleaLoadedData =null;
	private ArrayList<ProjectPeople>  projectPeopleLoadedData;
	private ArrayList<Project> projectLoadedData;
	private final EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("ECC-BillingSystem");
	private final EntityManager entityManager = entityManagerFactory.createEntityManager();
	private EntityTransaction entityTransaction = null;


	
	public PersistInitialData(){
		
		
	}
	
	public void initPeopleData(){
	  PeopleDM peopleDMone = new PeopleDM ("src/data/employee_treatedData.csv");
	  peopleaLoadedData =  peopleDMone.getPeopleData();
		
		try{
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			for (People people:this.peopleaLoadedData){ 
			entityManager.persist(people);
			entityTransaction.commit();	

			}
		}
		catch(RuntimeException e){
			
			if (entityTransaction.isActive()){
		     	entityTransaction.rollback();
			}
				throw e;
					
		}	
  	
	  

	}
	
	public void initClientData(){
	  ClientDM clientDMone = new ClientDM ("src/data/client_dataToload.csv");
	  clientloadedData = clientDMone.getClientData();
	  
		try{
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			

			for (Client client: clientloadedData){ 
			entityManager.merge(client);

			}
			entityTransaction.commit();	

			
		}
		catch(RuntimeException e){
			
			if (entityTransaction.isActive()){
		     	entityTransaction.rollback();
			}
				throw e;
					
      	}	
	  
	}
	
	

	



}

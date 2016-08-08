

import java.awt.EventQueue;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Client;
import model.Role;
import controller.ClientDM;
import controller.EmployeeDM;
import ecc_UI.SystemJFrame;


public class Main {

	public static void main(String[] args) {

	
//	Role accountant =  new Role("Accountant");
//	Role dev =  new Role("Develloper");
//	Role pm =  new Role("ProjectManager");

	
	
//	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ECC-BillingSystem");
//	EntityManager entityManager = entityManagerFactory.createEntityManager();
//	
//	EntityTransaction entityTransaction = null;
//	
//	try{
//		entityTransaction = entityManager.getTransaction();
//		entityTransaction.begin();
//		
//
//
//		
//		entityTransaction.commit();	
//	}
//	catch(RuntimeException e){
//		
//		if (entityTransaction.isActive()){
//	     	entityTransaction.rollback();
//		}
//			throw e;
//				
//	}	
//	
	  EmployeeDM testOe = new EmployeeDM("/Users/gustavemugabo/Downloads/Sample Data(1)/employee_treatedData.csv");
	   testOe.initEmployee();
		ClientDM testOne = new ClientDM("/Users/gustavemugabo/Downloads/Sample Data(1)/client_dataToload.csv");
		List <Client> cleints =  testOne.getClientData();
		int i=1;

		for (Client cleint : cleints){
			System.out.println(i +" "+ cleint.getCity());	
			i++;
			
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SystemJFrame frame = new SystemJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}

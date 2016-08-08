package controller;



import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Employee;
import model.Role;

public class EmployeeDM {
	
	
	private ArrayList<Employee> employeeData;
	static Role accountant =  new Role("Accountant");
	static Role dev =  new Role("Developer");
	static Role pm =  new Role("Project Manager");
	
	  
	
	
	 public EmployeeDM(String filename){
		 employeeData =  new ArrayList<Employee>();	
		 LoadDatafromFile(filename);
		 initRoles();
		 
			for (Employee employee:employeeData){
	             if(employee.getFileImportedRole().equals("Project Manager")){
	            	 employee.setRole(pm);
	             }else if(employee.getFileImportedRole().equals("Developer")){
	            	 employee.setRole(dev);
	             }else{
	            	 employee.setRole(accountant);
	             }
			}
		 
	 }
	 
	 public int getNumberofEmployeeImported(){
		 
		 return employeeData.size();
	 }
	 
  public void LoadDatafromFile(String filename){
	String[] token;
	String line = null;	
	try{
	Scanner scanner = new Scanner(new FileReader(filename));
	
   scanner.nextLine();
   line= scanner.nextLine();  // get the line 
   while(scanner.hasNextLine()){
    
   	token = line.split(","); // split on;   
 	     Employee data =  new Employee();
   	     int id = Integer.parseInt(token[0]);
   	     data.setId(id);
   	     data.setFirst_name(token[1]);
   	     data.setLast_name(token[2]);
   	     data.setTitle(token[3]);
   	     int billRate =Integer.parseInt(token[4]);
   	     data.setBillRate(billRate);
   	     data.setFileImportedRole(token[5]);
   	     data.setUserName(token[6]);
   	     data.setPassword(token[7]);
   	     data.setConfirmPassWord(token[8]);

 	     
   	   	 employeeData.add(data);

   	     

   
       }
          scanner.close();
       }	// end of try block 

	      catch (Exception e){
	    	 System.out.println("Error:" +e.getMessage());  
	      }
	      }


	public void initEmployee(){
				
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ECC-BillingSystem");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = null;
		
		try{
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			
			entityManager.persist(accountant);
			entityManager.persist(dev);
			entityManager.persist(pm);
			for (Employee employee:this.employeeData){ 
			entityManager.persist(employee);
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
 public static void initRoles(){
		
		
	
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ECC-BillingSystem");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = null;
		
		try{
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			
			entityManager.persist(accountant);
			entityManager.persist(dev);
			entityManager.persist(pm);
			
			
		}
		catch(RuntimeException e){
			
			if (entityTransaction.isActive()){
		     	entityTransaction.rollback();
			}
				throw e;
					
		}	
  	
		
	}
}

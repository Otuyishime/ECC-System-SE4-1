package controller;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;


import model.Client;
public class ClientDM {
	private ArrayList<Client> clientData;
	
	 public ArrayList<Client> getClientData() {
		return clientData;
	}
	public void setClientData(ArrayList<Client> clientData) {
		this.clientData = clientData;
	}
	public ClientDM(String filename){
		 clientData =  new ArrayList<Client>();	
		 LoadDatafromFile(filename);			
	 
	 }
	  public void LoadDatafromFile(String filename){
			String[] token;
			String line = null;	
			try{
			Scanner scanner = new Scanner(new FileReader(filename));
		   scanner.nextLine();

		   while(scanner.hasNextLine()){
		       
		   	line= scanner.nextLine();  // get the line
		   	token = line.split(","); // split on;   
		 	     Client data =  new Client();
		   	     int id = Integer.parseInt(token[0]);
		   	     data.setIdNumber(id);
		   	     data.setClientName(token[1]);
		   	     data.setLineOne(token[2]);
		   	     data.setLineTwo(token[3]);
		   	     data.setCity(token[4]);
		   	     data.setState(token[5]);
		   	     data.setZipCode(token[6]);
		   	     data.setEmail(token[7]);
		   	     data.setContact(token[8]);
		   	     data.setFreq(token[9]);
		   	     data.setTerms(token[10]);
		   	     data.setInvoiceGrouping(token[11]);

		 	     
		   	  clientData.add(data);

	   	  
		       }
		          scanner.close();
		       }	// end of try block 

			      catch (Exception e){
			    	 System.out.println("Error:" +e.getMessage());  
			      }
			      }
	  
		
}

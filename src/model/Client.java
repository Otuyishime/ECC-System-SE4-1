package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CLIENT")
public class Client {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idNumber;
	
	  @Column(name="CLIENT_AME")
	private String clientName;
	  
	  @Column(name="CLIENT_ADD_ONE")
	private String addressLineOne;
	  
	  @Column(name="CLIENT_ADD_TWO")
	private String addressLineTwo;
	  
	  @Column(name="CLIENT_CITY")
	private String  City;
	  
	  @Column(name="CLIENT_STATE")
	private String State;
	  
	  @Column(name="CLIENT_ZIPCODE")
	private String zipCode;	
	  
	  @Column(name="CLIENT_EMAIL")
	private String Email;
	  
	  @Column(name="CLIENT_CONTACT")
	private String Contact;
	  
	  @Column(name="CLIENT_BILLING_FREQ")
	private String billingFreq;
	  
	  @Column(name="CLIENT_TERMS")
	private String  Terms;
	  
	  @Column(name="CLIENT_INVOICEGROUPING")
	private String  invoiceGrouping;

public Client(){
	
}

public int getIdNumber() {
	return idNumber;
}

public void setIdNumber(int idNumber) {
	this.idNumber = idNumber;
}

public String getClientName() {
	return clientName;
}

public void setClientName(String clientName) {
	this.clientName = clientName;
}

public String getLineOne() {
	return addressLineOne;
}

public void setLineOne(String lineOne) {
	addressLineOne = lineOne;
}

public String getLineTwo() {
	return addressLineTwo;
}

public void setLineTwo(String lineTwo) {
	addressLineTwo = lineTwo;
}

public String getCity() {
	return City;
}

public void setCity(String city) {
	City = city;
}

public String getState() {
	return State;
}

public void setState(String state) {
	State = state;
}

public String getZipCode() {
	return zipCode;
}

public void setZipCode(String zipCode) {
	this.zipCode = zipCode;
}

public String getEmail() {
	return Email;
}

public void setEmail(String email) {
	Email = email;
}

public String getContact() {
	return Contact;
}

public void setContact(String contact) {
	Contact = contact;
}

public String getFreq() {
	return billingFreq;
}

public void setFreq(String freq) {
	billingFreq = freq;
}

public String getTerms() {
	return Terms;
}

public void setTerms(String terms) {
	Terms = terms;
}

public String getInvoiceGrouping() {
	return invoiceGrouping;
}

public void setInvoiceGrouping(String invoiceGrouping) {
	this.invoiceGrouping = invoiceGrouping;
}


}
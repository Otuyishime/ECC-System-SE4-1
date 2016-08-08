package model;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Persistence;
import javax.persistence.Table;


 @Entity
 @Table(name="EMPLOYEE")
public class People {
	
	  @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	   private int id;
	  @Column(name="EMPLOYEE_FIRST_NAME")
	   private String first_name;
	 @Column(name="EMPLOYEE_LAST_NAME")
	   private String last_name; 
	 @Column(name="EMPLOYEE_TITLE")
	   private String title;
	 @Column(name="BILL_RATE")
	   private int billRate;
	 @ManyToOne(cascade = {CascadeType.MERGE},fetch= FetchType.EAGER)
	   private Role role;
	 @Column(name="EMPLOYEE_USERNAME")
	   private String userName;
	 @Column(name="EMPLOYE_PASSWORD")
	   private String password;
	 @Column(name="EMPLOYEE_CONFIRM_PASSWORD")
	 private String confirmPassWord;
	 private String fileImportedRole;

	 public People(){
		 
	 }
	 
//	   public Employee(int id, String first_name, String last_name, String title,
//			int billRate, Role role, String userName, String password,
//			String confirmPassWord) {
//		super();
//		this.id = id;
//		this.first_name = first_name;
//		this.last_name = last_name;
//		this.title = title;
//		this.billRate = billRate;
//		this.role = role;
//		this.userName = userName;
//		this.password = password;
//		this.confirmPassWord = confirmPassWord;
//	}
//	   // for file loading purpose only
//	   public Employee(int id, String first_name, String last_name, String title,
//				int billRate,String roleFromfile, String userName, String password,
//				String confirmPassWord) {
//			super();
//			this.id = id;
//			this.first_name = first_name;
//			this.last_name = last_name;
//			this.title = title;
//			this.billRate = billRate;
//			this.fileImportedRole=roleFromfile;
//			this.userName = userName;
//			this.password = password;
//			this.confirmPassWord = confirmPassWord;
//		}

 

	public String getFileImportedRole() {
		return fileImportedRole;
	}
	public void setFileImportedRole(String fileImportedRole) {
		this.fileImportedRole = fileImportedRole;
	}
	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public int getBillRate() {
		return billRate;
	}



	public void setBillRate(int billRate) {
		this.billRate = billRate;
	}






	public String getLast_name() {
		return last_name;
	}



	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}



	public Role getRole() {
		return role;
	}



	public void setRole(Role role) {
		this.role = role;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getConfirmPassWord() {
		return confirmPassWord;
	}



	public void setConfirmPassWord(String confirmPassWord) {
		this.confirmPassWord = confirmPassWord;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	   
}

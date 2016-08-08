package model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import utility.Status;
import ecc_DAO.Developer_DAO;
import ecc_DAO.ProjectManager_DAO;


@Entity
@Table(name="PROJECT")
public class Project {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int  projectId;
    @Column(name="PROJECT_NAME")
    private String projectName;
    
    @Column(name="PROJECT_STATUS")
	private  Boolean projectStatus;
    
    @Column(name="PROJECT_DESCRIPTION")
	private String projectDescription;
    
    @Column(name="PROJECT_OWNER")
	private String projectOwner;
    
    @Column(name="PROJECT_BUDGET")
	private Double projectBudget;
    
    @Column(name="PROJECT_DURATION_IN_HOURS")
	private int projectDurationInHours;
    
//    @Column(name="PROJECT_BIILLED_AMOUNT")
//	private Double projectBilledAmount;
//    
//    @Column(name="PROJECT_NAME")
//	private Double projectBalanceAmount;
   
   
    @Column(name="PROJECT_ASSIGNED_EMPLOYEE")
  //  @OneToMany(targetEntity=Employee.class)
	private ArrayList<Employee> assignedEmployee;
    
	private boolean canHaveInvoicePerProject;

}

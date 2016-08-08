package model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Role {
    
	@Id
	@GeneratedValue	
	private int roleId;
	 @Column(name="ROLE")
	 private String role;
	
	public Role(){
		
		
	}
	public Role( String role){
		
		this.role = role;	
		
	}

	public int getiD() {
		return roleId;
	}

	public void setiD(int iD) {
		this.roleId = iD;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
}

package net.codejava.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity

@Table(name = "Shedule")
public class Shedule {

	@Id
	private String fullname;
	
	@Column(name = "shedule_name",  nullable = false, unique = true, length = 45)
	private String sheduleName;
	
	
	
	 


	public String getFullname() {
		return fullname;
	}



	public void setFullname(String fullname) {
		this.fullname = fullname;
	}



	public String getSheduleName() {
		return sheduleName;
	}



	public void setSheduleName(String sheduleName) {
		this.sheduleName = sheduleName;
	}







	public Shedule(String fullname, String sheduleName) {
		super();
		this.fullname = fullname;
		this.sheduleName = sheduleName;
	}



	@Override
	public String toString() {
		return "Shedule [fullname=" + fullname + ", sheduleName=" + sheduleName + ", check="  + "]";
	}



	public Shedule() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	

}

package net.codejava.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "exam")
public class Exam {
	

	public Exam(String fullname, String exami, String skills, String email) {
		super();
		this.fullname = fullname;
		this.exami = exami;
		this.skills = skills;
		this.email = email;
	}

	@Id
	@Column(name = "Question1" , nullable = false, unique = true, length = 45)
	private String fullname;
	
	
	
	@Column(name = "Question2" , nullable = false, unique = true, length = 45)
	private String exami;
	

	@Column(name = "Question3" , nullable = false, unique = true, length = 45)
	private String skills;
	
	
	@Column(name = "Question4" , nullable = false, unique = true, length = 45)
	private String email;
	


	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getExami() {
		return exami;
	}

	public void setExami(String exami) {
		this.exami = exami;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	@Override
	public String toString() {
		return "Exam [fullname=" + fullname + ", exami=" + exami + ", skills=" + skills + ", email=" + email + "]";
	}

	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}

	
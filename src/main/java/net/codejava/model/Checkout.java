package net.codejava.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Checkout")
public class Checkout {
	
	@Id
	@Column(name = "fullname" , nullable = false, unique = true, length = 45)
	private String fullname;
	
	 
	@Column(name = "email" , nullable = false, unique = true, length = 45)
	private String email;
	

	@Column( name = "address",nullable = false, length = 64)
	private String address;



	@Column( name = "city " ,nullable = false, length = 64)
	private String city;


	@Column( name = "state",nullable = false, length = 64)
	private String state;
	
	@Column(name = "zip" ,nullable = false, length = 64)
	private int zip;
	

	@Column( name = "namecard" ,nullable = false, length = 64)
	private String namecard;
	@Column(name = "cno",nullable = false, length = 64)
	private int cno;
	@Column(name = "expmonth" ,nullable = false, length = 64)
	private String expmonth;
	
	@Column(name = "expyear",nullable = false, length = 64)
	private int expyear;
	

	@Column(name = "cvv" ,nullable = false, length = 64)
	private int cvv;


	public String getFullname() {
		return fullname;
	}


	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	  
	 
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public int getZip() {
		return zip;
	}


	public void setZip(int zip) {
		this.zip = zip;
	}


	public String getNamecard() {
		return namecard;
	}


	public void setNamecard(String namecard) {
		this.namecard = namecard;
	}


	public int getCno() {
		return cno;
	}


	public void setCno(int cno) {
		this.cno = cno;
	}


	public String getExpmonth() {
		return expmonth;
	}


	public void setExpmonth(String expmonth) {
		this.expmonth = expmonth;
	}


	public int getExpyear() {
		return expyear;
	}


	public void setExpyear(int expyear) {
		this.expyear = expyear;
	}


	public int getCvv() {
		return cvv;
	}


	public void setCvv(int cvv) {
		this.cvv = cvv;
	}


	public Checkout(String fullname, String email, String address, String city, String state, int zip,
			String namecard, int cno, String expmonth, int expyear, int cvv) {
		super();
		this.fullname = fullname;
		this.email = email;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.namecard = namecard;
		this.cno = cno;
		this.expmonth = expmonth;
		this.expyear = expyear;
		this.cvv = cvv;
	}


	@Override
	public String toString() {
		return "Checkout [fullname=" + fullname + ", , email=" + email + ", address=" + address
				+ ", city=" + city + ", state=" + state + ", zip=" + zip + ", namecard=" + namecard + ", cno=" + cno
				+ ", expmonth=" + expmonth + ", expyear=" + expyear + ", cvv=" + cvv + "]";
	}


	public Checkout() {
		super();
		// TODO Auto-generated constructor stub
	}


	

	
	


	
}

package net.codejava.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "list")
public class listofexam {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long examcode;
	
	@Column(name = "examname" ,nullable = false, unique = true, length = 45)
	private String examname;
	

	
	@Column(name = "duration", nullable = false, length = 20)
	private String duration;
	
	@Column(name = "price", nullable = false, length = 20)
	private String price;


	@Column(name = "passingscore", nullable = false, length = 20)
	private long pscore;

	
	
	
	
    public listofexam() {
		super();
		// TODO Auto-generated constructor stub
	}


	public listofexam(Long examcode, String examname, String duration, String price, long pscore) {
		super();
		this.examcode = examcode;
		this.examname = examname;
		this.duration = duration;
		this.price = price;
		this.pscore = pscore;
	}


	public Long getExamcode() {
		return examcode;
	}


	public void setExamcode(Long examcode) {
		this.examcode = examcode;
	}


	public String getExamname() {
		return examname;
	}


	public void setExamname(String examname) {
		this.examname = examname;
	}


	public String getDuration() {
		return duration;
	}


	public void setDuration(String duration) {
		this.duration = duration;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public long getPscore() {
		return pscore;
	}


	public void setPscore(long pscore) {
		this.pscore = pscore;
	}



	@Override
	public String toString() {
		return "listofexam [examcode=" + examcode + ", examname=" + examname + ", duration=" + duration + ", price="
				+ price + ", pscore=" + pscore + "]";
	}
	
	

}





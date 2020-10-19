package models;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import controller.LocalDateAttributeConverter;

@Entity
@Table(name="hiker")
public class Hiker {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="HIKER_ID")
	private int id;
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column(name="HIKER_DATE")
	private Date date;
	@Column(name="PHONE")
	private String phone;
	
	//constructors
	public Hiker() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	public Hiker(int id, String firstName, String lastName, String phone, Date date) {
		super();
		//LocalDateAttributeConverter ld = new LocalDateAttributeConverter();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		//this.date = ld.convertToDatabaseColumn(date);
		this.date = date;
	}

	public Hiker(String firstName, String lastName, String phone, Date date) {
	super();
	//LocalDateAttributeConverter ld = new LocalDateAttributeConverter();
	this.firstName = firstName;
	this.lastName = lastName;
	this.phone = phone;
	//this.date = ld.convertToDatabaseColumn(date);
	this.date = date;
}



	//getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}

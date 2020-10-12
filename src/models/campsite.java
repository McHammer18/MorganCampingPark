package models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="camp_grounds")
public class campsite {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CAMP_ID")
	private int id;
	@Column(name="CAMP_NAME")
	private String campName;
	@Column(name="ARRIVAL_DATE")
	private Date arrivalDate;
	@Column(name="LEAVING_DAY")
	private Date leavingDate;
	@ManyToOne (cascade=CascadeType.PERSIST)
	@JoinColumn(name="CAMPER_ID")
	private camper camper;
	
	//constructors
	public campsite() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public campsite(int id, String campName, Date arrivalDate, Date leavingDate, models.camper camper) {
		super();
		this.id = id;
		this.campName = campName;
		this.arrivalDate = arrivalDate;
		this.leavingDate = leavingDate;
		this.camper = camper;
	}
	
	//getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampName() {
		return campName;
	}

	public void setCampName(String campName) {
		this.campName = campName;
	}

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public Date getLeavingDate() {
		return leavingDate;
	}

	public void setLeavingDate(Date leavingDate) {
		this.leavingDate = leavingDate;
	}


	public camper getCamper() {
		return camper;
	}


	public void setCamper(camper camper) {
		this.camper = camper;
	}
	
	
}

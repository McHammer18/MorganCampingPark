package models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="activities")
public class activities {
	@Id
	@ManyToOne (cascade=CascadeType.PERSIST)
	@JoinColumn(name="CAMPER_ID")
	private camper camper;
	@Column(name="HIKING")
	private boolean hiking;
	@Column(name="CAMPING")
	private boolean fishing;
	@Column(name="BOATING")
	private boolean boating;

	//constructors
	public activities() {
		super();
		// TODO Auto-generated constructor stub
	}

	public activities(int id, models.camper camper, boolean hiking, boolean fishing, boolean boating) {
		super();
		this.camper = camper;
		this.hiking = hiking;
		this.fishing = fishing;
		this.boating = boating;
	}



	//getters and setters
	public camper getCamper() {
		return camper;
	}

	public void setCamper(camper camper) {
		this.camper = camper;
	}
	
	public boolean isHiking() {
		return hiking;
	}

	public void setHiking(boolean hiking) {
		this.hiking = hiking;
	}

	public boolean isFishing() {
		return fishing;
	}

	public void setFishing(boolean fishing) {
		this.fishing = fishing;
	}

	public boolean isBoating() {
		return boating;
	}

	public void setBoating(boolean boating) {
		this.boating = boating;
	}

	
}

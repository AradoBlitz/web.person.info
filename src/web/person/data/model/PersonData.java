package web.person.data.model;

import java.util.Date;

public class PersonData {

	private String firstName;
	
	private String fathersName;
	
	private String lastName;
	
	private Date bearthDay;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFathersName() {
		return fathersName;
	}

	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBearthDay() {
		return bearthDay;
	}

	public void setBearthDay(Date bearthDay) {
		this.bearthDay = bearthDay;
	}	
}

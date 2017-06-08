package CAS;

import java.time.LocalDate;

import CAdbConnection.DbFetch;

/**
 * 
 * @author 986021
 * This class will be initiated by the create patient form
 * all the information will be saved in the database
 */
public class Patient extends Person {

	public Patient(String personId, String firstName, String lastName, String ssn, LocalDate dob, String country,
			String passportNo) {
		super(personId, firstName, lastName, ssn, dob, country, passportNo);
		
	}

	private String bloodGroup;

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public Patient getPatient(int PatientId){
		DbFetch dbF=new DbFetch();
		dbF.fetch
		return new Patient();
	}
}

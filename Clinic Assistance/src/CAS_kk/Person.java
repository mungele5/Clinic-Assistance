package CAS;

import java.time.LocalDate;

public class Person {
	private String personId;
	private String firstName;
	private String middleName;
	private String lastName;
	private LocalDate dob;
	private String ssn;
	private String passportNo;
	private String country;

	public Person(String pId, String fName, String mName, String lName, LocalDate dob, String ssn, String country,
			String ppNo) {
		this.personId = pId;
		this.firstName = fName;
		this.setMiddleName(mName);
		this.lastName = lName;
		this.dob = dob;
		this.ssn = ssn;
		this.country = country;
		this.passportNo = ppNo;

	}

	public Person(String[] str) {
		this.personId = str[0];
		this.firstName = str[1];
		this.setMiddleName(str[2]);
		this.lastName = str[3];
		this.dob = LocalDate.parse(str[4].split(" ")[0]);
		this.ssn = str[5];
		this.country = str[6];
		this.passportNo = str[7];

	}

	public String getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}
}

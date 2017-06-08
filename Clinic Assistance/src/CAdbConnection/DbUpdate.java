package CAdbConnection;

import java.util.Date;

public class DbUpdate {
	DbConnection dbCon = DbConnection.getInstance();

	public void insertPerson(String fName, String mName, String lName, String dob, String ssn, String country,
			String ppNo) {
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT INTO person " + "(fName,mName,lName,dob,ssn,country,passportNo) " + "VALUES (");
		sb.append("'" + fName + "',");
		sb.append("'" + mName + "',");
		sb.append("'" + lName + "',");
		sb.append("'" + dob + "',");
		if (ssn.trim() == "")
			sb.append("NULL,");
		else
			sb.append("'" + ssn + "',");
		sb.append("'" + country + "',");
		sb.append("'" + ppNo + "');");
		dbCon.executeQuery(sb.toString());

	}

	public void updatePerson(String personId, String fName, String mName, String lName, String dob, String ssn,
			String country, String ppNo) {
		StringBuilder sb = new StringBuilder();
		sb.append("Update person set ");

		sb.append("fName = '" + fName + "',");
		sb.append("mName = '" + mName + "',");
		sb.append("lName = '" + lName + "',");
		sb.append("dob = '" + dob + "',");
		sb.append("ssn = '" + ssn + "',");
		sb.append("country = '" + country + "',");
		sb.append("passportNo = '" + ppNo + "'");
		sb.append(" where personId = '" + personId + "'");
		dbCon.executeQuery(sb.toString());

	}

	public void insertDoctor(String fName, String mName, String lName, String dob, String ssn, String country,
			String ppNo, String specialization) {
		insertPerson(fName, mName, lName, dob, ssn, country, ppNo);
		DbFetch dbF = new DbFetch();
		String personId = dbF.fetchNewPerson();
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT INTO doctor " + "(personId,specialization) " + "VALUES (");
		sb.append("'" + personId + "',");
		sb.append("'" + specialization + "');");
		dbCon.executeQuery(sb.toString());

	}

	public void updateDoctor(String doctorId, String personId, String fName, String mName, String lName, String dob,
			String ssn, String country, String ppNo, String specialization) {
		updatePerson(personId, fName, mName, lName, dob, ssn, country, ppNo);
		StringBuilder sb = new StringBuilder();
		sb.append("Update doctor SET ");
		sb.append("specialization = '" + specialization + "'");
		sb.append(" where doctorId = '" + doctorId + "'");
		dbCon.executeQuery(sb.toString());

	}

	public void insertPatient(String fName, String mName, String lName, String dob, String ssn, String country,
			String ppNo, String description) {
		insertPerson(fName, mName, lName, dob, ssn, country, ppNo);
		DbFetch dbF = new DbFetch();
		String personId = dbF.fetchNewPerson();
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT INTO patient " + "(personId,description) " + "VALUES (");
		sb.append("'" + personId + "',");
		sb.append("'" + description + "');");
		dbCon.executeQuery(sb.toString());

	}

	public void updatePatient(String patientId, String personId, String fName, String mName, String lName, String dob,
			String ssn, String country, String ppNo, String description) {
		updatePerson(personId, fName, mName, lName, dob, ssn, country, ppNo);
		StringBuilder sb = new StringBuilder();
		sb.append("Update doctor SET ");
		sb.append("description = '" + description + "'");
		sb.append(" where patientId = '" + patientId + "'");
		dbCon.executeQuery(sb.toString());

	}

	public void addAppointment(String personId, String doctorId, String serviceId, 
			Date startTime, Date endTime) {
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT INTO appointment " + "(doctorId,patientId,serviceId,startTime,endTime) "
				+ "VALUES (");
		sb.append("'" + doctorId + "',");
		sb.append("'" + doctorId + "',");
		sb.append("'" + serviceId + "',");
		sb.append("'" + startTime + "',");
		sb.append("'" + endTime + "');");
		dbCon.executeQuery(sb.toString());
	}

	public void clockIn(String appointmentId, Date clockInTime) {
		StringBuilder sb = new StringBuilder();
		sb.append("Update appointment SET ");
		sb.append("clockInTime = '" + clockInTime + "' ");
		sb.append("status = 1 ");
		sb.append("where appointmentId = '" + appointmentId + "'");
		dbCon.executeQuery(sb.toString());
	}

	public void clockOut(String appointmentId, Date clockOutTime) {
		StringBuilder sb = new StringBuilder();
		sb.append("Update appointment SET ");
		sb.append("clockOutTime = '" + clockOutTime + "' ");
		sb.append("status = 2 ");
		sb.append("where appointmentId = '" + appointmentId + "'");
		dbCon.executeQuery(sb.toString());
	}
	/*
	 * public void clockOut(String appointmentId, Date clockOutTime) {
	 * StringBuilder sb =new StringBuilder(); sb.append(
	 * "Update appointment SET "); sb.append("clockOutTime = '" + clockOutTime +
	 * "' "); sb.append("status = 2 "); sb.append("where appointmentId = '" +
	 * appointmentId + "'"); dbCon.executeQuery(sb.toString()); }
	 */

	public DbConnection getConnection() {
		return dbCon;
	}
}

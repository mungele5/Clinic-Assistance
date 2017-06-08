package CAdbConnection;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import com.mysql.jdbc.ResultSetMetaData;

public class DbFetch {

	public DefaultTableModel fetchList(String query) {
		DefaultTableModel table = new DefaultTableModel();
		DbConnection dbCon = DbConnection.getInstance();
		ResultSet set = dbCon.fetchResult(query);
		try {
			ResultSetMetaData metaData = (ResultSetMetaData) set.getMetaData();
			int totalColumn = metaData.getColumnCount();
			Object[] dataRow = new Object[totalColumn];
			if (set != null) {
				for (int i = 1; i <= totalColumn; i++) {
					table.addColumn(metaData.getColumnName(i));
				}
				while (set.next()) {
					for (int i = 1; i <= totalColumn; i++) {
						dataRow[i - 1] = set.getObject(i);
					}
					table.addRow(dataRow);
				}
			}
		} catch (Exception ex) {

		}
		return table;
	}

	public DefaultTableModel personList() {
		return fetchList("Select * from person");
	}

	public DefaultTableModel doctorList() {
		return fetchList("Select * from doctor");
	}

	public DefaultTableModel patientList() {
		return fetchList("Select * from patient");
	}

	public DefaultTableModel appointmentList() {
		return fetchList("Select * from appointment");
	}

	public String fetchLatest(String query) {
		DbConnection dbCon = DbConnection.getInstance();
		ResultSet set = dbCon.fetchResult(query);
		try {
			if (set != null) {
				while (set.next()) {
					String a = set.getObject(1).toString();
					return a;
				}
			}
		} catch (Exception ex) {

		}
		return "";
	}

	public String fetchNewPerson() {
		return fetchLatest("select max(personId) newEntry from person");
	}

	public DefaultTableModel fetchTreatmentInfo() {
		return fetchList("select * from service where serviceName = 'Treatment'");
	}

	public DefaultTableModel fetchConsultationInfo() {
		return fetchList("select * from service where serviceName = 'Consultation'");
	}

	public DefaultTableModel fetchPersonInfo(String personId) {
		return fetchList("select * from person where personId = '" + personId + "'");
	}

	public DefaultTableModel fetchPatientInfo(String patientId) {
		return fetchList("select * from patient where patientId = '" + patientId + "'");
	}

	public DefaultTableModel fetchDoctorInfo(String doctorId) {
		return fetchList("select * from doctor where doctorId = '" + doctorId + "'");
	}

	public DefaultTableModel fetchAppointmentInfo(String appointmentId) {
		return fetchList("select * from appointment where appointmentId = '" + appointmentId + "'");
	}
}

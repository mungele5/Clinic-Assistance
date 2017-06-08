package CAS;

import java.util.Date;


/*
 * this class will be initiated by form
 * the form will pass the patient ID, appointment
 *  and timestump at clicking checkout
 */
public class ClockIn {
	
	Patient p;
	Appointment app;
	Date Timestamp;
	
	public ClockIn(Patient p, Appointment app,Date Timestamp) {
		super();
		this.p = p;
		this.app = app;
		this.Timestamp=Timestamp;
		this.checkInApp();
	}

	private void checkInApp() {
		// TODO Auto-generated method stub
		app.setCheckIn(this);
		app.setStatus(STATUS.ONGOING);
	}

}

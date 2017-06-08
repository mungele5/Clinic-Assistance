package CAS;

import java.util.*;


/**
 * 
 * @author 986021
 *This class will be initiated from form
 *the form will pass the patient ,Appointment 
 *and time at checkout 
 */
public class ClockOut {

	Patient patient;
	Appointment app;
	Date Timestamp;
	
	ClockOut(Patient p, Appointment app,Date Timestamp){
		this.app=app;
		this.patient=p;
		this.Timestamp=Timestamp;
		this.checkOutApp();
		
	}

	private void checkOutApp() {
		// TODO Auto-generated method stub
		app.setCheckOut(this);
		app.setStatus(STATUS.COMPLETED);
	}
	
	
}

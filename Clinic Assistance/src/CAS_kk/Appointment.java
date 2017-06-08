package CAS;

import java.util.*;


/**
 * 
 * @author 986021
 * This class will be initiated by the create appointment form
 * 
 */
public class Appointment {
	Patient patient;
	Doctor doc;
	Service serc;
	Date start;
	Date end;
	ClockIn checkIn;
	ClockOut checkOut;
	STATUS Status;
	

	public Appointment(Patient patient, Doctor doc, Service serc, Date start,
			Date end) {
		super();
		this.patient = patient;
		this.doc = doc;
		this.serc = serc;
		this.start = start;
		this.end = end;
	}
	
	public Appointment[] getAppointments(Patient p){
		//read the data base for all the appointments
		//this list will be created by looping the results from the database
		Appointment[] appointments= {new Appointment(p,doc,serc,start,end)};
		return appointments;
	
	}
	
	public Appointment getAppointments(int AppointmentId){
		//this method will get the data from database about Appointment 
		//using the AppointmentId and create Appointment object
		return new Appointment(patient,doc,serc,start,end);
	}
	
	
	public ClockIn getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(ClockIn checkIn) {
		this.checkIn = checkIn;
	}
	public ClockOut getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(ClockOut checkOut) {
		this.checkOut = checkOut;
	}

	public STATUS getStatus() {
		return Status;
	}

	public void setStatus(STATUS status) {
		Status = status;
	}

	public Service getSerc() {
		return serc;
	}

	public void setSerc(Service serc) {
		this.serc = serc;
	}

	
}

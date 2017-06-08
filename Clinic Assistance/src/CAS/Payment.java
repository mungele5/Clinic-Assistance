package CAS;

/**
 * 
 * @author 986021
 * This class will be called by UI or CA 
 * it will take the patient 
 * It will use the appointment to get the cost
 * then it will process payment.
 */
public class Payment {
	
	Appointment app;
	Patient patient;
	double cost;
	public Payment(Patient patient, Appointment app) {
		super();
		this.patient = patient;
		this.app = app;
	}
	
	public double getCost(){
		Service service =app.getSerc();
		double cost = service.getCost();
		
		return cost;
		
	}
	
	//Payment will update the database
	public void makePayment(){
		double cost=getCost();
		//write to database
		
	}
}

package fxmlPages;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class CreateAppointmentController {

	    @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private Button btnConfirmAppointment;

	    @FXML
	    private Button btnGoBack;

	    @FXML
	    private Button btnViewAppointments;

	    @FXML
	    private Label labelCountry;

	    @FXML
	    private Label labelFirstName;

	    @FXML
	    private Label labelLastName;

	    @FXML
	    private Label labelMiddleName;

	    @FXML
	    private Label labelPassportNo;

	    @FXML
	    private Label labelSelectDoctor;

	    @FXML
	    private Label labeldob;

	    @FXML
	    private Label labelssn;

	    @FXML
	    private Label personIDlabel;

	    @FXML
	    private TextField personIDtext;

	    @FXML
	    private TextField textCountry;

	    @FXML
	    private TextField textFirstName;

	    @FXML
	    private TextField textLastName;

	    @FXML
	    private TextField textMiddleName;

	    @FXML
	    private TextField textPerson;

	    @FXML
	    private TextField textdob;

	    @FXML
	    private TextField textssn;


	    @FXML
	    void handleConfirmAppointmentButtonAction(ActionEvent event) {
	    }

	    @FXML
	    void handleGoBackButtonAction(ActionEvent event) {
	    }

	    @FXML
	    void handleViewAppointmentButtonAction(ActionEvent event) {
	    }

	    @FXML
	    void initialize() {
	        assert btnConfirmAppointment != null : "fx:id=\"btnConfirmAppointment\" was not injected: check your FXML file 'CreateAppointment.fxml'.";
	        assert btnGoBack != null : "fx:id=\"btnGoBack\" was not injected: check your FXML file 'CreateAppointment.fxml'.";
	        assert btnViewAppointments != null : "fx:id=\"btnViewAppointments\" was not injected: check your FXML file 'CreateAppointment.fxml'.";
	        assert labelCountry != null : "fx:id=\"labelCountry\" was not injected: check your FXML file 'CreateAppointment.fxml'.";
	        assert labelFirstName != null : "fx:id=\"labelFirstName\" was not injected: check your FXML file 'CreateAppointment.fxml'.";
	        assert labelLastName != null : "fx:id=\"labelLastName\" was not injected: check your FXML file 'CreateAppointment.fxml'.";
	        assert labelMiddleName != null : "fx:id=\"labelMiddleName\" was not injected: check your FXML file 'CreateAppointment.fxml'.";
	        assert labelPassportNo != null : "fx:id=\"labelPassportNo\" was not injected: check your FXML file 'CreateAppointment.fxml'.";
	        assert labelSelectDoctor != null : "fx:id=\"labelSelectDoctor\" was not injected: check your FXML file 'CreateAppointment.fxml'.";
	        assert labeldob != null : "fx:id=\"labeldob\" was not injected: check your FXML file 'CreateAppointment.fxml'.";
	        assert labelssn != null : "fx:id=\"labelssn\" was not injected: check your FXML file 'CreateAppointment.fxml'.";
	        assert personIDlabel != null : "fx:id=\"personIDlabel\" was not injected: check your FXML file 'CreateAppointment.fxml'.";
	        assert personIDtext != null : "fx:id=\"personIDtext\" was not injected: check your FXML file 'CreateAppointment.fxml'.";
	        assert textCountry != null : "fx:id=\"textCountry\" was not injected: check your FXML file 'CreateAppointment.fxml'.";
	        assert textFirstName != null : "fx:id=\"textFirstName\" was not injected: check your FXML file 'CreateAppointment.fxml'.";
	        assert textLastName != null : "fx:id=\"textLastName\" was not injected: check your FXML file 'CreateAppointment.fxml'.";
	        assert textMiddleName != null : "fx:id=\"textMiddleName\" was not injected: check your FXML file 'CreateAppointment.fxml'.";
	        assert textPerson != null : "fx:id=\"textPerson\" was not injected: check your FXML file 'CreateAppointment.fxml'.";
	        assert textdob != null : "fx:id=\"textdob\" was not injected: check your FXML file 'CreateAppointment.fxml'.";
	        assert textssn != null : "fx:id=\"textssn\" was not injected: check your FXML file 'CreateAppointment.fxml'.";


	    

	}

}

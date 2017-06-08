package fxmlPages;

import javafx.collections.FXCollections;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class CaHomeController {

	@FXML private Text actiontarget;
	@FXML private PasswordField passwordField;
	@FXML private TextField uname;


	@FXML protected void handlecreateNewAppointmentButtonAction(ActionEvent event) {
	/*	actiontarget.setText("Sign in button pressed");
		CAHome cahome = new CAHome();
		cahome.show();
		//cahome.setStage(this.stage);
		 Platform.setImplicitExit(false);*/
		

	}
	/* @FXML protected void handleNewUserButtonAction(ActionEvent event) {
        actiontarget.setText("Reset button pressed");
        passwordField.clear();
        uname.clear();

    }*/


	@FXML protected void handleviewDoctorButtonAction(ActionEvent event) {
		


	}
}

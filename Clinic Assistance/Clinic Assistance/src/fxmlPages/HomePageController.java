/*
 * Copyright (c) 2011, 2012 Oracle and/or its affiliates.
 * All rights reserved. Use is subject to license terms.
 *
 * This file is available and licensed under the following license:
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  - Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *  - Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the distribution.
 *  - Neither the name of Oracle nor the names of its
 *    contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package fxmlPages;


import javafx.collections.FXCollections;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class HomePageController {
	@FXML private Text actiontarget;
	@FXML private PasswordField passwordField;
	@FXML private TextField uname;


	@FXML protected void handleSubmitButtonAction(ActionEvent event) {
		 try {
			 Stage stage = new Stage();
			 Parent root = FXMLLoader.load(getClass().getResource("CaHome.fxml"));
				stage.setTitle("Clinic Assistance");
				stage.setScene(new Scene(root, 1400, 700));
				stage.show();
				
				/*CAHome cahome = new CAHome();
				cahome.start(stage);*/
		        
		        } catch(Exception e) {
		           e.printStackTrace();
		          }
		//actiontarget.setText("Sign in button pressed");
		//CAHome cahome = new CAHome();
		//cahome.start(homepage.stage);
		//cahome.setStage(this.stage);
		 Platform.setImplicitExit(false);

	}
	/* @FXML protected void handleNewUserButtonAction(ActionEvent event) {
        actiontarget.setText("Reset button pressed");
        passwordField.clear();
        uname.clear();

    }*/


	@FXML protected void handleExitAppButtonAction(ActionEvent event) {
		Platform.exit();


	}


}

package application.controller;

import java.awt.TextField;

import application.model.UserProfile;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginController {
	UserProfile login = new UserProfile();
	UserProfile user = new UserProfile();
	private TextField username;
	private TextField password;
	
	public void Login(ActionEvent event) throws Exception {
		Parent Restricted = FXMLLoader.load((getClass().getResource("Restrictedfxml")));

		Parent Recipe = FXMLLoader.load((getClass().getResource("Recipe.fxml")));
		Stage primaryStage = new Stage();
		
		user = login.authenticate(this.username.getText(), this.password.getText());
		if (user != null) {
			Scene scene = new Scene(Recipe,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		
		}
		else {
			Scene scene = new Scene(Restricted,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
		}
		
	}
}

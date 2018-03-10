package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	//FXMLLoader loader = new FXMLLoader();
	
	@Override
	public void start(Stage primaryStage) {		
		try {
			Parent root = FXMLLoader.load((getClass().getResource("Login.fxml")));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
		//UserProfile user = new UserProfile();
		//System.out.println("dsadas");
		//user.authenticate("butts", "lol");
		//System.out.println(user.authenticate("butts", "lol").getUsername());
	}
}

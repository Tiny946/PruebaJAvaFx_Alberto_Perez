package clase;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * En esta clase, es la parte ejecutable del proyecto que dispondra de dos metodos
 * @author Alberto
 * @version 1.0
 * 
 */
public class Main extends Application {
	

	private AnchorPane rootLayout;
	public Stage primaryStage;
	/**
	 * 
	 * @param los parametros que recibe este metodo es el stage primaryStage
	 */
	@Override
	public void start(Stage primaryStage) {
		try {
			
			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("My GitHub Profile");
			// Set the application icon.
		    this.primaryStage.getIcons().add(new Image("file:/1480087661_github_social_media_online_logo.png"));
			this.primaryStage.setX(200);
			this.primaryStage.setY(200);

			primaryStage.show();
			
			initRootLayout();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void initRootLayout() {
		try {
			// Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("vista/Principal.fxml"));
			rootLayout = (AnchorPane) loader.load();

			// Show the scene containing the root layout.
			Scene scene = new Scene(rootLayout, 600, 400);
			/*scene.getStylesheets().add(
					getClass().getResource("application.css").toExternalForm());*/
			//scene.getStylesheets().add("http://fonts.googleapis.com/css?family=Shadows+Into+Light");

			primaryStage.setScene(scene);
			

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

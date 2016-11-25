package clase;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * The only controller for the whole application.
 * 
 * @author Alberto P�rez
 */
public class OneController {
	
	//not using yet
	@FXML
	private ImageView imageRaw;

    // Reference to the main application
    private Main mainApp;

    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param main
     */
    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }

	/**
     * Opens an stage to send the profile, to be done...
     */
    
    public void showSendProfile() {
        try {
            // Load the fxml file and create a new stage for the popup.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("vista/segundaPantalla.fxml"));
            AnchorPane page = (AnchorPane) loader.load();
            Stage sendStage = new Stage();
            sendStage.setTitle("Biography");
            Scene scene = new Scene(page);
            sendStage.setScene(scene);

            
            sendStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * Method to handle the ImageView action in the Main stage 
     */
    
    @FXML
    private void sendStage() {
    	showSendProfile();
    }

    /**
     * Closes the application when clicked on Exit in the secondary stage
     */
    @FXML
    private void closeStage() {
   	        System.exit(0);
    }
    }

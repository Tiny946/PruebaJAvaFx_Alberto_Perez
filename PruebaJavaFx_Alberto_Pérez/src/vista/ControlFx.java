package vista;

import java.io.IOException;

import clase.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * @throws se abre la app 
 * @author Alberto Pérez
 * @version 1.0
 */
public class ControlFx {
	

    // Reference to the main application
    private Main mainApp;

    /**
     * llamamos al main
     * 
     * @throws main
     */
    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }

	/**
     * abrimos el la segunda pantalla
     */
    
    public void showSendProfile() {
        try {
            // Load the fxml file and create a new stage for the popup.
            FXMLLoader loader = new FXMLLoader();
            //nos referimos a la segunda pantalla de la app
            loader.setLocation(Main.class.getResource("../vista/Send.fxml"));
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
     * metodo para abrir la segunda pantalla
     */
    
    @FXML
    private void sendStage() {
    	showSendProfile();
    }

    /**
     * metodo para cerrar la aplicacion
     */
    @FXML
    private void closeStage() {
   	        System.exit(0);
    }
    }

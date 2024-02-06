/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controllers;

import com.jobportal.App;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author anisa
 */
public class Berandapt implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void postjob(MouseEvent event) throws IOException {
        App.setRoot("postjob");
    }

    @FXML
    private void viewcampaign(MouseEvent event) throws IOException {
        App.setRoot("daftarcampaign");
    }

    @FXML
    private void profilpt(MouseEvent event) throws IOException {
        App.setRoot("profilpt");
    }

    @FXML
    private void chatpt(MouseEvent event) throws IOException {
        App.setRoot("chatpt");
    }
    
}

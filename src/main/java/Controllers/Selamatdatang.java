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
public class Selamatdatang implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void jobseeker(MouseEvent event) throws IOException {
        App.isCompany = false;
        if(App.isLogin){
        App.setRoot("login");
        }else{App.setRoot("register");}
    }

    @FXML
    private void company(MouseEvent event) throws IOException {
        App.isCompany = true;
        if(App.isLogin){
        App.setRoot("login");
        }else{App.setRoot("register");}
    }

    @FXML
    private void backtostart(MouseEvent event) throws IOException {
        App.setRoot("start");
    }
    
}

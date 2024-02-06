/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controllers;

import Entity.*;
import com.jobportal.App;
import static com.jobportal.App.isCompany;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author anisa
 */
public class Login implements Initializable {

    @FXML
    private TextField username;
    @FXML
    private PasswordField password;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void back(MouseEvent event) throws IOException {
        App.setRoot("selamatdatang");
    }

    @FXML
    private void login(MouseEvent event) throws IOException {
        String inputUsername = username.getText();
        String inputPassword = password.getText();
        boolean isLoggedIn = false;
        
        if(isCompany){
            for(Company company : App.companies){
                if(company.getUsername().equals(inputUsername) && company.getPassword().equals(inputPassword)){
                    App.company = company;
                    isLoggedIn = true;
                    App.setRoot("berandapt");
                }
            }
            
            
        }else{
         for(JobSeeker jobseeker: App.jobseekers){
                if(jobseeker.getUsername().equals(inputUsername) && jobseeker.getPassword().equals(inputPassword)){
                    App.jobseeker = jobseeker;
                    isLoggedIn = true;
                    App.setRoot("berandaseeker");
                }
            }
        }
        
        if(!isLoggedIn){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Login");
            alert.setHeaderText(null);
            alert.setContentText("Email atau Password salah!");
            alert.showAndWait();
        }
    }

    @FXML
    private void Register(MouseEvent event) throws IOException {
        App.setRoot("register");
    }
    
}

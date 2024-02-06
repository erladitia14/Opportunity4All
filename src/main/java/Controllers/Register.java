/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controllers;

import Model.CompanyDAO;
import Model.JobSeekerDAO;
import com.jobportal.App;
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
public class Register implements Initializable {

    @FXML
    private TextField email;
    @FXML
    private TextField username;
    @FXML
    private TextField fullname;
    @FXML
    private PasswordField password;
    @FXML
    private TextField address;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void register(MouseEvent event) throws IOException {
        if(App.isCompany){
            App.company.setEmail(email.getText());
            App.company.setName(fullname.getText());
            App.company.setUsername(username.getText());
            App.company.setPassword(password.getText());
            App.company.setLocation(address.getText());
            CompanyDAO.create(App.company);
            App.company.setId(App.companies.get(App.companies.size() - 1).getId() + 1);         
            App.setRoot("berandapt");
            
        }else{
            App.jobseeker.setEmail(email.getText());
            App.jobseeker.setName(fullname.getText());
            App.jobseeker.setUsername(username.getText());
            App.jobseeker.setPassword(password.getText());
            App.jobseeker.setAddress(address.getText());
            JobSeekerDAO.create(App.jobseeker);
            App.setRoot("riwayatpendidikan");
            App.jobseeker.setId(App.jobseekers.get(App.jobseekers.size() - 1).getId() + 1);
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Login");
            alert.setHeaderText(null);
            alert.setContentText("Akun Berhasil Dibuat");
            alert.showAndWait();
    }

    @FXML
    private void login(MouseEvent event) throws IOException {
        App.setRoot("login");
    }

    @FXML
    
    private void back(MouseEvent event) throws IOException {
        App.setRoot("selamatdatang");
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controllers;

import Model.JobSeekerDAO;
import com.jobportal.App;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author anisa
 */
public class Updateprofilseekerinput implements Initializable {

    @FXML
    private TextArea inputUser;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void back(MouseEvent event) throws IOException {
        App.setRoot("updateprofilseeker");
    }

    @FXML
    private void save(MouseEvent event) throws IOException {
        switch (App.pilihanEdit) {
            case NAMA:
                App.jobseeker.setName(inputUser.getText());
                JobSeekerDAO.update(App.jobseeker);
                break;
            case USERNAME:
                App.jobseeker.setUsername(inputUser.getText());
                JobSeekerDAO.update(App.jobseeker);
                break;
            case EMAIL:
                App.jobseeker.setEmail(inputUser.getText());
                JobSeekerDAO.update(App.jobseeker);
                break;
            case ALAMAT:
                App.jobseeker.setAddress(inputUser.getText());
                JobSeekerDAO.update(App.jobseeker);
                break;
            case HP:
                App.jobseeker.setPhoneNumber(inputUser.getText());
                JobSeekerDAO.update(App.jobseeker);
                break;
            case PASSWORD:
                App.jobseeker.setPassword(inputUser.getText());
                JobSeekerDAO.update(App.jobseeker);
                break;
            default:
                break;
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Login");
            alert.setHeaderText(null);
            alert.setContentText("Berhasil Melakukan Update");
            alert.showAndWait();
            App.setRoot("updateprofilseeker");
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controllers;

import Entity.Campaign;
import Model.CampaignDAO;
import com.jobportal.App;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author anisa
 */
public class Postjob implements Initializable {

    @FXML
    private TextField judul;
    @FXML
    private TextField pendidikan;
    @FXML
    private ChoiceBox<Campaign.HourType> jamkerja;
    @FXML
    private TextField lokasi;
    @FXML
    private TextField pekerjaan;
    @FXML
    private TextArea deskripsi;
    @FXML
    private TextField gaji;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       jamkerja.getItems().addAll(Campaign.HourType.FULL, Campaign.HourType.HALF, Campaign.HourType.INTERN);
    }    

    @FXML
    private void post(MouseEvent event) throws IOException {
       App.campaign.setName(judul.getText());
       App.campaign.setEducation(pendidikan.getText());
       App.campaign.setLocation(lokasi.getText());
       App.campaign.setWork(pekerjaan.getText());
       App.campaign.setDescription(deskripsi.getText());
       App.campaign.setId_comp(App.company.getId());
       App.campaign.setSalary(gaji.getText());
       App.campaign.setHour(jamkerja.getSelectionModel().getSelectedItem());
       CampaignDAO.create(App.campaign);
       App.campaigns = CampaignDAO.getAllCampaigns();
       App.setRoot("berandapt");
    }

    @FXML
    private void back(MouseEvent event) throws IOException {
       App.setRoot("berandapt");
    }
    
}

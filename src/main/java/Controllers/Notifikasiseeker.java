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
public class Notifikasiseeker implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void beranda(MouseEvent event) throws IOException {
        App.setRoot("berandaseeker");
    }

    @FXML
    private void favorit(MouseEvent event) throws IOException {
        App.setRoot("favoritseeker");
    }

    @FXML
    private void pesan(MouseEvent event) throws IOException {
        App.setRoot("pesanseeker");
    }

    @FXML
    private void profil(MouseEvent event) throws IOException {
        App.setRoot("saya");
    }

    @FXML
    private void cari(MouseEvent event) throws IOException {
        App.setRoot("pencarianseeker");
    }
    
}

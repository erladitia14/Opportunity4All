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
public class Updateprofilseeker implements Initializable {


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void back(MouseEvent event) throws IOException {
        App.setRoot("saya");
    }

    @FXML
    private void nama(MouseEvent event) throws IOException {
        App.pilihanEdit = PilihanEdit.NAMA;
        App.setRoot("updateprofilseekerinput");
    }

    @FXML
    private void username(MouseEvent event) throws IOException {
        App.pilihanEdit = PilihanEdit.USERNAME;
        App.setRoot("updateprofilseekerinput");
    }

    @FXML
    private void email(MouseEvent event) throws IOException {
        App.pilihanEdit = PilihanEdit.EMAIL;
        App.setRoot("updateprofilseekerinput");
    }

    @FXML
    private void alamar(MouseEvent event) throws IOException {
        App.pilihanEdit = PilihanEdit.ALAMAT;
        App.setRoot("updateprofilseekerinput");
    }

    @FXML
    private void hp(MouseEvent event) throws IOException {
        App.pilihanEdit = PilihanEdit.HP;
        App.setRoot("updateprofilseekerinput");
    }

    @FXML
    private void password(MouseEvent event) throws IOException {
        App.pilihanEdit = PilihanEdit.PASSWORD;
        App.setRoot("updateprofilseekerinput");
    }

    @FXML
    private void pendidikan(MouseEvent event) throws IOException {
        App.pilihanEdit = PilihanEdit.PENDIDIKAN;
        App.setRoot("listriwayatpendidikan");
    }

    @FXML
    private void pekerjaan(MouseEvent event) throws IOException {
        App.pilihanEdit = PilihanEdit.PEKERJAAN;
        App.setRoot("listriwayatkerja");
    }
    
    public enum PilihanEdit {
        NAMA,
        USERNAME,
        EMAIL,
        ALAMAT,
        HP,
        PASSWORD,
        PENDIDIKAN,
        PEKERJAAN,
        GAKADA,
    }
    
}

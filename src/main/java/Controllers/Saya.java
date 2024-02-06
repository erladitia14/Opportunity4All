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
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

/**
 * FXML Controller class
 *
 * @author anisa
 */
public class Saya implements Initializable {

    @FXML
    private AnchorPane nama;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Text name = new Text(App.jobseeker.getName());
        name.setTextAlignment(TextAlignment.CENTER);
        name.setFont(Font.font("Arial", FontWeight.BOLD, 15));
        name.setFill(Color.NAVY);
        
        nama.getChildren().addAll(name);
    }    

    @FXML
    private void cari(MouseEvent event) throws IOException {
        App.setRoot("pencarianseeker");
    }

    @FXML
    private void riwayat(MouseEvent event) throws IOException {
        App.setRoot("Daftarlamaran");
    }

    @FXML
    private void update(MouseEvent event) throws IOException {
        App.setRoot("updateprofilseeker");
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
    void addEdu(MouseEvent event) throws IOException {
        App.setRoot("riwayatpendidikan");
    }

    @FXML
    void addWork(MouseEvent event) throws IOException {
        App.setRoot("riwayatkerja");
    }

    @FXML
    void logout(MouseEvent event) throws IOException {
        App.setRoot("start");
    }

    @FXML
    void detailseeker(MouseEvent event) throws IOException {
        App.setRoot("detailjobseeker");

    }
}

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
import javafx.scene.text.*;

/**
 * FXML Controller class
 *
 * @author anisa
 */
public class Profilpt implements Initializable {

    @FXML
    private AnchorPane namapt;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Text name = new Text(App.company.getName());
        name.setTextAlignment(TextAlignment.CENTER);
        name.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        name.setFill(Color.NAVY);
        namapt.getChildren().addAll(name);


    }    

    @FXML
    private void home(MouseEvent event) throws IOException {
        App.setRoot("berandapt");
    }

    @FXML
    private void chat(MouseEvent event) throws IOException {
        App.setRoot("chatpt");
    }

    @FXML
    private void profil(MouseEvent event) throws IOException {
        App.setRoot("updatept");
    }

    @FXML
    void logout(MouseEvent event) throws IOException {
        App.setRoot("start");
    }
}

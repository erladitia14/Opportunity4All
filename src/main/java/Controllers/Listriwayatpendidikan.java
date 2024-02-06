/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controllers;

import com.jobportal.App;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

/**
 * FXML Controller class
 *
 * @author anisa
 */
public class Listriwayatpendidikan implements Initializable {

    @FXML
    private AnchorPane anchorPane;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    double cardY = 0.0;
    for (var data : App.listEducations){
        if(App.jobseeker.getId() == data.getIdSeeker()){
            
            Text institusi = new Text(data.getInstitusi());
            institusi.setLayoutX(10);
            institusi.setLayoutY(cardY + 20);
            institusi.setFont(Font.font("Arial", FontWeight.BOLD, 12));
            institusi.setFill(Color.NAVY);

            Text jurusan = new Text(data.getStudi());
            jurusan.setLayoutX(10);
            jurusan.setLayoutY(cardY + 35);
            jurusan.setFont(Font.font("Arial", FontWeight.BOLD, 12));

            Text nilai = new Text(String.valueOf(data.getNilai()));
            nilai.setLayoutX(10);
            nilai.setLayoutY(cardY + 50);
            nilai.setFont(Font.font("Arial", FontWeight.BOLD, 12));

            Text lulus = new Text(data.getLulus().toString());
            lulus.setLayoutX(10);
            lulus.setLayoutY(cardY + 65);
            lulus.setFont(Font.font("Arial", FontWeight.BOLD, 12));

            Text deskripsi = new Text(data.getDeskripsi());
            deskripsi.setFont(Font.font("Arial", FontWeight.BOLD, 12));
            
            TextFlow flow = new TextFlow();
            flow.setLayoutX(10);
            flow.setLayoutY(cardY + 70);
            flow.setPrefWidth(277);
            flow.getChildren().addAll(deskripsi);
            
            anchorPane.getChildren().addAll(institusi, jurusan, nilai, lulus, flow);
            
            cardY += 85.0;

            institusi.setOnMouseClicked((MouseEvent e) -> {
                App.education = data;
                try {
                    App.setRoot("updateriwayatpendidikan");
                } catch (IOException ex) {
                    Logger.getLogger(Berandaseeker.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
        }
    }
    
    
    }    

    @FXML
    private void back(MouseEvent event) throws IOException {
        App.setRoot("updateprofilseeker");
    }

    
    
}

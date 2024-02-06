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
public class Listriwayatkerja implements Initializable {

    @FXML
    private AnchorPane anchorPane;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    double cardY = 0.0;
    for (var data : App.works){
        if(App.jobseeker.getId() == data.getIdSeeker()){
            
            Text namapt = new Text(data.getCompany());
            namapt.setLayoutX(10);
            namapt.setLayoutY(cardY + 20);
            namapt.setFont(Font.font("Arial", FontWeight.BOLD, 12));
            namapt.setFill(Color.NAVY);

            Text jabatan = new Text(data.getJabatan());
            jabatan.setLayoutX(10);
            jabatan.setLayoutY(cardY + 35);
            jabatan.setFont(Font.font("Arial", FontWeight.BOLD, 12));

            Text mulai = new Text(data.getMulai().toString());
            mulai.setLayoutX(10);
            mulai.setLayoutY(cardY + 50);
            mulai.setFont(Font.font("Arial", FontWeight.BOLD, 12));
            
            Text selesai = new Text(data.getSelesai().toString());
            selesai.setLayoutX(10);
            selesai.setLayoutY(cardY + 65);
            selesai.setFont(Font.font("Arial", FontWeight.BOLD, 12));

            Text deskripsi = new Text(data.getDeskripsi());
            deskripsi.setFont(Font.font("Arial", FontWeight.BOLD, 12));
            
            TextFlow flow = new TextFlow();
            flow.setLayoutX(10);
            flow.setLayoutY(cardY + 70);
            flow.setPrefWidth(277);
            flow.getChildren().addAll(deskripsi);
            
            anchorPane.getChildren().addAll(namapt, jabatan, mulai, selesai, flow);
            
            cardY += 50.0;

            namapt.setOnMouseClicked((MouseEvent e) -> {
                App.work = data;
                try {
                    App.setRoot("updateriwayatkerja");
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

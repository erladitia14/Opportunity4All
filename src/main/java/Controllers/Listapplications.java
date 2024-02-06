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
import javafx.scene.Cursor;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author anisa
 */
public class Listapplications implements Initializable {
    @FXML
    private AnchorPane anchorPane;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    double cardY = 0.0;
    for (var dataSeeker : App.listApplications){
        if(App.campaign.getId() == dataSeeker.getIdCamp()){
            for(var data : App.jobseekers){
                if(dataSeeker.getIdSeeker() == data.getId()){
                    Text name = new Text(data.getName());
                    name.setLayoutX(10);
                    name.setLayoutY(cardY + 30);
                    name.setFont(Font.font("Arial", FontWeight.BOLD, 15));
                    name.setFill(Color.NAVY);

                    Text email = new Text(data.getEmail());
                    email.setLayoutX(10);
                    email.setLayoutY(cardY + 45);
                    email.setFont(Font.font("Arial", FontWeight.BOLD, 12));
                    email.setFill(Color.BLACK);
                    
                    anchorPane.getChildren().addAll(name, email);
                    
                    cardY += 50.0;
                    name.setCursor(Cursor.HAND);
                    name.setOnMouseClicked((MouseEvent e) -> {
                        App.jobseeker = data;
                        try {
                            App.setRoot("detailjobseeker");
                        } catch (IOException ex) {
                            Logger.getLogger(Berandaseeker.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    });
                }
            }

        }
    }
    
    
    }    

    @FXML
    private void back(MouseEvent event) throws IOException {
        App.setRoot("daftarcampaign");
    }

    
    
}

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
public class Daftarlamaran implements Initializable {

    @FXML
    private AnchorPane nama;
    @FXML
    private AnchorPane anchorPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {    
        double cardY = 0.0;
        for (var dataSeeker : App.listApplications)
            if(App.jobseeker.getId() == dataSeeker.getIdSeeker()){
                for(var data : App.campaigns){
                    if(dataSeeker.getIdCamp() == data.getId()){
                        Text name = new Text(data.getName());
                        name.setLayoutX(10);
                        name.setLayoutY(cardY + 30);
                        name.setFont(Font.font("Arial", FontWeight.BOLD, 15));
                        name.setFill(Color.NAVY);

                        Text companyName = new Text(App.company.getName());
                        companyName.setLayoutX(10);
                        companyName.setLayoutY(cardY + 50);
                        companyName.setFont(Font.font("Arial", FontWeight.BOLD, 12));
                        companyName.setFill(Color.BLACK);

                        Text alamat = new Text(data.getLocation());
                        alamat.setLayoutX(10);
                        alamat.setLayoutY(cardY + 70);
                        alamat.setFont(Font.font(10));

                        Text gaji = new Text(data.getSalary());
                        gaji.setLayoutX(10);
                        gaji.setLayoutY(cardY + 90);
                        gaji.setFont(Font.font(10));

                        anchorPane.getChildren().addAll(name, companyName, alamat, gaji);

                        cardY += 100.0;
                    }
                }
            }
        
        Text name = new Text(App.jobseeker.getName());
        name.setTextAlignment(TextAlignment.CENTER);
        name.setFont(Font.font("Arial", FontWeight.BOLD, 15));
        name.setFill(Color.NAVY);
        
        nama.getChildren().addAll(name);
        }
    


    @FXML
    private void back(MouseEvent event) throws IOException {
        App.setRoot("saya");
    }
    }


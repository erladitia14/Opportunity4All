package Controllers;

import Entity.Company;
import java.net.URL;
import java.util.ResourceBundle;
import com.jobportal.App;
import java.io.IOException;
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

public class Berandaseeker implements Initializable {
    @FXML
    private AnchorPane anchorPane;

     @Override
    public void initialize(URL url, ResourceBundle rb) {
        double cardY = 100.0;
        
        for (var data: App.campaigns) {
            getCompany(data.getId_comp());
            
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
            
            anchorPane.getChildren().addAll(name, companyName, alamat,gaji);
            
            cardY += 100.0;
            
            name.setOnMouseClicked((MouseEvent e) -> {
                App.campaign = data;
                try {
                    App.setRoot("detailjob");
                } catch (IOException ex) {
                    Logger.getLogger(Berandaseeker.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
        }
    }
    public static Company getCompany(int idComp) {
        for(Company company : App.companies){
            if(company.getId() == idComp){
                App.company = company;
                return company;
            }
        }
        return null;
    }

    @FXML
    private void moveCari(MouseEvent event) throws IOException {
        App.setRoot("pencarianseeker");
    }

    @FXML
    private void moveFavorit(MouseEvent event) throws IOException {
        App.setRoot("favoritseeker");
    }

    @FXML
    private void moveProfil(MouseEvent event) throws IOException {
        App.setRoot("saya");
    }

    @FXML
    private void movePesan(MouseEvent event) throws IOException {
        App.setRoot("pesanseeker");
    }
}
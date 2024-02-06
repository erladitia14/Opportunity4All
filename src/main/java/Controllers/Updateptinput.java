package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import com.jobportal.App;
import Model.CompanyDAO;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class Updateptinput implements Initializable {

    @FXML
    private TextArea inputupdate;

    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    void back(MouseEvent event) throws IOException {
        App.setRoot("updatept");
    }

    @FXML
    void save(MouseEvent event) throws IOException {
        switch (App.pilihanUpdate) {
                case NAMA:
                        App.company.setName(inputupdate.getText()); 
                        CompanyDAO.update(App.company);
                        break;

                case DESKRIPSI:
                        App.company.setDescription(inputupdate.getText());
                        CompanyDAO.update(App.company);
                        break;

                case USERNAME:
                        App.company.setUsername(inputupdate.getText());
                        CompanyDAO.update(App.company);
                        break;

                case EMAIL:
                        App.company.setEmail(inputupdate.getText());
                        CompanyDAO.update(App.company);
                        break;

                case PASSWORD:
                        App.company.setPassword(inputupdate.getText());
                        CompanyDAO.update(App.company);
                        break;
                        
                case ALAMAT:
                        App.company.setLocation(inputupdate.getText());
                        CompanyDAO.update(App.company);
                        break;
                default:
                        break;
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Update");
            alert.setHeaderText(null);
            alert.setContentText("Berhasil Melakukan Update");
            alert.showAndWait();
            App.setRoot("updatept");
    }

}

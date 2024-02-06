package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import com.jobportal.App;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.*;

public class Updatept implements Initializable {
        
    @FXML
    private AnchorPane deskripsi;

    @FXML
    private AnchorPane email;

    @FXML
    private AnchorPane lokasi;

    @FXML
    private AnchorPane nama;

    @FXML
    private AnchorPane username;

        
        public void initialize(URL url, ResourceBundle rb) {
                Text textNama = new Text(App.company.getName());
                textNama.setFont(Font.font("Arial", 12));
                textNama.setFill(Color.BLACK);
                nama.getChildren().add(textNama);
                
                Text textEmail = new Text(App.company.getEmail());
                textEmail.setFont(Font.font("Arial", 12));
                textEmail.setFill(Color.BLACK);
                email.getChildren().add(textEmail);

                Text textUsername = new Text(App.company.getUsername());
                textUsername.setFont(Font.font("Arial", 12));
                textUsername.setFill(Color.BLACK);
                username.getChildren().add(textUsername);

                Text textLokasi = new Text(App.company.getLocation());
                textLokasi.setFont(Font.font("Arial", 12));
                textLokasi.setFill(Color.BLACK);
                lokasi.getChildren().add(textLokasi);

                Text textDeskripsi = new Text(App.company.getDescription());
                textDeskripsi.setFont(Font.font("Arial", 12));
                textDeskripsi.setFill(Color.BLACK);
                TextFlow flow = new TextFlow();
                flow.setPrefWidth(200);
                flow.setTextAlignment(TextAlignment.JUSTIFY);
                flow.getChildren().add(textDeskripsi);
                deskripsi.getChildren().add(flow);
        }

        @FXML
        void back(MouseEvent event) throws IOException {
                App.setRoot("profilpt");
    
        }
    
        @FXML
        void deskripsipt(MouseEvent event) throws IOException {
                App.pilihanUpdate = PilihanUpdate.DESKRIPSI;
                App.setRoot("updateptinput");
        }
    
        @FXML
        void emailpt(MouseEvent event) throws IOException {
                App.pilihanUpdate = PilihanUpdate.EMAIL;
                App.setRoot("updateptinput");
        }
    
        @FXML
        void lokasipt(MouseEvent event) throws IOException {
                App.pilihanUpdate = PilihanUpdate.ALAMAT;
                App.setRoot("updateptinput");
        }
    
        @FXML
        void namapt(MouseEvent event) throws IOException {
                App.pilihanUpdate = PilihanUpdate.NAMA;
                App.setRoot("updateptinput");
        }
    
        @FXML
        void passwordpt(MouseEvent event) throws IOException {
                App.pilihanUpdate = PilihanUpdate.PASSWORD;
                App.setRoot("updateptinput");
        }
    
        @FXML
        void usernamept(MouseEvent event) throws IOException {
                App.pilihanUpdate = PilihanUpdate.USERNAME;
                App.setRoot("updateptinput");
        }

        public enum PilihanUpdate{
            NAMA,
            USERNAME,
            EMAIL,
            ALAMAT,
            PASSWORD,
            DESKRIPSI,
            NO
        }
    
}

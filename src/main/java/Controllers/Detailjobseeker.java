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
import javafx.scene.text.TextFlow;

/**
 * FXML Controller class
 *
 * @author anisa
 */
public class Detailjobseeker implements Initializable {
    @FXML
    private AnchorPane anchorPane;

@Override
public void initialize(URL url, ResourceBundle rb) {
    double cardY = 90.0;

    Text nama = new Text(App.jobseeker.getName());
    nama.setLayoutX(10);
    nama.setLayoutY(20);
    nama.setFont(Font.font("Arial", FontWeight.BOLD, 14));
    nama.setFill(Color.NAVY);

    Text email = new Text(App.jobseeker.getEmail());
    email.setLayoutX(10);
    email.setLayoutY(35);
    email.setFont(Font.font("Arial", FontWeight.BOLD, 12));

    Text phone = new Text(App.jobseeker.getPhoneNumber());
    phone.setLayoutX(10);
    phone.setLayoutY(50);
    phone.setFont(Font.font("Arial", FontWeight.BOLD, 12));

    Text alamat = new Text(App.jobseeker.getAddress());
    alamat.setLayoutX(10);
    alamat.setLayoutY(65);
    alamat.setFont(Font.font("Arial", FontWeight.BOLD, 12));

    Text pendidikan = new Text("Riwayat pendidikan");
    pendidikan.setLayoutX(10);
    pendidikan.setLayoutY(90);
    pendidikan.setFont(Font.font("Arial", FontWeight.BOLD, 14));

    for (var edu : App.listEducations) {
        if (edu.getIdSeeker() == App.jobseeker.getId()) {

            Text institusi = new Text(edu.getInstitusi());
            institusi.setLayoutX(10);
            institusi.setLayoutY(cardY + 20);
            institusi.setFont(Font.font("Arial", FontWeight.BOLD, 12));
            institusi.setFill(Color.NAVY);

            Text jurusan = new Text(edu.getStudi());
            jurusan.setLayoutX(10);
            jurusan.setLayoutY(cardY + 35);
            jurusan.setFont(Font.font("Arial", FontWeight.BOLD, 12));

            Text nilai = new Text(String.valueOf(edu.getNilai()));
            nilai.setLayoutX(10);
            nilai.setLayoutY(cardY + 50);
            nilai.setFont(Font.font("Arial", FontWeight.BOLD, 12));

            Text lulus = new Text(edu.getLulus().toString());
            lulus.setLayoutX(10);
            lulus.setLayoutY(cardY + 65);
            lulus.setFont(Font.font("Arial", FontWeight.BOLD, 12));

            Text deskripsi = new Text(edu.getDeskripsi());
            deskripsi.setFont(Font.font("Arial", FontWeight.BOLD, 12));

            TextFlow flowedu = new TextFlow();
            flowedu.setLayoutX(10);
            flowedu.setLayoutY(cardY + 70);
            flowedu.setPrefWidth(277);
            flowedu.getChildren().addAll(deskripsi);

            anchorPane.getChildren().addAll(institusi, jurusan, nilai, lulus, flowedu);

            cardY += 85; 
        }
    }

    cardY += 30;
    Text kerja = new Text("Riwayat Kerja");
    kerja.setLayoutX(10);
    kerja.setLayoutY(cardY);
    kerja.setFont(Font.font("Arial", FontWeight.BOLD, 14));

    for (var data : App.works) {
        if (App.jobseeker.getId() == data.getIdSeeker()) {


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

            TextFlow flowwork = new TextFlow();
            flowwork.setLayoutX(10);
            flowwork.setLayoutY(cardY + 70);
            flowwork.setPrefWidth(277);
            flowwork.getChildren().addAll(deskripsi);

            anchorPane.getChildren().addAll(namapt, jabatan, mulai, selesai, flowwork);

            cardY += 75; 
        }

    }
    anchorPane.getChildren().addAll(nama, email, phone, alamat, pendidikan, kerja);
} 

    @FXML
    private void back(MouseEvent event) throws IOException {
        App.setRoot(App.isCompany ? "daftarcampaign" : "saya");
    }

    
    
}

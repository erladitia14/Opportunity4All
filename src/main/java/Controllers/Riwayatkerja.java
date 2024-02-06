/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controllers;

import Model.JobSeekerDAO;
import com.jobportal.App;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import java.sql.Date;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author anisa
 */
public class Riwayatkerja implements Initializable {

    @FXML
    private TextArea namapt;
    @FXML
    private TextArea jabatan;
    @FXML
    private TextArea deskripsi;
    @FXML
    private DatePicker startDate;
    @FXML
    private DatePicker endDate;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }

    @FXML
    void back(MouseEvent event) throws IOException {
        App.setRoot(App.isLogin ? "saya" : "riwayatpendidikan");
    }

    @FXML
    private void save(MouseEvent event) throws IOException {
        App.work.setCompany(namapt.getText());
        App.work.setJabatan(jabatan.getText());
        App.work.setDeskripsi(deskripsi.getText());
        App.work.setMulai(Date.valueOf(startDate.getValue()));
        App.work.setSelesai(Date.valueOf(endDate.getValue()));
        App.work.setIdSeeker(App.jobseeker.getId());
        JobSeekerDAO.createWork(App.work);
        App.works = JobSeekerDAO.readAllWork();
        App.setRoot("saya");
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controllers;

import Model.JobSeekerDAO;
import com.jobportal.App;
import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.util.ResourceBundle;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author anisa
 */
public class Riwayatpendidikan implements Initializable {

    @FXML
    private TextArea deskripsi;
    @FXML
    private DatePicker myDatePicker;
    @FXML
    private TextArea institusi;
    @FXML
    private TextArea jurusan;
    @FXML
    private TextField nilai;
    @FXML
    private Text date;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }
    
    @FXML
    void back(MouseEvent event) throws IOException {
        App.setRoot(App.isLogin ? "saya" : "start");
    }

    @FXML
    private void continiue(MouseEvent event) throws IOException {
        App.education.setIdSeeker(App.jobseeker.getId());
        App.education.setDeskripsi(deskripsi.getText());
        App.education.setInstitusi(institusi.getText());
        App.education.setNilai(Integer.parseInt(nilai.getText()));
        App.education.setStudi(jurusan.getText());
        App.education.setLulus(Date.valueOf(myDatePicker.getValue()));
        JobSeekerDAO.createEducation(App.education);
        App.listEducations = JobSeekerDAO.readAllEducation();
        App.setRoot(App.isLogin ? "saya" : "riwayatkerja");
    }

    @FXML
    private void showDate(MouseEvent event) {
        myDatePicker.show();
    }

    @FXML
    private void ShowDateText(Event event) {
        
        var val = myDatePicker.getValue().toString();
        if (val != null) {date.setText(val);}
    }
    
}

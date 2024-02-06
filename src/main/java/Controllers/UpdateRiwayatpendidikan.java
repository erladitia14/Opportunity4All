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
public class UpdateRiwayatpendidikan implements Initializable {

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
    private void continiue(MouseEvent event) throws IOException {
        App.education.setDeskripsi(deskripsi.getText().isEmpty() ? App.education.getDeskripsi() : deskripsi.getText());
        App.education.setInstitusi(institusi.getText().isEmpty() ? App.education.getInstitusi() : institusi.getText());
        App.education.setStudi(jurusan.getText().isEmpty() ? App.education.getStudi() : jurusan.getText());
        App.education.setNilai(Integer.parseInt(String.valueOf(nilai.getText().isEmpty() ? App.education.getNilai() : nilai.getText())));
        App.education.setLulus(myDatePicker.getValue() == null ? App.education.getLulus() : Date.valueOf(myDatePicker.getValue()));
        JobSeekerDAO.updateEducation(App.education);
        App.setRoot("listriwayatpendidikan");
    }

    @FXML
    private void back(MouseEvent event) throws IOException {
        App.setRoot("listriwayatpendidikan");
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

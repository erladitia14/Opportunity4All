package com.jobportal;

import Controllers.Updateprofilseeker;
import Controllers.Updatept;
import Entity.*;
import Model.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    private static Scene scene;
    public static boolean isLogin;
    public static boolean isCompany;
    public static Company company = new Company();
    public static JobSeeker jobseeker = new JobSeeker();
    public static Campaign campaign = new Campaign();
    public static Education education = new Education();
    public static Work work = new Work();
    public static ArrayList<Company> companies = CompanyDAO.getAllCompanies();
    public static ArrayList<JobSeeker> jobseekers = JobSeekerDAO.getAllJobSeekers();
    public static ArrayList<Campaign> campaigns = CampaignDAO.getAllCampaigns();
    public static ArrayList<RegisteredCampaignSeeker> listApplications = JobSeekerDAO.readListApplications();
    public static ArrayList<Education> listEducations = JobSeekerDAO.readAllEducation();
    public static ArrayList<Work> works = JobSeekerDAO.readAllWork();
    public static Updateprofilseeker.PilihanEdit pilihanEdit = Updateprofilseeker.PilihanEdit.GAKADA;
    public static Updatept.PilihanUpdate pilihanUpdate = Updatept.PilihanUpdate.NO;

    @Override
    public void start(Stage stage) throws Exception {
        scene = new Scene(loadFXML("start"));
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    public static Parent loadFXML(String fxml) throws IOException {
        var url = new File("src/main/java/View/" + fxml + ".fxml").toURI().toURL();
        return FXMLLoader.load(url);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
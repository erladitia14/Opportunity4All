package Model;

import Config.DBConnection;
import Entity.*;
import com.jobportal.App;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class JobSeekerDAO {
    private static Connection connection;

    static {
        connection = DBConnection.getConnection();
    }

    public static void create(JobSeeker jobSeeker) {
        String query = "INSERT INTO jobseeker (id_jobseeker, Username_seeker, Password_seeker, Name, Email, Address, PhoneNumber) VALUES (NULL, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, jobSeeker.getUsername());
            statement.setString(2, jobSeeker.getPassword());
            statement.setString(3, jobSeeker.getName());
            statement.setString(4, jobSeeker.getEmail());
            statement.setString(5, jobSeeker.getAddress());
            statement.setString(6, jobSeeker.getPhoneNumber());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void update(JobSeeker jobSeeker) {
        String query = "UPDATE jobseeker SET Username_seeker = ?, Password_seeker = ?, Name = ?, Email = ?, Address = ?, PhoneNumber = ? WHERE id_jobseeker = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, jobSeeker.getUsername());
            statement.setString(2, jobSeeker.getPassword());
            statement.setString(3, jobSeeker.getName());
            statement.setString(4, jobSeeker.getEmail());
            statement.setString(5, jobSeeker.getAddress());
            statement.setString(6, jobSeeker.getPhoneNumber());
            statement.setInt(7, jobSeeker.getId());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void delete(int id) {
        String query = "DELETE FROM jobseeker WHERE id_jobseeker = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<JobSeeker> getAllJobSeekers() {
        ArrayList<JobSeeker> jobSeekers = new ArrayList<>();
        String query = "SELECT * FROM jobseeker";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id_jobseeker");
                String username = resultSet.getString("Username_seeker");
                String password = resultSet.getString("Password_seeker");
                String name = resultSet.getString("Name");
                String email = resultSet.getString("Email");
                String address = resultSet.getString("Address");
                String phone = resultSet.getString("PhoneNumber");

                JobSeeker jobSeeker = new JobSeeker(id, username, password, name, email, address, phone);
                jobSeekers.add(jobSeeker);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return jobSeekers;
    }
    
    public static void registCampaign(int id_seeker, int id_camp) {
        String query = "INSERT INTO registed_campaign (id, id_seeker, id_camp) VALUES (null, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id_seeker);
            statement.setInt(2, id_camp);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static ArrayList<RegisteredCampaignSeeker> readListApplications() {
        ArrayList<RegisteredCampaignSeeker> readListApplications = new ArrayList<>();

        String query = "SELECT * FROM registed_campaign";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                int seekerId = resultSet.getInt("id_seeker");
                int campaignId = resultSet.getInt("id_camp");

                RegisteredCampaignSeeker registeredCampaign = new RegisteredCampaignSeeker(id, campaignId, seekerId);
                readListApplications.add(registeredCampaign);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return readListApplications;
    }
    
    public static void createEducation(Education education){
        String query = "INSERT INTO seeker_education (id_education,institusi, deskripsi, lulus, studi, nilai, id_seeker) VALUES (NULL, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, education.getInstitusi());
            statement.setString(2, education.getDeskripsi());
            statement.setDate(3, (Date) education.getLulus());
            statement.setString(4, education.getStudi());
            statement.setDouble(5, education.getNilai());
            statement.setInt(6, App.jobseeker.getId());

            statement.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateEducation(Education education) {
        String query = "UPDATE seeker_education SET institusi = ?, deskripsi = ?, lulus = ?, studi = ?, nilai = ? WHERE id_seeker = ? AND id_education = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, education.getInstitusi());
            statement.setString(2, education.getDeskripsi());
            statement.setDate(3, (Date) education.getLulus());
            statement.setString(4, education.getStudi());
            statement.setDouble(5, education.getNilai());
            statement.setInt(6, App.jobseeker.getId());
            statement.setInt(7, education.getId());

            statement.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Education> readAllEducation(){
        ArrayList<Education> educations = new ArrayList<>();

        String query = "SELECT * FROM seeker_education";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id_education");
                String institusi = resultSet.getString("institusi");
                String deskripsi = resultSet.getString("deskripsi");
                Date lulus = resultSet.getDate("lulus");
                String studi = resultSet.getString("studi");
                int nilai = resultSet.getInt("nilai");
                int idSeeker = resultSet.getInt("id_seeker");

                Education education = new Education(id, institusi, deskripsi, lulus, studi, nilai,idSeeker);
                educations.add(education);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return educations;
    }
    
    public static void createWork(Work work) {
        String query = "INSERT INTO seeker_work (id_work, jabatan, tahun_mulai, tahun_selesai, nama_pt, deskripsi, id_seeker_work) VALUES (NULL, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, work.getJabatan());
            statement.setDate(2, (Date) work.getMulai());
            statement.setDate(3, (Date) work.getSelesai());
            statement.setString(4, work.getCompany());
            statement.setString(5, work.getDeskripsi());
            statement.setInt(6, App.jobseeker.getId());

            statement.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateWork(Work work){
        String query = "UPDATE seeker_work SET jabatan = ?, tahun_mulai = ?, tahun_selesai = ?, nama_pt = ?, deskripsi = ? WHERE id_work = ? AND id_seeker_work = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, work.getJabatan());
            statement.setDate(2, (Date) work.getMulai());
            statement.setDate(3, (Date) work.getSelesai());
            statement.setString(4, work.getCompany());
            statement.setString(5, work.getDeskripsi());
            statement.setInt(6, work.getId());
            statement.setInt(7, App.jobseeker.getId());

            statement.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Work> readAllWork(){
        ArrayList<Work> works = new ArrayList<>();

        String query = "SELECT id_work, jabatan, tahun_mulai, tahun_selesai, nama_pt, deskripsi, id_seeker_work FROM seeker_work";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                int idWork = resultSet.getInt("id_work");
                String jabatan = resultSet.getString("jabatan");
                Date tahunMulai = resultSet.getDate("tahun_mulai");
                Date tahunSelesai = resultSet.getDate("tahun_selesai");
                String namaPt = resultSet.getString("nama_pt");
                String deskripsi = resultSet.getString("deskripsi");
                int idSeekerWork = resultSet.getInt("id_seeker_work");

                Work work = new Work(idWork, jabatan, tahunMulai, tahunSelesai, namaPt, deskripsi, idSeekerWork);
                works.add(work);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return works;
    }
    
}
package Model;

import Config.DBConnection;
import Entity.Campaign;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class CampaignDAO {
    private static Connection connection;

    static {
        connection = DBConnection.getConnection();
    }

    public static void create(Campaign campaign) {
        String query = "INSERT INTO campaign (id_campaign, id_comp, name, deskripsi, location, sallary, hour, pendidikan, pekerjaan) VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, campaign.getId_comp());
            statement.setString(2, campaign.getName());
            statement.setString(3, campaign.getDescription());
            statement.setString(4, campaign.getLocation());
            statement.setString(5, campaign.getSalary());
            statement.setString(6, campaign.getHour().toString());
            statement.setString(7, campaign.getEducation());
            statement.setString(8, campaign.getWork());
            

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void update(Campaign campaign) {
        String query = "UPDATE campaign SET id_comp = ?, name = ?, deskripsi = ?, location = ?, sallary = ?, hour = ?, pendidikan = ?, pekerjaan = ? WHERE id_campaign = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, campaign.getId_comp());
            statement.setString(2, campaign.getName());
            statement.setString(3, campaign.getDescription());
            statement.setString(4, campaign.getLocation());
            statement.setString(5, campaign.getSalary());
            statement.setString(6, campaign.getHour().toString());
            statement.setString(7, campaign.getEducation());
            statement.setString(8, campaign.getWork());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void delete(int id) {
        String query = "DELETE FROM campaign WHERE id_campaign = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static ArrayList<Campaign> getAllCampaigns() {
        ArrayList<Campaign> campaigns = new ArrayList<>();
        String query = "SELECT * FROM campaign";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int campaignId = resultSet.getInt("id_campaign");
                int companyId = resultSet.getInt("id_comp");
                String name = resultSet.getString("Name");
                String description = resultSet.getString("Deskripsi");
                String location = resultSet.getString("Location");
                String salary = resultSet.getString("Sallary");
                String hour = resultSet.getString("Hour");
                String education = resultSet.getString("pendidikan");
                String work = resultSet.getString("pekerjaan");

                Campaign campaign = new Campaign(campaignId, companyId, name, description, location, salary, hour, education, work);
                campaigns.add(campaign);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return campaigns;
    }
}
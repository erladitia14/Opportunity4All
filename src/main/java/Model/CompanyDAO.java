package Model;

import Config.DBConnection;
import Entity.Company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CompanyDAO {
    private static Connection connection;

    static {
        connection = DBConnection.getConnection();
    }

    public static void create(Company company) {
        String query = "INSERT INTO company (id_company, Username_company, Password_company, Name, Email, Deskripsi, Location) VALUES (NULL, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, company.getUsername());
            statement.setString(2, company.getPassword());
            statement.setString(3, company.getName());
            statement.setString(4, company.getEmail());
            statement.setString(5, company.getDescription());
            statement.setString(6, company.getLocation());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void update(Company company) {
        String query = "UPDATE company SET Username_company = ?, Password_company = ?, Name = ?, Email = ?, Deskripsi = ?, Location = ? WHERE id_company = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, company.getUsername());
            statement.setString(2, company.getPassword());
            statement.setString(3, company.getName());
            statement.setString(4, company.getEmail());
            statement.setString(5, company.getDescription());
            statement.setString(6, company.getLocation());
            statement.setInt(7, company.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void delete(int id) {
        String query = "DELETE FROM company WHERE id_company = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Company> getAllCompanies() {
        ArrayList<Company> companies = new ArrayList<>();
        String query = "SELECT * FROM company";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id_company");
                String username = resultSet.getString("username_company");
                String password = resultSet.getString("password_company");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String description = resultSet.getString("deskripsi");
                String location = resultSet.getString("location");

                Company company = new Company(id, username, password, name, email, description, location);
                companies.add(company);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return companies;
    }
}
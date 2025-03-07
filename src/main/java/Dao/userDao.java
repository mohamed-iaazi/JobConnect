package Dao;

import java.sql.*;

import Model.userModel;
import servlet.userServlet;

public class userDao {
    private final String jdbcURL = "jdbc:mysql://localhost:3306/JobConnect";
        private final String jdbcUsername = "root";
    private final String jdbcPassword = "password";

    public userDao() {}

    public boolean addUser(userModel user) {
        String query = "INSERT INTO users (nom,email,tel,moteDePass) VALUES (?, ?,?,?)";
        try (Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, user.getNom());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(1, user.getTelephone());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.executeUpdate();
            return  true;
        } catch (SQLException e) {
            e.printStackTrace();
            return  false;
        }
    }


}

package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Model.userModel;

public class userDao {
    private final String jdbcURL = "jdbc:mysql://localhost:3306/JobConnect";
        private final String jdbcUsername = "root";
    private final String jdbcPassword = "password";

    public userDao() {}

    public void addUser(userModel user) {
        String query = "INSERT INTO users (nom,email,tel,moteDePass) VALUES (?, ?,?,?)";
        try (Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, user.getNom());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(1, user.getTel());
            preparedStatement.setString(2, user.getMoteDePass());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

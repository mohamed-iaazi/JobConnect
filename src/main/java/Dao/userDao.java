package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Model.User;


import static Utils.DatabaseConnector.getConnection;

public class userDao {



    public userDao() {}

    public boolean addUser(User user) {
        String query = "INSERT INTO user (nom,email,Telephone,password) VALUES (?, ?,?,?)";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setInt(3, user.getTelephone());
            preparedStatement.setString(4, user.getPassword());
            preparedStatement.executeUpdate();
            return  true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}

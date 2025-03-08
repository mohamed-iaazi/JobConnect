package Dao;

import java.sql.*;

import Model.userModel;
import servlet.userServlet;

public class userDao {
    private final String jdbcURL = "jdbc:mysql://localhost:3306/connectjob";
        private final String jdbcUsername = "root";
    private final String jdbcPassword = "1234";


    public userDao() {}

    public boolean addUser(userModel user) throws ClassNotFoundException {
        String query = "INSERT INTO user (nom,email,Telephone,password) VALUES (?, ?,?,?)";
        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, user.getNom());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getTelephone());
            preparedStatement.setString(4, user.getPassword());
            preparedStatement.executeUpdate();
            return  true;
        } catch (SQLException e) {
            e.printStackTrace();
            return  false;
        }
    }


}

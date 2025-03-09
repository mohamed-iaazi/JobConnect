package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Model.User;

public class userDao {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/connectjob"; // Remplacez avec votre base
    private static final String JDBC_USER = "root"; // Remplacez par votre utilisateur MySQL
    private static final String JDBC_PASSWORD = "root"; // Remplacez par votre mot de passe MySQL

    public static Connection getConnection() {
        Connection connection = null;
        try {
            // Charger le driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Établir la connexion
            connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erreur de connexion à la base de données !");
        }
        return connection;
    }


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

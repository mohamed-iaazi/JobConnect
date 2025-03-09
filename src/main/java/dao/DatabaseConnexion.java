package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnexion {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/connectjob"; // Remplacez avec votre base
    private static final String JDBC_USER = "root"; // Remplacez par votre utilisateur MySQL
    private static final String JDBC_PASSWORD = ""; // Remplacez par votre mot de passe MySQL

    // Méthode pour obtenir une connexion
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

    // Méthode pour fermer la connexion
    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
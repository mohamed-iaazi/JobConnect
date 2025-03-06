package dao;

import Model.Offer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CandidateDao {

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

    public static List<Offer> getListOffer() {


        // using try-with-resources to avoid closing resources (boiler plate code)
        List<Offer> produits = new ArrayList<>();
        // Step 1: Establishing a Connection
        String SELECT_ALL_LIST="select * from OffreEmploi";
        try (Connection connection = getConnection();

             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_LIST)) {
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                String name = rs.getString("Titre");
                String description = rs.getString("Description");
                Date date = rs.getDate("Date");

                produits.add(new Offer( name, description,date));

            }
        } catch (SQLException e) {
        }
        System.out.print("list of in method ");

        return produits;
    }
}
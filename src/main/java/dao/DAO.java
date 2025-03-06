package dao;



import model.Offer;
import model.Recruteur;
import model.Users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/connectjob?allowPublicKeyRetrieval=true&useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "admin";

    private static final String Insert_Offers = "INSERT INTO OffreEmploi (Description, Date, Titre) VALUES(?,?,?)";
    public DAO() {}

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
    public void AjouterOffers(Offer offer) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(Insert_Offers)) {

            preparedStatement.setString(1, offer.getDescription());
            preparedStatement.setString(3,offer.getTitre());
            preparedStatement.setDate(2,offer.getDate_publication());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error inserting rendezvous: " + e.getMessage());
        }

    }


}

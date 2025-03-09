package Dao;



import Model.Offer;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static Utils.DatabaseConnector.getConnection;

public class DashboardDao {


    private static final String Insert_Offers = "INSERT INTO OffreEmploi (Description, Date, Titre) VALUES(?,?,?)";
    public DashboardDao() {}


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

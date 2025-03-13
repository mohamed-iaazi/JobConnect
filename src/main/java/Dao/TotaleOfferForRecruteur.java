package Dao;

import Utils.DatabaseConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TotaleOfferForRecruteur {
    public static int FountTotaleOffer(int id){
       int totaleoffer= 0 ;

        String SELECT_TOTALE_OFFER = "select count(id) as count from OffreEmploi where Id_Recruteur=?";

        try (Connection connection= DatabaseConnector.getConnection(); PreparedStatement preparedStatement= connection.prepareStatement(SELECT_TOTALE_OFFER)) {
           preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                totaleoffer= resultSet.getInt("count");
                System.out.println(totaleoffer);

            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return totaleoffer;
    }

}

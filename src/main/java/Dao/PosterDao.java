package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PosterDao {

    public  void  PostToOffer(int offerId, int userId) throws SQLException {
        System.out.println(userId);

        Connection connection=Utils.DatabaseConnector.getConnection();
        PreparedStatement preparedStatement= connection.prepareStatement("INSERT  INTO  candidature (Id_OffreEmploi, Id_Candidat) values (?,?)");
        preparedStatement.setInt(1, offerId);
        preparedStatement.setInt(2, userId);

        preparedStatement.executeUpdate();

    }
}

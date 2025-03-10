package Dao;

import Model.Offer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static Utils.DatabaseConnector.getConnection;

public class CandidateDao {


    public static List<Offer> getListOffer() {

        // using try-with-resources to avoid closing resources (boiler plate code)
        List<Offer> Offer = new ArrayList<>();
        // Step 1: Establishing a Connection
        String SELECT_ALL_LIST="select * from offreemploi";
        try (Connection connection = getConnection();

             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_LIST)) {
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("Titre");
                String description = rs.getString("Description");
                Date date = rs.getDate("Date");

                Offer.add(new Offer(id, name, description,date));

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage()+"errour");
        }
        System.out.print("list of in method ");

        return Offer;
    }
}
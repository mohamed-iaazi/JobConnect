package Dao;

import java.sql.*;

import Model.User;


import static Utils.DatabaseConnector.getConnection;

public class RegisterDao {



    public RegisterDao() {}

    public int addUser(User user) {
        String InsertToUser = "INSERT INTO user (nom,email,Telephone,password,Role) VALUES (?, ?,?,?,?)";
        String InsertToCandidate = "INSERT into candidat  (Id_User, Cv) VALUES (?,?)";
        String InsertToRecruteur = "INSERT into recruteur  (Id_User) VALUES (?)";


        try (Connection connection = getConnection();
             PreparedStatement preparedStatementUser = connection.prepareStatement(InsertToUser, Statement.RETURN_GENERATED_KEYS);
             PreparedStatement prepareStatementCandidate = connection.prepareStatement(InsertToCandidate);
             PreparedStatement prepareStatementRecruteur = connection.prepareStatement(InsertToRecruteur)
        ) {
            preparedStatementUser.setString(1, user.getName());
            preparedStatementUser.setString(2, user.getEmail());
            preparedStatementUser.setInt(3, user.getTelephone());
            preparedStatementUser.setString(4, user.getPassword());
            preparedStatementUser.setString(5, user.getRole());

            preparedStatementUser.executeUpdate();

            ResultSet generatedKeys = preparedStatementUser.getGeneratedKeys();

           if (user.getRole().equals("Candidate")) {
               if (generatedKeys.next()) {
                   int userId = generatedKeys.getInt(1);
                   prepareStatementCandidate.setInt(1, userId);
                   prepareStatementCandidate.setString(2, "Cv.pdf");

                   prepareStatementCandidate.executeUpdate();
                   System.out.println("UserId: " + userId);
                   return userId  ;

               }
           }
           else {
               if (generatedKeys.next()) {
                   int userId = generatedKeys.getInt(1);
                   prepareStatementRecruteur.setInt(1, userId);
                   prepareStatementRecruteur.executeUpdate();
                   System.out.println("UserId: " + userId);
                   return userId  ;

               }
           }



        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
        return  0;
    }
}

package dao;



import model.Offer;
import model.Recruteur;
import model.Users;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/connectjob?allowPublicKeyRetrieval=true&useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "admin";

    private static final String Insert_Offers = "INSERT INTO OffreEmploi (Description, Date, Titre,Id_Recruteur) VALUES(?,?,?,?)";
    private static final String Insert_Users = "Insert into User (Nom, Email, Telephone)values(?,?,?)";
    private static final String Insert_Recruteur = "Insert into Recruteur(Id_User)values(?)";
    private static final String Select_Recruteur = "select * from Recruteur;";
    private static final String Select_Offers = "select * from OffreEmploi;";


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
            preparedStatement.setInt(4,offer.getId_Recruteur());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error inserting rendezvous: " + e.getMessage());
        }

    }
    public void AjouterUser(Recruteur recruteur) {

        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(Insert_Users, Statement.RETURN_GENERATED_KEYS)) {

            preparedStatement.setString(1, recruteur.getNom());
            preparedStatement.setString(2, recruteur.getEmail());
            preparedStatement.setString(3, recruteur.getTelephone());

            int affectedRows = preparedStatement.executeUpdate();

            if (affectedRows > 0) {
                try (ResultSet generatedKeys = preparedStatement.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        recruteur.setId(generatedKeys.getInt(1));
                    } else {
                        throw new SQLException("User insertion failed, no ID obtained.");
                    }
                }
            } else {
                throw new SQLException("User insertion failed, no rows affected.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error inserting user: " + e.getMessage());
        }
    }

    public void AjouterRecruteur(Recruteur recruteur) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(Insert_Recruteur)) {

            preparedStatement.setInt(1, recruteur.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error inserting rendezvous: " + e.getMessage());
        }

    }
    public List<Recruteur> SelectAllRectruteurs() {
        List<Recruteur> recruteurs = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(Select_Recruteur);
             ResultSet rs = preparedStatement.executeQuery()) {
            while (rs.next()) {

                int id = rs.getInt("id");
                recruteurs.add(new Recruteur(id));
                System.out.println("testmodel");

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(recruteurs);

        return recruteurs;
    }
    public List<Offer> SelectAllOffers() {
        List<Offer> offers = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(Select_Offers);
             ResultSet rs = preparedStatement.executeQuery()) {
            while (rs.next()) {

                int id = rs.getInt("id");
                String Description = rs.getString("Description");
                String Date_publication = rs.getString("Date");
                Date dt = Date.valueOf(Date_publication);

                String Titre = rs.getString("Titre");
                int id_Recruteur = rs.getInt("Id_Recruteur");
                offers.add(new Offer(id,Description,Titre,dt,id_Recruteur));



            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(offers);

        return offers;
    }


}

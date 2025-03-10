package model;

import java.sql.Date;

public class Offer {
    private int id;
    private String titre;
    private String description;
    private Date date_publication;
    private int Id_Recruteur;

    public Offer(int id, String titre, String description, Date date_publication, int id_Recruteur) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.date_publication = date_publication;
        Id_Recruteur = id_Recruteur;
    }

    public Offer(String titre, String description, Date date_publication, int id_Recruteur) {
        this.titre = titre;
        this.description = description;
        this.date_publication = date_publication;
        Id_Recruteur = id_Recruteur;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate_publication() {
        return date_publication;
    }

    public void setDate_publication(Date date_publication) {
        this.date_publication = date_publication;
    }

    public int getId_Recruteur() {
        return Id_Recruteur;
    }

    public void setId_Recruteur(int id_Recruteur) {
        Id_Recruteur = id_Recruteur;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", date_publication=" + date_publication +
                ", Id_Recruteur=" + Id_Recruteur +
                '}';
    }
}

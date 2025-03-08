package Model;

import java.sql.Date;

public class Offer {
    private int id;
    private String titre;
    private String description;
    private Date date_publication;


    public Offer(int id, String titre, String description, Date date_publication) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.date_publication = date_publication;
    }

    public Offer(String titre, String description, Date date_publication) {
        this.titre = titre;
        this.description = description;
        this.date_publication = date_publication;
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

    @Override
    public String toString() {
        return "Offer{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", date_publication=" + date_publication +
                '}';
    }
}

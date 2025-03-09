package Model;

public class Recruteur extends User {
    int id;
    Offer offer;

    public Recruteur(String nom, String email, int telephone, String password) {
        super(nom, email, telephone, password);
    }

    public Recruteur() {
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getRole() {
        return "Recruteur";
    }

    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }
}

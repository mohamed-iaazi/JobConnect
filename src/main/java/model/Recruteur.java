package model;

public class Recruteur extends Users{
      Offer offer;

    public Recruteur(int id, String nom, String email, String telephone, Offer offer) {
        super(id, nom, email, telephone);
        this.offer = offer;
    }

    public Recruteur(String nom, String email, String telephone, Offer offer) {
        super(nom, email, telephone);
        this.offer = offer;
    }

    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    @Override
    public String toString() {
        return "Recruteur{" +
                "offer=" + offer +super.toString() +
                '}';
    }
}

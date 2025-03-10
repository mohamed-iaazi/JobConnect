package model;

public class Recruteur2 extends Users2 {

    public Recruteur2(int id, String nom, String email, String telephone, String password) {
        super(id, nom, email, telephone,password);
    }

    public Recruteur2(String nom, String email, String telephone) {
        super(nom, email, telephone);
    }

    public Recruteur2(int id) {
        super(id);
    }

    @Override
    public String toString() {
        return "Recruteur{" +
                 super.toString() +
                '}';
    }
}

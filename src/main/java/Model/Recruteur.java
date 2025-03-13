package Model;

public class Recruteur extends Users {

    public Recruteur(int id, String nom, String email, String telephone, String password) {
        super(id, nom, email, telephone,password);
    }

    public Recruteur(String nom, String email, String telephone) {
        super(nom, email, telephone);
    }

    public Recruteur(int id) {
        super(id);
    }

    @Override
    public String toString() {
        return "Recruteur{" +
                 super.toString() +
                '}';
    }
}

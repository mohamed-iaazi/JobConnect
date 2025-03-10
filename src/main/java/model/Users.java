package model;

public abstract class Users {
    private int id;
    private String nom;
    private String email;
    private String telephone;
    private String password;

    public Users(int id, String nom, String email, String telephone, String password) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.telephone = telephone;
        this.password = password;
    }

    public Users(String nom, String email, String telephone) {
        this.nom = nom;
        this.email = email;
        this.telephone = telephone;
    }

    public Users(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

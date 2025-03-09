package Model;

public abstract class User {
    private  int id;
    private  String nom;
    private  String email;
    private  int telephone ;
    private  String password;

    public User(int id, String name, String email, int telephone, String password) {
        this.id = id;
        this.nom = name;
        this.email = email;
        this.telephone = telephone;
        this.password = password;
    }

    public User(String nom, String email, int telephone, String password) {
        this.nom = nom;
        this.email = email;
        this.telephone = telephone;
        this.password = password;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return nom;
    }

    public void setName(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

package Model;

public class userModel{
    private int Id;
    private String Nom;
    private String Email;
    private String  Telephone;
    private String password;


    public userModel ( int Id,String Nom,String Email,String Telephone,String password){
        this.Id=Id;
        this.Nom=Nom;
        this.Email=Email;
        this.Telephone=Telephone;
        this.password=password;

    }
    public userModel (String Nom,String Email,String Telephone, String password){
        this.Nom= Nom;
        this.Email= Email;
        this.Telephone= Telephone;
        this.password= password;

    }

    public userModel() {

    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = Email;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String Telephone) {
        this.Telephone = Telephone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMoteDePass(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "registerModel{" +
                "Id=" + Id +
                ", Nom='" + Nom + '\'' +
                ", Email='" + Email + '\'' +
                ", Telephone='" + Telephone+ '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

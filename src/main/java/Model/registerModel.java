package Model;

public class registerModel{
    private int id;
    private String nom;
    private String email;
    private String tel;
    private String moteDePass;


    public registerModel ( int id,String nom,String email,String tel,String moteDePass){
        this.id=id;
        this.nom=nom;
        this.email=email;
        this.tel=tel;
        this.moteDePass=moteDePass;

    }
    public registerModel (String nom,String email,String tel, String moteDePass){
        this.nom=nom;
        this.email=email;
        this.moteDePass = moteDePass;
        this.tel=tel;
        this.moteDePass=moteDePass;

    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom=nom;
    }
    public String getEmail(){
        return email;
    }
    public void setTel(String tel){
        this.tel=tel;
    }
    public String getMoteDePass(){
        return moteDePass;
    }
    public void setId(String moteDePass){
        this.moteDePass = moteDePass;
    }
    @Override
    public String toString() {
        return "registerModel{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", email='" + email + '\'' +
                ", tel='" + tel+ '\'' +
                ", mot de pass='" + moteDePass+ '\'' +
                '}';
    }
}

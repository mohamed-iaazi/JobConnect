package Model;

public class Candidate extends User  {

    private  int id ;
    private  String cv ;
    private  int User_Id ;

    public Candidate(String nom, String email, int telephone, String password, String cv, int user_Id) {
        super(nom, email, telephone, password);
        this.cv = cv;
        User_Id = user_Id;
    }

    public Candidate(int id, String name, String email, int telephone, String password, int user_Id, String cv) {
        super(id, name, email, telephone, password);
        User_Id = user_Id;
        this.cv = cv;
    }

    public Candidate( String name, String email, int telephone, String password) {
        super( name, email, telephone, password);
    }

    public Candidate() {
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
        return "Candidate";
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public int getUser_Id() {
        return User_Id;
    }

    public void setUser_Id(int user_Id) {
        User_Id = user_Id;
    }
}

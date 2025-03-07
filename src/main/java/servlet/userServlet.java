package servlet;
import java.io.IOException;
import java.sql.SQLException;

import Model.userModel;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import Dao.userDao;

@WebServlet("/userServlet")
public class userServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private userDao userDao;

    public void init() {
        userDao = new userDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String Nom = request.getParameter("Nom");
        String Email = request.getParameter("Email");
        String Telephone = request.getParameter(" Telephone");
        String password = request.getParameter("password");

//        userModel user = null;
//        user.setId(Integer.parseInt(Id));
//        user.setNom(Nom);
//        user.setEmail(Email);
//        user.setEmail(Telephone);
//        user.setPassword(password);


        userModel user = new userModel( Nom, Email, Telephone, password);
        Dao.userDao userDao= new userDao();
           boolean ajouter=  userDao.addUser(user);


            if (ajouter) {
                request.getSession().setAttribute("user", user.getNom());
                response.sendRedirect("loginSuccess.jsp");
            } else {
                response.sendRedirect("login.jsp?error=true");
            }


    }
}


package Controller;

import Dao.RegisterDao;
import Model.Candidate;
import Model.Recruteur;
import Model.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Objects;

@WebServlet("/userServlet")
public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private RegisterDao userDao;

    public void init() {
        userDao = new RegisterDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        User user;
        String Nom = request.getParameter("Nom");
        String Email = request.getParameter("Email");
        System.out.println(request.getParameter("Telephone"));
        int Telephone = Integer.parseInt(request.getParameter("Telephone"));
        String password = request.getParameter("password");
        String role = request.getParameter("Role");
        System.out.println(role);

        if (Objects.equals(role, "Recruteur")) {

             user = new Recruteur(Nom,Email,Telephone,password);
        }
        else {
            user = new Candidate(Nom,Email,Telephone,password);

        }


        RegisterDao userDao= new RegisterDao();
        boolean ajouter;
        ajouter = userDao.addUser(user);


        if (ajouter) {
            request.getSession().setAttribute("user", user.getName());
            request.getSession().setAttribute("role", user.getRole());

            if (role.equals("Recruteur")) {
                response.sendRedirect("Dashboard.jsp");

            }
            else {
                response.sendRedirect("Candidate.jsp");
            }

        } else {
            response.sendRedirect("Register.jsp?error=true");
        }


    }
}


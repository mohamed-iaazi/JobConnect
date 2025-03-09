package Servlet;

import Dao.userDao;
import Model.Candidate;
import Model.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/userServlet")
public class userServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private Dao.userDao userDao;

    public void init() {
        userDao = new userDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String Nom = request.getParameter("Nom");
        String Email = request.getParameter("Email");
        System.out.println(request.getParameter("Telephone"));
        int Telephone = Integer.parseInt(request.getParameter("Telephone"));
        String password = request.getParameter("password");
       System.out.println(Telephone);
        User user = new Candidate(Nom,Email,Telephone,password);


        Dao.userDao userDao= new userDao();
        boolean ajouter;
        ajouter = userDao.addUser(user);


        if (ajouter) {
            request.getSession().setAttribute("user", user.getName());
            response.sendRedirect("Candidate.jsp");
        } else {
            response.sendRedirect("login.jsp?error=true");
        }


    }
}


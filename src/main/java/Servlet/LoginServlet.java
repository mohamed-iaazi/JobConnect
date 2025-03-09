package Servlet;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/connectjob";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "root";
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");


        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Chargement du driver MySQL
            Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

            String sql = "SELECT * FROM User WHERE Email = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, email);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {

                HttpSession session = request.getSession();
                session.setAttribute("userEmail", email);
                session.setAttribute("userName", rs.getString("Nom"));

                response.sendRedirect("Candidate.jsp"); // Redirige vers la page d'accueil
            } else {
                request.setAttribute("errorMessage", "Email ou mot de passe incorrect.");
                request.getRequestDispatcher("Login.jsp").forward(request, response);
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("errorMessage", "Problème technique, réessayez plus tard.");
            request.getRequestDispatcher("Login.jsp").forward(request, response);
        }
    }
}

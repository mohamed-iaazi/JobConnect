package Controller;

import Dao.DAO2;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import Model.Offer;
import Model.Recruteur;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/")
public class ControllerDachboard extends HttpServlet {
    DAO2 dao;

    @Override
    public void init() throws ServletException {
        dao = new DAO2();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getServletPath();
        try {
            switch (action) {
                case "/offers":
                    OFFERS(request, response);
                    break;
                    case "/insertOffers":
                        insertOffers(request, response);
                        break;
                case "/createAccount":
                    insertRecruteur(request, response);
                    break;
                case "/Recruteur":
                    Recruteur(request, response);
                    break;
                default :
                    Dashbord(request, response);
                    break;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }
    }
    private void Dashbord(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List<Offer> offers = dao.SelectAllOffers();
        request.setAttribute("offers", offers);
        RequestDispatcher dispatcher = request.getRequestDispatcher("Dashboard.jsp");

        dispatcher.forward(request, response);

    }
    private void OFFERS(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List<Recruteur> recruteurs = dao.SelectAllRectruteurs();
        request.setAttribute("recruteurs", recruteurs);
        RequestDispatcher dispatcher = request.getRequestDispatcher("offer.jsp");

        dispatcher.forward(request, response);

    }
    private void Recruteur(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("Recruteur.jsp");

        dispatcher.forward(request, response);

    }
    private void insertOffers(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        int Id_Recruteur = Integer.parseInt(request.getParameter("Id_Recruteur"));
        String Description = request.getParameter("Description");
        String date = request.getParameter("date");
        String titre = request.getParameter("titre");
        Date dt = Date.valueOf(date);

        Offer offer = new Offer(titre,Description, dt,Id_Recruteur);
        dao.AjouterOffers(offer);


        response.sendRedirect("./offers");
    }
    private void insertRecruteur(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        try {
            String nom = request.getParameter("nom");
            String email = request.getParameter("email");
            String telephone = request.getParameter("telephone");

            Recruteur rec = new Recruteur(nom, email, telephone);

            dao.AjouterUser(rec);
            if (rec.getId() > 0) {
                dao.AjouterRecruteur(rec);
                response.sendRedirect("./Recruteur");
            } else {
                response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Failed to insert user.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "An error occurred while inserting recruiter.");
        }
    }

}

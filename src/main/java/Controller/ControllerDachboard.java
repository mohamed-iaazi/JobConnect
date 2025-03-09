package Controller;

import Dao.DAO;
import Model.Offer;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;

@WebServlet("/ControllerDachboard")
public class ControllerDachboard extends HttpServlet {
    DAO dao;

    @Override
    public void init() throws ServletException {
        dao = new DAO();
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
        RequestDispatcher dispatcher = request.getRequestDispatcher("Dashboard.jsp");

        dispatcher.forward(request, response);

    }
    private void OFFERS(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("OFFER.jsp");

        dispatcher.forward(request, response);

    }
    private void insertOffers(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {

        String Description = request.getParameter("Description");
        String date = request.getParameter("date");
        String titre = request.getParameter("titre");
        Date dt = Date.valueOf(date);

        Offer offer = new Offer(titre,Description, dt);
        dao.AjouterOffers(offer);


        response.sendRedirect("./");
    }
}

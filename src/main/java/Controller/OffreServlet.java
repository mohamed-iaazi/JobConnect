package Controller;

import Dao.DashboardDao;
import Model.Offer;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;


@WebServlet("/offer")
public class OffreServlet  extends HttpServlet {
    DashboardDao dao;

    @Override
    public void init() throws ServletException {
        dao = new DashboardDao();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            insertOffers(req,resp);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.sendRedirect("OFFER.jsp");
    }

    private void insertOffers(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {

        String Description = request.getParameter("Description");
        String date = request.getParameter("date");
        String titre = request.getParameter("titre");
        Date dt = Date.valueOf(date);

        Offer offer = new Offer(titre,Description, dt);
        dao.AjouterOffers(offer);


        response.sendRedirect("Dashboard.jsp");
    }
}

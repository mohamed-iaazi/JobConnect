package Controller;

import Model.Offer;
import dao.CandidateDao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/CandidateServlet")
public class CandidateServlet  extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            listProduit(req,resp);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void listProduit(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List<Offer> listOffer = CandidateDao.getListOffer();
        RequestDispatcher dispatcher = request.getRequestDispatcher("Candidate.jsp");
        request.setAttribute("listOffer", listOffer);
        dispatcher.forward(request, response);
    }
}

package Controller;

import Dao.PosterDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/PostToOffer")
public class PostToOffer extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Retrieve offerId from request parameters
        String offerId = request.getParameter("offerId");

        // Debugging: Print the retrieved offerId
        System.out.println("Offer ID received: " + offerId);

        if (offerId == null || offerId.isEmpty()) {
            response.getWriter().write("Error: Offer ID not found!");
            return;
        }
        else {
             HttpSession session = request.getSession();
             int user= (int) session.getAttribute("userid");

            // Process the offerId (Example: Fetch from database)
            request.setAttribute("offerId", offerId);
            PosterDao posterDao = new PosterDao();
            try {
                posterDao.PostToOffer(Integer.parseInt(offerId),user);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

            // Forward to a JSP page (Optional)
            request.getRequestDispatcher("/Candidate.jsp").forward(request, response);
        } }
}

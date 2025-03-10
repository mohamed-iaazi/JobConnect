package Controller;

import Dao.DashboardDao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/ControllerDachboard")
public class ControllerDachboard extends HttpServlet {
    DashboardDao dao;

    @Override
    public void init() throws ServletException {
        dao = new DashboardDao();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            Dashbord(request, response);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
    private void Dashbord(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("Dashboard.jsp");
        dispatcher.forward(request, response);
    }


}

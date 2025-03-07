package servlet;

import java.io.IOException;

import Model.userRole;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.management.relation.Role;

@WebFilter({"/Candidate", "/Dashboard"})
public class roleAuthFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        Object user = httpRequest.getSession().getAttribute("user");

        if (user != null) {

            String role = "String.valueOf(getUserRole(user))";

            if ("Candidate".equals("userRole")) {
                chain.doFilter(request, response);
            } else {
                httpResponse.sendRedirect(httpRequest.getContextPath() + "/Dashboard.jsp");
            }
        } else {
            httpResponse.sendRedirect(httpRequest.getContextPath() + "/login.jsp");
        }
    }

    private Role getUserRole(userRole user) {

        return null;
    }

}


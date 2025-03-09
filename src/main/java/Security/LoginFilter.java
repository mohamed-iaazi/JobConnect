package Security;


import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.*;

import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter({"/Login.jsp", "/Login", "/Register", "/Register.jsp"})
public class LoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;

        // Get existing session, do not create a new one
        HttpSession session = httpServletRequest.getSession(false);

        if (session == null || session.getAttribute("user") == null) {
            // No session or no user logged in -> Allow access to Login/Register
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            // User is logged in, redirect based on role
            String userRole = session.getAttribute("user").toString();

            if ("Recruteur".equals(userRole)) {
                httpServletResponse.sendRedirect("Dashboard.jsp");
            } else {
                httpServletResponse.sendRedirect("Candidate.jsp");
            }
        }
    }
}

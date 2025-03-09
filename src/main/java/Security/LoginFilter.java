package Security;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebFilter({"/Login.jsp" , "/Login" , "/Register","/Register.jsp"})
public class LoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;

        if (((HttpServletRequest) servletRequest).getSession(false).getAttribute("user")==null) {

            filterChain.doFilter(servletRequest, servletResponse);


        }
        else {

            if (((HttpServletRequest) servletRequest).getSession(false).getAttribute("role").toString().equals("Recruteur")) {

                httpServletResponse.sendRedirect("Dashboard.jsp");

            }
            else {
                httpServletResponse.sendRedirect("Candidate.jsp");
            }

        }
    }
}


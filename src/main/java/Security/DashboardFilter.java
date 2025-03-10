package Security;


import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebFilter({"/Dashboard.jsp" , "/Dashboard"})
public class DashboardFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpSession session = httpServletRequest.getSession();

        if (session!=null && session.getAttribute("role") != null) {

            if ( session.getAttribute("role").toString().equals("Recruteur")) {

                filterChain.doFilter(servletRequest, servletResponse);
            }
            else  {
                HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
                httpServletResponse.sendRedirect("Login.jsp?NoAccess=true");
            }


        }
        else {
            HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
            httpServletResponse.sendRedirect("Login.jsp?NoAccess=true");
        }
    }
}


package Security;


import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebFilter({"/Dashboard.jsp" , "/Dashboard"})
public class DashboardFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        if (((HttpServletRequest) servletRequest).getSession(false).getAttribute("user")!=null
                && ((HttpServletRequest) servletRequest).getSession(false).getAttribute("role").toString().equals("Recruteur")) {

            filterChain.doFilter(servletRequest, servletResponse);


        }
        else {
            HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
            httpServletResponse.sendRedirect("Login.jsp?NoAccess=true");
        }
    }
}


package servlet;


import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.logging.Filter;
ùùùù

@WebFilter({"/Condidature", "/Dashboard"})
public class registerFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        if (httpRequest.getSession().getAttribute("user") != null) {

            chain.doFilter(request, response);
        }
        else {
            httpResponse.sendRedirect(httpRequest.getContextPath() + "/Login.jsp");
        }

    }
}
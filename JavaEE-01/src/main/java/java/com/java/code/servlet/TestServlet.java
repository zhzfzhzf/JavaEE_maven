package java.com.java.code.servlet;

import javax.servlet.*;
import java.io.IOException;

public class TestServlet implements Servlet {


    public void init(ServletConfig servletConfig) throws ServletException {

    }


    public ServletConfig getServletConfig() {
        return null;
    }


    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
            servletResponse.getWriter().println("helloworld");
    }


    public String getServletInfo() {
        return null;
    }


    public void destroy() {

    }
}

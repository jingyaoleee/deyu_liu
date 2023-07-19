package servlet.com;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = {"/servletLife"})
public class ServletLife extends GenericServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("Servlet init ......");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("hello Servlet ......");
    }

    @Override
    public void destroy() {
        System.out.println("Servlet destroy......");
    }
}

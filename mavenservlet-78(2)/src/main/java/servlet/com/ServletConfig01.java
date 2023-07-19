package servlet.com;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.Principal;

//@WebServlet(urlPatterns = {"/servletConfig01"},initParams = {@WebInitParam(name = "encoding",value = "utf-8"),@WebInitParam(name = "user",value = "admin")})
public class ServletConfig01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        // 获取ServletConfig对象
        ServletConfig config = this.getServletConfig();
        //获取初始化参数
        String encoding = config.getInitParameter("encoding");
        String user = config.getInitParameter("user");
        // 输出到页面
        out.println("encoding = " + encoding);
        out.println("user = " + user);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}

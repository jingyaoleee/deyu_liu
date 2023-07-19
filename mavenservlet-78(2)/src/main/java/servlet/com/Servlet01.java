package servlet.com;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//使用 @WebServlet 进行虚拟路径映射
/*
* @WebServlet注解用于代替web.xml文件中<servlet>、<servlet-mapping>
* 等标签，该注解将会在项目部署时被容器处理。属性：
* name:指定Servlet的name属性，等价于<servlet-name>
* urlPatterns:指定一组Servlet的URL匹配模式，等价于<url-pattern>标签
* value：等价于urlPatterns属性，但urlPatterns和value属性不能同时使用
*WebInitParam[]:指定一组Servlet初始化参数，等价于<init-param>标签
* */
//@WebServlet(urlPatterns = {"/servlet0101"})
public class Servlet01 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        PrintWriter out = resp.getWriter();
//        out.println("hello servlet!!!!!");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}

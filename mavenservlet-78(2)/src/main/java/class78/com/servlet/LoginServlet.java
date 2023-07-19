package class78.com.servlet;

import class78.com.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/loginServlet"})
public class LoginServlet extends HttpServlet {

    // 处理Get请求
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    // 处理POST请求
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("servlet doPost ........");
        // 解决Post方法 请求乱码
        req.setCharacterEncoding("utf-8");
        // 获取前端（页面）传输过来的数据
        // 获取账号
        String account = req.getParameter("account");
        // 获取密码
        String password = req.getParameter("password");

        //创建UserService对象
        UserService userService = new UserService();
        int res = userService.sureAccountPassword(account,password);
        // 成功
        if (res == 0){

        }else{ // 失败

        }

        // 获取性别
        //String sex = req.getParameter("sex");
        // 获取分类
        //String[] types = req.getParameterValues("type");

        // 打印到控制
        System.out.println("account = "+account);
        System.out.println("password = " + password);
//        System.out.println("sex = " + sex);
//        for (int i = 0; i < types.length; i++) {
//            System.out.println("type = "+ types[i]);
//        }


    }
}

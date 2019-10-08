package servlet_demo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Login extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
            String username=req.getParameter("username");
            String pwd=req.getParameter("pwd");
        //设置响应内容类型


        //设置逻辑实现
        PrintWriter out = resp.getWriter();


        resp.setContentType("text/html;charset=utf-8");
        if ("admin".equals(username)&&"123".equals(pwd))
        {
            System.out.println("登陆成功");

            String out1= new String("登陆成功".getBytes("ISO-8859-1"),"UTF-8");
            System.out.println(out1);
            resp.getWriter().write("登陆成功");
        }
        else{
            String out1= new String("登陆失败".getBytes("ISO-8859-1"),"UTF-8");
            System.out.println(out1);
            resp.getWriter().write("登陆失败");
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}

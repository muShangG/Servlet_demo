package Cookie_demo;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class demo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        Cookie  cookie=new Cookie("aa", "bb");
       resp.addCookie(cookie);
       resp.getWriter().write("请求成功");

       Cookie[] cookies=req.getCookies();
        if (cookies != null) {
            for (Cookie c: cookies ) {
                System.out.println(c.getName()+"+++"+c.getValue());
            }
        }


        HttpSession session=req.getSession();
        String id=session.getId();
        session.setAttribute("s","e");

        session.getAttribute("s");
    }
}

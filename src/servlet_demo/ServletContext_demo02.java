package servlet_demo;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

public class ServletContext_demo02 extends HttpServlet {
    private String message;
    @Override
    public void init() throws ServletException {
        message = "Hello world, this message is from servlet!";


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     //获取文件路径
        Properties properties =new Properties();
        InputStream inputStream=getClass().getClassLoader().getResourceAsStream("../../config.properties");
        properties.load(inputStream);
        System.out.println(properties.getProperty("name"));

    }
}

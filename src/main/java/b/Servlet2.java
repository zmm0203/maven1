package b;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class Servlet2 extends HttpServlet {

    public Servlet2(){
        System.out.println("实例化");
 }
 @Override
    public void init(){
        System.out.println("初始化");
    }
    @Override
    public void destroy(){
        System.out.println("终止");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     System.out.println("服务");
    }
}

package org.lanqiao.servlet;

import org.lanqiao.dao.Userdao;
import org.lanqiao.entity.Userentity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet( "/Show2Servlet")
public class Show2Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int pageNum=1;
        int pageSize=3;
//        String num=request.getParameter("num");
//        if(num!=null&&!num.equals("")) {
//            pageNum = Integer.parseInt(num);
//        }
            Userdao userdao=new Userdao();
            List<Userentity> list=userdao.showMsg(pageNum,pageSize);
            System.out.println(list);
            request.setAttribute("list",list);
            request.getRequestDispatcher("message.jsp").forward(request,response);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

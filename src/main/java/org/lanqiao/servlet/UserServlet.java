package org.lanqiao.servlet;

import org.lanqiao.dao.Userdao;
import org.lanqiao.entity.Userentity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/user")
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     String username=request.getParameter("username");
      String msg = request.getParameter("message");
        Userentity user=new Userentity();
        user.setUsername(username);
        user.setMsg(msg);
        Userdao userdao=new Userdao();
        int ret = userdao.insert(user);
//        System.out.println("结果集ret"+ret);
//        ArrayList list=(ArrayList) userdao.showMsg();
//        System.out.println("结果集ret"+list);
//        response.getWriter().print(username);
        PrintWriter out = response.getWriter();
        out.print(ret);
        out.flush();
        out.close();
//
}

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

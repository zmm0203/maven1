package org.lanqiao.servlet;

import org.lanqiao.dao.Userdao;
import org.lanqiao.entity.Userentity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet( "/InsertServlet")
public class InsertServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username=request.getParameter("username");
        String msg = request.getParameter("message");
        Userentity user=new Userentity();
        user.setUsername(username);
        user.setMsg(msg);
        Userdao userdao=new Userdao();
        int ret = userdao.insert(user);
         request.getSession().setAttribute("ret'",ret);
        response.sendRedirect("/Show2Servlet");
}
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

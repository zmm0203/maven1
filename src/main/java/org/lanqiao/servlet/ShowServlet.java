package org.lanqiao.servlet;

import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;
import org.lanqiao.dao.Userdao;
import org.lanqiao.entity.Userentity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

@WebServlet("/ShowServlet")
public class ShowServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int pageNum=1;
        int pageSize=3;
        String num=request.getParameter("num");
        if(num!=null&&!num.equals("")){
            pageNum=Integer.parseInt(num);
        }
        System.out.println(num);
        System.out.println(pageNum);
         Userdao userdao=new Userdao();
        List<Userentity> list=userdao.showMsg(pageNum,pageSize);
        System.out.println(list);
        JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.registerJsonValueProcessor(Date.class , new JsonDateValueProcessor());
        JSONArray jsonArray = JSONArray.fromObject(list,jsonConfig);
        System.out.println(jsonArray);
        jsonArray.add(userdao.count());
        PrintWriter out=response.getWriter();
        out.print(jsonArray);
        out.flush();
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

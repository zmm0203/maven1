<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="org.lanqiao.entity.Userentity" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/24 0024
  Time: 14:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>留言板</title>
    <style>
        div {
            margin: 0;
            padding: 0;
            font-size: 12px;
            margin: 0 auto;
        }

        h3 {
            text-align: center
        }

        #container {
            width: 500px;
        }

        .article {
            border: 1px solid #a6cbe7;
            margin-top: 5px;
        }

        .author {
            background-color: #0099FF;
            width: 100%;
            height: 24px;
            line-height: 24px;
        }

        .content {
            height: 40px;
            padding: 10px;
        }

        .author span {
            float: right;
            padding-right: 10px;
        }

        .time {
            border-top: solid 1px #a6cbe7;
        }

        .page {
            text-align: right;
            height: 30px;
            line-height: 30px;
            padding-right: 10px;
        }
    </style>
    <script src="js/jquery-2.1.4.min.js"></script>
    <script src="js/jquery.validate.min.js"></script>
    <script src="js/layer.js"></script>
    <link rel="stylesheet" type="text/css" href="css/layer.css">
    <%--<script>--%>
    <%--var num=1;--%>
    <%--var pageSize=3;--%>
    <%--var  maxPage=0;--%>
    <%--var count=0;--%>
    <%--$(function () {--%>
    <%--show();--%>
    <%--$(".btn1:eq(0)").click(function () {--%>
    <%--num=num>1 ? --num:num;--%>
    <%--$("#box").children().remove();--%>
    <%--show();--%>
    <%--});--%>
    <%--$(".btn1:eq(1)").click(function () {--%>
    <%--maxPage=Math.ceil(count/pageSize);--%>
    <%--num=num <maxPage ? ++num:maxPage;--%>
    <%--$("#box").children().remove();--%>
    <%--show();--%>
    <%--});--%>

    <%--$("#myForm").validate({--%>
    <%--onsubmit: true,// 是否在提交是验证--%>
    <%--onfocusout: false,// 是否在获取焦点时验证--%>
    <%--onkeyup: false,// 是否在敲击键盘时验证--%>
    <%--rules: {--%>
    <%--username: {--%>
    <%--required: true--%>
    <%--},--%>
    <%--message: {--%>
    <%--required: true--%>
    <%--}--%>
    <%--},--%>
    <%--messages: {--%>
    <%--username: {--%>
    <%--required: "请输入用户名"--%>
    <%--},--%>
    <%--message: {--%>
    <%--required: "请输入发送信息"--%>
    <%--}--%>
    <%--},--%>

    <%--submitHandler: function(form) { //通过之后回调--%>
    <%--//进行ajax传值--%>
    <%--//                 $.ajax({--%>
    <%--//                     url: "/user",   //要提交的URL路径--%>
    <%--//                     type: "post",                          //发送请求的方式--%>
    <%--//                     data: {--%>
    <%--//                         "username": $("input[name='username']").val(),--%>
    <%--//                         "message": $("textarea[name='message']").val()--%>
    <%--//                     },--%>
    <%--//                     dataType: "json",--%>
    <%--//                     //指定传输的数据格式--%>
    <%--//                     success: function (ret) {//请求成功后要执行的代码--%>
    <%--//                         if (ret == "1") {--%>
    <%--//                             layer.msg('留言成功！', {time: 1000}, function () {--%>
    <%--//                                 location.reload();--%>
    <%--//                             });--%>
    <%--//                         }--%>
    <%--//                         else{--%>
    <%--//                             alert("失败")--%>
    <%--//                         }--%>
    <%--//                     }--%>
    <%--//                 });--%>

    <%--},--%>
    <%--invalidHandler: function(form, validator) {}--%>
    <%--});--%>
    <%--});--%>
    <%--function show(){--%>
    <%--console.log(num);--%>
    <%--$.ajax({--%>
    <%--url: "/ShowServlet",   //要提交的URL路径--%>
    <%--type: "post",                          //发送请求的方式--%>
    <%--data:{"num":num},--%>
    <%--dataType: "json",--%>
    <%--//指定传输的数据格式--%>
    <%--success: function (list) {//请求成功后要执行的代码--%>
    <%--console.log(list);--%>
    <%--for (var i = 0; i < list.length-1; i++) {--%>
    <%--var $node = $(' <div class="article"><div class="author">用户:' + list[i].username + '<span>' + list[i].id + '#</span></div> <div class="content">' + list[i].msg + '</div> <div class="time page">' + list[i].createTime + '</div> </div>');--%>
    <%--$("#box").append($node);--%>
    <%--count=parseInt(list[list.length-1]);--%>
    <%--console.log(count);--%>
    <%--}--%>
    <%--}--%>
    <%--});--%>
    <%--}--%>
    <%--</script>--%>
    <%--<link rel="stylesheet" href="css/layer.css" type="text/css">--%>

</head>

<body>
<div id="container">
    <div><h3>留言板</h3></div>
      <c:forEach items="${list}" var="msg">
      <div>
        <div class="article">
            <div class="author">用户:${msg.username}<span>${msg.id}</span></div>
            <div class="content">${msg.msg}</div>
            <div class="time page">发表于:${msg.createTime}</div>
        </div>
        </c:forEach>
    </div>
    <!--<div class="article">-->
    <!--<div class="author">用户:张三<span>11#</span></div>-->
    <!--<div class="content">测试一下</div>-->
    <!--<div class="time page">发表于:2016-02-09 13:12:23</div>-->
    <!--</div>-->
    <!--<div class="article">-->
    <!--<div class="author">用户:张三<span>10#</span></div>-->
    <!--<div class="content">测试一下</div>-->
    <!--<div class="time page">发表于:2016-02-09 13:12:23</div>-->
    <!--</div>-->
    <div class="page">
        <input class="btn1" type="button" value="上一页">
        <input class="btn1" type="button" value="下一页">
    </div>
    <br>
    <div>
           <c:if test="${ret=='1'}">
               <c:out value="发布成功"></c:out>
               <c:remove var="ret" scope="session"></c:remove>
           </c:if>
        <form id="myForm" action="/InsertServlet" method="post">
            <div>
                用户: <input type="text" name="username">
            </div>
            <br>
            <div>
                留言: <textarea name="message" rows="5" cols="72"></textarea>
            </div>
            <div align="center"><input type="reset" value="清除"/> <input type="submit" value="发表"/></div>
        </form>
    </div>
</div>
</body>
</html>

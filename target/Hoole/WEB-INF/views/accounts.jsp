<%--
  Created by IntelliJ IDEA.
  User: CDogs
  Date: 2016/6/8
  Time: 17:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Hoole</title>
  <link href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet">
  <script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
  <script src="http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container-fluid">
  <div class="row-fluid">
<div class="span3"></div>
<div class="span6">
<table class="table">
  <caption><h1>accounts</h1></caption>
  <thead>
  <tr>
    <th>id</th>
    <th>邮箱</th>
    <th>家庭地址</th>
    <th>创建时间</th>
    <th>所属公司</th>
    <th>等级</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach items="${accounts}" var="a">
    <c:if test="${a.id}%4==0">
      <tr class="active">
    </c:if>

    <c:if test="${a.id}%4==1">
      <tr class="success">
    </c:if>

    <c:if test="${a.id}%4==2">
      <tr class="warning">
    </c:if>

    <c:if test="${a.id}%4==3">
      <tr class="danger">
    </c:if>

    <td>${a.id}</td>
    <td>${a.email}</td>
    <td>${a.address}</td>
    <td>${a.createTime}</td>
    <td>${a.company}</td>
    <td>${a.grade}</td>
  </tr>

  </c:forEach>
  </tbody>
</table>
</div>
<div clss="span3"></div>
</div>
  </div>
</body>
</html>

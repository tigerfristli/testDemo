<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">  
<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Spring mvc + spring + dubbo + mybatis</title>
</head>
<body style="margin:50px;">
<table class="table table-striped">
  <thead>
    <tr>
      <th>编号</th>
      <th>昵称</th>
      <th>手机</th>
      <th>邮箱</th>
      <th>地址</th>
      <th>操作</th>
    </tr>
  </thead>
  <tbody>
  	<c:forEach items="${userList}" var="user">
    <tr>
      <td><c:out value="${user.id}" /></td>
	  <td><c:out value="${user.nick}" /></td>
	  <td><c:out value="${user.phone}" /></td>
	  <td><c:out value="${user.email}" /></td>
	  <td><c:out value="${user.address}" /></td>
	  <td>
	  <a href='${pageContext.request.contextPath}/api/getUser?id=<c:out value="${user.id}" />'>修改</a>
	  <a href='${pageContext.request.contextPath}/api/deleteUser?id=<c:out value="${user.id}" />'
	  	onclick="return confirm('确定将此记录删除?')">删除</a>
	  </td>
    </tr>
    </c:forEach>
  </tbody>
</table>
<div class="glyphicon-plus"> <a href="${pageContext.request.contextPath}/addUser.jsp">新增用户</a></div>
</body>
</html>
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
<form class="form-horizontal" role="form" action="${pageContext.request.contextPath}/api/updateUser" method="post">
  <div class="form-group">
    <label for="firstname" class="col-sm-2 control-label">修改用户</label>
  </div>
  <div class="form-group">
    <label for="firstname" class="col-sm-2 control-label">昵称</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="nick" name="nick" placeholder="请输入昵称" value="${user.nick}">
    </div>
  </div>
  <div class="form-group">
    <label for="lastname" class="col-sm-2 control-label">手机</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="phone" name="phone" placeholder="请输入手机" value="${user.phone}">
    </div>
  </div>
  <div class="form-group">
    <label for="lastname" class="col-sm-2 control-label">邮箱</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="email" name="email" placeholder="请输入邮箱" value="${user.email}">
    </div>
  </div>
  <div class="form-group">
    <label for="lastname" class="col-sm-2 control-label">地址</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="address" name="address" placeholder="请输入地址" value="${user.address}">
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default">提交</button>
    </div>
  </div>
  <input type="hidden" id="id" name="id" value="${user.id}">
</form>
</body>
</html>
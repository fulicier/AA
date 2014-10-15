<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>书籍详细信息</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <div>书籍详细信息</div>
    <div class="item2">
    <br><br><br><br>
			<div>书名</div><h1> </h1><property value="book.title" />
			<div class="item2">
			<div>ISBN</div><h1> </h1><property value="book.isbn" />
			<div class="item2">
			<div>出版日期</div><h1> </h1><property value="book.publishdate" />
			<div class="item2">
			<div>价格</div><h1></h1> <property value="book.price" />
			<div class="item2">
			<div>作者</div><h1></h1> <property value="book.publisher" />
			<div class="item2">
			<div>作者年龄</div><h1> </h1><property value="author.age" />
			<div class="item2">
			<div>作者国籍</div><h1> </h1><property value="author.country" />
		</div><br><br><br>
		<a id="href" href="index">返回</a>
  </body>
</html>

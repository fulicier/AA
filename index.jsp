<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">
		<title>Book</title>
		<link rel="stylesheet" media="screen" href="styles.css">
	</head>
<body>
	<div class="ver">MVC编程与云平台部署</div>
	
		<div class="search">
			<div class="s-wrap">
				<form action="search">
				<br><br><br><br>
					<input type="submit" value="搜索作者" id="su" class="btn self-btn bg s_btn">
					<input type="text" class="s-t" name="name" class="s-t"
						maxlength="50" autocomplete="off"
						style="font-family: 'Microsoft Yahei', STHeiti;"> 
						<span class="btn_wr s_btn_wr bg" id="s_btn_wr">
						</span>
				</form>
			</div>
		</div>
		<div class="list-tabs">
		<br><br><br><br><br><br><br>
		<div>全部书籍</div><br>
		<iterator value="books" var="c">
				<div class="list">
					<div>书名</div><h1> </h1><div class="title">
						<a href="detial?isbn=<property value="#c.isbn"/>"><property value="#c.title" /></a>
					</div>
					<div class="opration">
						<a href="delete?isbn=<property value="#c.isbn"/>">删除</a>
					</div>
				</iterator>
		
</body>
</html>

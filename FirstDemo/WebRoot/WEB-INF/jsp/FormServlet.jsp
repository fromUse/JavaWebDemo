<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'FormSubmit.jsp' starting page</title>

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
	<p>通过Servlet</p>

	<form action="servlet/LoginServlet" method="POST">
		user : &nbsp;&nbsp;<input type="text" name="userName"><br>
		pwd : &nbsp;&nbsp;<input type="password" name="userPassword"><br>
		上课<input type="checkbox" name="interest" value="上课"/><br> 
		睡觉<input type="checkbox" name="interest" value="睡觉"/><br> 
		打豆豆<input type="checkbox" name="interest" value="打豆豆"/><br>
		撸码<input type="checkbox" name="interest"  value="撸码"/><br>
		<input type="submit" value="提交">
	</form>
</body>
</html>

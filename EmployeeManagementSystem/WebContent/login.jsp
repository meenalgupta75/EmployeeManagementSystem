<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>


<title>Employee Details Form</title>
<body>


<h2>Enter employee details</h2>
<form action="LoginServlet" method="Post">
Username :	<input type="text" name="userId"><br>
Password  :	<input type="password" name="password"><br>
<br>		<input type="submit" value="SUBMIT"/>
			<input type="reset" value="RESET">
Sign Up:	<a href= "employeeRegis.html"><input type="button" value="signup"></a>
</form>
</body>
</html>
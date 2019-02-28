<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Details Registration Form</title>
</head>
<body>
<h2>Enter employee details</h2>

<form action="EmployeeRegistrationServlet" method="POST">
Employee ID :	<input type="text" name="empID"><br><br>
First Name :	<input type="text" name="firstName"><br><br>
Last Name :	<input type="text" name="lastName"><br><br>
Salary :	<input type="text" name="salary"><br><br>
<br>		<input type="submit" name="SUBMIT" VALUE="REGISTER"/><input type="reset" name="RESET"/>
</form>
</body>
</html>
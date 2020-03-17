<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Please enter the Input problem(expression)
	<form action="/calculation/save" method="post">
		<input type="text" name="expression"> e.g. (3 * 5) + 10<br>
		<input type="submit" value="SUBMIT">
	</form>
</body>
</html>
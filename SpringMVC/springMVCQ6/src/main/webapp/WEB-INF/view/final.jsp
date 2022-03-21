<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Successful</title>
</head>
<body>
	<h1>Customer Details</h1>
	
	<h2>
		Customer Name: ${customer.username}<br>
		Customer Email:${customer.email}<br>
		Customer Contact: ${customer.contact}
	</h2>
</body>
</html>
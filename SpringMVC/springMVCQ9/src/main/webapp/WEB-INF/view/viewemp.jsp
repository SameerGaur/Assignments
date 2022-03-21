<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>viewemp</title>
</head>
<body>
	<h1>Employees List</h1>    
<table border="2" width="70%" cellpadding="2">    
<tr><th>Id</th><th>Name</th><th>Salary</th></tr>    
   <c:forEach var="emp" items="${msg}">     
<tr>    
<td>${emp.id}</td>    
<td>${emp.name}</td>    
<td>${emp.salary}</td>    
</tr>    
</c:forEach>    
   </table>    
   <br/>    
   <a href="/springMVCQ9/viewemp/1">1</a>     
   <a href="/springMVCQ9/viewemp/2">2</a>     
   <a href="/springMVCQ9/viewemp/3">3</a>    
	
</body>
</html>
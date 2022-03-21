<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
<h1>User Registration & Login</h1>
<form action="register" method="post">
	<pre>
	
		<strong>Register Here | <a href="login.jsp"> Click Here to Login</a></strong>
			Username: <input type="text" name="username"/>
			Password: <input type="text" name="password"/>
			Email: <input type="text" name="email"/>
		
			<input type="submit" value="Login"/>
	</pre>

</form>
${msg}

</body>
</html>
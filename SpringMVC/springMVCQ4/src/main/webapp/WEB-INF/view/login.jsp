<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration & Login</title>
</head>
<body>

<h1>User Registration & Login </h1>

<form action="login" method="post">
	<pre>
		<strong>Register here | <a href="registration.jsp"> Click Here to Register</a></strong>
		
			Username: <input type="text" name="username"/>
			Password: <input type="text" name="password"/>
			Email: <input type="text" name="email"/>
	
			<input type="submit" value="Login"/>
	</pre>
</form>
${msg}
</body>
</html>
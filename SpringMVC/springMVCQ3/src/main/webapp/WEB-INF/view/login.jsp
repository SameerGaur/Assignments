<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Login</title>
  </head>
  <body>
    <h1>Login</h1>
    
    <form action="login" method="post">
    	<div class="form-group">
	    	<label for="username">Username :</label>
	    	<input type="text" class="form-control" name="username"  >
	  	</div>
  
		  <div class="form-group">
		    <label for="password">Password :</label>
		    <input type="text" class="form-control" name="password"  >
		  </div>

    <button type="submit" class="btn btn-primary">Submit</button>
    
    </form>
     
      </body>
</html>
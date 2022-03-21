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

    <title>Simple Interest</title>
  </head>
  <body>
    <h1> Simple Interest</h1>
    
    <form action="simpleInterest" method="post">
    	<div class="form-group">
    <label for="Principal Amount">Principal Amount:</label>
    <input type="number" name="principal" class="form-control" id="exampleInputAmount" aria-describedby="Principal Amount" placeholder="Enter Principal Amount">
  </div>
  
  <div class="form-group">
    <label for="Time">Time:</label>
    <input type="number" name="time" class="form-control" id="exampleInputTime" aria-describedby="Time" placeholder="Enter Time">
  </div>
  
  <div class="form-group">
    <label for="Rate">Rate:</label>
    <input type="number" name="rate" class="form-control" id="exampleInputRate" aria-describedby="Rate" placeholder="Enter Rate">
  </div>
    
    
    <button type="submit" class="btn btn-primary">Submit</button>
    
    </form>
     
      </body>
</html>
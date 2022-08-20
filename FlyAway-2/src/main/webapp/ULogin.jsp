<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Login</title>
</head>
<body>

    
         
    <h2 align=center>Welcome to FlyAway</h2>
     <h3 align=center> User Login </h3>
     <table align=center>
     
     
     <form action="UserLogin" method="post">
     
	<table border=5 align=center>
        <tr>
        <td>User Name</td>
        <td><input name="name" type="text"></td>
        </tr>
        <tr>
        <td>Password</td>
        <td><input name="password" type="password"></td>
        </tr>
        <tr>
  
        <td><button type="submit" value="Submit">LogIn</button></td>
     </tr>
     </table>
     </form>
     </table>
</body>
</html>
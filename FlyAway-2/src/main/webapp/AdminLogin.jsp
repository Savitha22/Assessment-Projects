<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Login</title>
</head>
<body>


 <div>
    
    <h2 align=center> Welcome to FlyAway</h2>
     
     <h3 align=center>Admin  Login </h3>
     
     <form action="AdminLogin" method="post">
        <table align=center border=5>
       <tr>
        <td>Username </td>
        <td><input name="username" type="text"></td>
        </tr>
        <tr>
        <td>PassWord</td>
        <td> <input name="pass" type="password"></td>
        </tr>
        <tr>
  
        <td><button type="submit" value="Submit">LogIn</button></td>
        </tr>
     </table>
     </form>
     
    
    </div>

</body>
</html>
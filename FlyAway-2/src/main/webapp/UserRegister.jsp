<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration</title>
</head>
<body>

    
    <h2 align=center>Welcome to FlyAway</h2>
     <h3 align=center> User Registration </h3>
     <table align=center>
     
     <form action="UserRegistration" method="post" >

	<table border=5 align=center>
        <tr>
        <td> Name</td>
        <td><input name="name"  type="text" maxlenght=50> </td>
        </tr>
         <tr>
        <td> Email</td>
        <td><input name="email" type="text"  maxlength=100></td>
        </tr>
         <tr>
        <td> Password</td>
        <td><input name="password" type="password" maxlength="20"></td>
        </tr>
        <tr>
        <td><button type="submit" value="Submit">Sign Up</button></td>
        </tr>
      </table>
 
     </form>
   </table>
   

</body>
</html>
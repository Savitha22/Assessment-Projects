<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="com.flyaway.AdminLogin" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Password Change</title>
</head>
<body>


<div class="container">
        <h1 align=center>Password Change</h1>
            <%
            if (AdminLogin.isLoggedIn) {
            %>
                <form action="ChangePassword" method="post">
                   <table border=5 align=center>
                   
                        <td>New Password</td>
                        <td><input type="password" name="passwordEntered"  placeholder="Enter a new password"></td>
                        </tr>
                        
                    <tr>
                    <td><button type="submit">Change Password</button></td>
                    </tr>
                </form>
            <%
            }
            else {
                out.print("You must Login first");
            }
            %>

</body>
</html>
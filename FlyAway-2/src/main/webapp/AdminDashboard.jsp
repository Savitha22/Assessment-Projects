<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="java.sql.*"%>
<%@ page isELIgnored="false" %>
<%@page import="com.flyaway.AdminLogin"%>

<%
    String driverName = "com.mysql.jdbc.Driver";
    String connectionUrl = "jdbc:mysql://localhost:3306/";
    String dbName = "savitha";
    String userId = "root";
    String password = "Savitha2@";

    try {
        Class.forName(driverName);
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }

    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
%>  
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Dashboard</title>
</head>
<body>

<%
    if (AdminLogin.isLoggedIn) {
%>

<h2 align="center"><b>Admin Dashboard</b></h2>

<div class="row">
        
            <form action="${pageContext.request.contextPath}/PasswordChange.jsp">
            <h3 align=center>to change password click below</h3>
                <h4 align=center><button type="submit" >Change Password</button></h4>
            </form>

            <form  action="${pageContext.request.contextPath}/AdminLogin.jsp">
               <h2 align=center> <button type="submit" >Logout</button></h2>
            </form>
       
        <br>
</div>

            <table border=5 align=center>
                <thead>
                <tr>
                    <th scope="col">Flight ID</th>
                    <th scope="col">Name</th>
                    <th scope="col">Source</th>
                    <th scope="col">Destination</th>
                    <th scope="col">Date</th>
                    <th scope="col">Ticket Price</th>
                </tr>
                </thead>
                <tbody>
               
                <span><strong><h3 align=center>Flight Details </h3> </strong></span>
                <%
                    try{
                        connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
                        statement=connection.createStatement();
                        String sql ="SELECT * FROM flight";
                        resultSet = statement.executeQuery(sql);
                        while(resultSet.next()){
                %>
                <tr>
                    <td><%=resultSet.getString("Flight_id") %></td>
                    <td><%=resultSet.getString("Flight_name") %></td>
                    <td><%=resultSet.getString("Source") %></td>
                    <td><%=resultSet.getString("Destination") %></td>
                    <td><%=resultSet.getString("D_date") %></td>
                    <td><%=resultSet.getString("Ticket_price") %></td>
                </tr>
                
                
                <%
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    else {
                        out.print("You must Login first");
                    }
                %>
                </tbody>
            </table>
   



</body>
</html>
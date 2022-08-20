<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>    
<%@ page isELIgnored="false" %>
<%@ page import="com.model.Search" %>
<%
    String driverName = "com.mysql.jdbc.Driver";
    String connectionUrl = "jdbc:mysql://localhost:3306/";
    String dbName = "savitha";
    String userId = "root";
    String password = "Savitha2@";
    String query = Search.getQuery();
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
<title>Welcome to Flyaway Flights</title>
</head>
<body>


<div>
    <h2 align="center"><span><strong>Flights </strong></span></h2>
    <p align="center"><span><strong>
        You Searched flights from <%=Search.source%> to  <%=Search.destination%> <br>
        Date of travel : <%=Search.date%> (<%=Search.day%>)  <br>
        No of travelers :  <%=Search.persons%>  <br>
    </p>
    <table border=5 align=center>
        <thead>
        <tr>
            <th scope="col">Flight</th>
            <th scope="col">Source</th>
            <th scope="col">Destination</th>
            <th scope="col">Date</th>
            <th scope="col">Ticket Price(Rs)</th>
            <th scope="col">Select</th>
        </tr>
        </thead>
        <tbody>
        <br><p align="center"><span><strong>Select a flight</strong></span></p><br>
        <%
            try{
                connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
                statement=connection.createStatement();
                resultSet = statement.executeQuery(query);
                while(resultSet.next()){
        %>
        <tr bgcolor="#F5F5F5">
            <td><%=resultSet.getString("Flight_name") %></td>
            <td><%=resultSet.getString("Source") %></td>
            <td><%=resultSet.getString("Destination") %></td>
            <td><%=Search.date%></td>
            <td><%=resultSet.getString("Ticket_price") %></td>
            <td>
                <form action="${pageContext.request.contextPath}/BookFlight.jsp" method="post">
                    <input type="hidden" id="flight_name" name="flight_name" value="<%=resultSet.getString("Flight_name")%>">
                    <input type="hidden" id="ticket_price" name="ticket_price" value="<%=resultSet.getString("Ticket_price")%>">
                    <input type="hidden" id="flight_id" name="flight_id" value="<%=resultSet.getString("Flight_id")%>">
                    <input type="submit" class="btn btn-success" value="Book This Flight">
                </form>
            </td>
        </tr>
        <%
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        %>
        </tbody>
    </table>
</div>

</body>
</html>
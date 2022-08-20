<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ page import="com.model.Booking" %>

<%
    Booking.flight_booking_id = request.getParameter("flight_id");
    Booking.ticket_price = Integer.parseInt(request.getParameter("ticket_price"));
    Booking.flight_name = request.getParameter("flight_name");
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Booking Details</title>
</head>
<body>

<section >
        <section >
            <div class="row">
                <div class="col">
                    <h1 align="center" ><b>Booking Details</b></h1>
                    <p align="center"><span><strong>Enter Passenger Details</strong></span></p><br>
                </div>
            </div>
            <section >
                <form action="${pageContext.request.contextPath}/Payment.jsp" method="post" class="form-container">
                <table border=5 align=center>
       
                    <tr>
                        <td>Passenger Name</td>
                        <td><input type="text" name="pname" placeholder="Name of Passenger"></td>
                        </tr>
                    <tr>
                        <td>Email address</td>
                        <td><input type="email" name="email"  aria-describedby="emailHelp" placeholder="Enter email"></td>
                        </tr>
                  
                    <tr>
                        <td>Phone number</td>
                        <td><input type="number"  name="phone" placeholder="Enter phone number"></td>
                        </tr>    
                   
                    <tr>
                    <td align=center><button type="submit" value="Submit">Submit</button></td>
                    </tr>
                    </table>
                </form>
            </section>
        </section>
    </section>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.model.Booking" %>
<%@ page isELIgnored="false" %>
<%@ page import="com.model.Search" %>

<%
    Booking.passenger_name = request.getParameter("pname");
    Booking.passenger_email= request.getParameter("email");
    Booking.passenger_phone= request.getParameter("phone");

    if (Booking.passenger_name.equals("")
            || Booking.passenger_email.equals("")
            || Booking.passenger_phone.equals("")) {
        out.println("Please enter valid passenger details");
    }
    else {
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Payment Details</title>
</head>
<body>

    <section >
        <section >
            <div class="row">
                <div class="col">
                    <h1 align="center" ><b>Checkout</b></h1>
                    <p align="center" ><span><strong>Enter Payment Details</strong></span></p><br>
                </div>
            </div>
           <section>
               <form action="${pageContext.request.contextPath}/ThankYou.jsp" method="post" class="form-container">
               <table align=center border=5>
                       <tr>
                       <td>UPI Id</td>
                       <td><input type="text" name="name_on_card" placeholder="Enter UPI Id"></td>
                       </tr>
             			<tr>
                       <td>Mobile Number</td>
                       <td><input type="number" name="card_details" placeholder="Enter Mobile Number"></td>
                       </tr>
                        </table>
                   
                  
                   <p align="center"><span><strong>Total Amount<br> <%=Booking.ticket_price%> X <%=Search.persons%> persons = Rs.<%=Booking.ticket_price*Search.persons%></strong></span></p>
                  <center><button type="submit" value="Submit">Pay Through UPI</button></center>
                  
               </form>
          </section>
        </section>
    </section>
  

</body>
</html>
<%
    }
%>

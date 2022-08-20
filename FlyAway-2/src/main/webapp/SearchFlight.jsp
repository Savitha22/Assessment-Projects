<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Flight</title>
</head>
<body>

            
       <h1 align=center> Welcome to FlyAway </h1>
        <h3 align=center> Ticket Booking</h3>


   <form action="SearchFlight" method="post">
   <table align=center border=5>
         
          <tr>
          <td>Date</td>
          <td> <input type="date"   id="date" name="date" placeholder="yyyy-mm-dd.."></td>
          </tr>

        
		<tr>
          	<td>Source</td>
                    <td><select  id="source" name="source">
                        <option value="India">India</option>
                        
                        <option value="Chennai">Chennai</option>
                        <option value="China">China</option>
                        <option value="Australia">Australia</option>
                        <option value="Dubai">Dubai</option>
                        <option value="Russia">Russia</option>
                        <option value="Thailand">Thialand</option>
                        <option value="Singapore">Singapore</option>
                        <option value="Ukraine">Ukraine</option>
                        <option value="Iran">Iran</option>
                        <option value="Israel">Israel</option>
                        <option value="USA">USA</option>
                        <option value="UK">UK</option>
                    </select></td>
                    
                    </tr>
  
         <tr>
         <td>Destination</td>
                   <td> <select  id="destination" name="destination">
                        <option value="USA">USA</option>
                        <option value="UK">UK</option>
                        <option value="India">India</option>
                        <option value="Armenia">Armenia</option>
                        <option value="Pakistan">Pakistan</option>
                        <option value="Australia">Australia</option>
                        <option value="Dubai">Dubai</option>
                        <option value="Ukraine">Ukraine</option>
                        <option value="Singapore">Singapore</option>
                        <option value="Israel">Israel</option>
                         <option value="Pune">Pune</option>
                        
                    </select></td>
                    </tr>
          <tr>
          <td>No of Persons</td>
                   <td> <select id="persons" name="persons">
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                        
                        <option value="6">6</option>
                    </select></td>
                    </tr>
        
     <tr>
        <td> <button type="submit"  value="Submit">Search Flights</button><td>
    </td>
    </tr>
    </table>
    
    </form>

</body>
</html>
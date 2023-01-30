<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h2>Available Cab Driver List</h2>
<table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">Driver ID</th>
      <th scope="col">Address</th>
      <th scope="col">Email</th>
      <th scope="col">Mobile</th>
       <th scope="col">Password</th>
        <th scope="col">UserName</th>
        
    </tr>
  </thead>
		
			<tbody>
			<c:forEach items="${allavail}" var="driver">
				<tr>
					<td><c:out value="${driver.driverId}"/></td>
					<td><c:out value="${driver.address}"/></td>
					<td><c:out value="${driver.email}"/></td>
					<td><c:out value="${driver.mobile}"/></td>
					<td><c:out value="${driver.password}"/></td>
					<td><c:out value="${driver.userName}"/></td>
					
				</tr>
				</c:forEach>
			</tbody>
			
	</table>
	<br><br>
	<div>
	<button><a href="bookRide">Book Ride</a></button>
	</div>
	
</body>
</html>


<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

h2,a{
text-align: center;
}

div{
text-align: center;
margin: auto;

}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
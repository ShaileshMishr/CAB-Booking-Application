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
 <h2>Trip List</h2>
<table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">Trip Booking ID</th>
      <th scope="col">Customer ID</th>
      <th scope="col">Destination</th>
      <th scope="col">Distance</th>
       <th scope="col">From Date</th>
        <th scope="col">Starting Location</th>
         <th scope="col">To Date</th>
         <th scope="col">Action</th>
          <th scope="col">Action</th>
         
    </tr>
  </thead>
		
			<tbody>
			<c:forEach items="${allTrips}" var="tripdetails">
				<tr>
					<td><c:out value="${tripdetails.tripBookingId}"/></td>
					<td><c:out value="${tripdetails.customerId}"/></td>
					<td><c:out value="${tripdetails.startingLocation}"/></td>
					<td><c:out value="${tripdetails.destination}"/></td>
					<td><c:out value="${tripdetails.distanceInKM}"/></td>
					<td><c:out value="${tripdetails.fromDate}"/></td>
				
					<td><c:out value="${tripdetails.toDate}"/></td>
					<td><a href="updatetrip/${tripDetails.getTripBookingId()}/${tripDetails.getStartingLocation}/${tripDetails.getDestination()}/${tripDetails.getDistanceInKM}/${tripDetails.getFromDate}/${tripDetails.getToDate}">Update</a></td>
					<td><a href="deletetrip/${tripdetails.getTripBookingId()}">Delete</a></td>
				</tr>
				</c:forEach>
			</tbody>
	</table>
</body>
</html>


<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

h2{
text-align: center;
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
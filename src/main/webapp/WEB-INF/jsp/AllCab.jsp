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
 <h2>CAB List</h2>
<table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">CAB ID</th>
      <th scope="col">Car Type</th>
      <th scope="col">Per Km Rate</th>
         <th scope="col">Action</th>
         <th scope="col">Action</th>
    </tr>
  </thead>
		
			<tbody>
			<c:forEach items="${allCabs}" var="cab">
				<tr>
					<td><c:out value="${cab.cabId}"/></td>
					<td><c:out value="${cab.carType}"/></td>
					<td><c:out value="${cab.perKmRate}"/></td>
					
					<td><a href="deletecablist/${cab.getCabId()}">Delete</a></td>
					<td><a href="update/${cab.cabId()}/${cab.carType()}/${cab.perKmRate()}">Update</a></td>
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
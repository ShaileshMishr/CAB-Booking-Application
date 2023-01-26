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
      <th scope="col">Customer ID</th>
      <th scope="col">Address</th>
      <th scope="col">Email</th>
      <th scope="col">Mobile</th>
       <th scope="col">Password</th>
        <th scope="col">UserName</th>
         <th scope="col">Action</th>
    </tr>
  </thead>
		
			<tbody>
			<c:forEach items="${allCustomers}" var="customer">
				<tr>
					<td><c:out value="${customer.customerId}"/></td>
					<td><c:out value="${customer.address}"/></td>
					<td><c:out value="${customer.email}"/></td>
					<td><c:out value="${customer.mobile}"/></td>
					<td><c:out value="${customer.password}"/></td>
					<td><c:out value="${customer.userName}"/></td>
					<td><a href="#">Delete</a></td>
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
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h2>Customer List</h2>
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
					<td>${customer.getCustomerId}</td>
					<td>${customer.getAddress}</td>
					<td>${customer.getEmail}</td>
					<td>${customer.getMobile}</td>
					<td>${customer.getPassword}</td>
					<td>${customer.getUserName}</td>
					<td><a href="#">Delete</a></td>
				</tr>
				</c:forEach>
			</tbody>
	</table>
</body>
</html>
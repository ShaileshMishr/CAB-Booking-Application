<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<!DOCTYPE html>
<html>
<head>
	<title>Customer Update</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	 <style><%@include file="loginstyle.css"%></style>
</head>
<body>
	<div class="cont">
		<div class="form sign-in">
			
			<h2>Customer Update Form</h2><br>
			
			<form id="signupform" action="<%=request.getContextPath()%>/updateCustomer" method="post">
				<label style="color:red;">
					<span >Customer ID</span>
					<input type="text" value="${customerId}" name="cid" readonly>
				</label>
				<label>
					<span>Customer Name</span>
					<input type="text" value="${name}" name="name" required>
				</label>
				<label>
					<span>Email</span>
					<input type="email" value="${email}" name="email" required>
				</label>
				<label>
					<span>Password</span>
					<input type="password" value="${pass}" name="pass" required>
				</label>
				<label>
					<span>Mobile</span>
					<input type="text" name="mob" value="${mob}" required>
				</label>
				<label>
					<span>Address</span>
					<input type="text" name="add" value="${add}" required>
				</label>
				<button type="submit" class="submit">Update Now</button>
			</form>
		
		</div>
		 <div class="sub-cont">
			<div class="img">
			
				
			</div>
		</div> 
		
		<h3 style="color:red">${updateMsg}</h3>
	</div>

</body>
</html>
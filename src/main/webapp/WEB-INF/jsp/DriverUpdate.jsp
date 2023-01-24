<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
	<title>Driver Update</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	 <style><%@include file="loginstyle.css"%></style>
</head>
<body>
	<div class="cont">
		<div class="form sign-in">
			
			<h2>Driver Update Form</h2><br>
			
		
		</div>
		<div class="sub-cont">
			<div class="img">
			
			</div>
			<div class="form sign-up">
				<h2>Update</h2><br>
				
				<form id="signupform" action="updatedriver" method="post">
				<label>
					<span>Driver ID</span>
					<input type="text" value="${driverId}" name="id" readonly>
				</label>
				<label>
					<span>Driver Name</span>
					<input type="text" value="${dname}" name="name" required>
				</label>
				<label>
					<span>Email</span>
					<input type="email" value="${demail}" name="email" required>
				</label>
				<label>
					<span>Password</span>
					<input type="password" value="${dpass}" name="pass" required>
				</label>
				<label>
					<span>Mobile</span>
					<input type="text" name="mob" value="${dmob}" required>
				</label>
				<label>
					<span>Address</span>
					<input type="text" name="add" value="${dadd}" required>
				</label>
				<button type="submit" class="submit">Update Now</button>
			</form>
				<h3>${updateMsg}</h3>
			</div>
		</div>
	</div>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
	<title>Ride Booking Form</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	 <style><%@include file="loginstyle.css"%></style>
</head>
<body>
	<div class="cont">
		<div class="form sign-in">
			
			<h2>Ride Booking Form</h2><br>
			
			<form id="signupform" action="addTrip" method="post">
				
			<label>
				
					<span >Customer ID</span>
					<input type="text" value="${customerId}" name="customerId">
				</label> 
				
				<label>
				
					<span >Starting Location</span>
					<input type="text" name="sloc">
				</label>
				<label>
					<span>Destination</span>
					<input type="text" name="destination" required>
				</label>
				<label>
					<span>Mobile</span>
					<input type="text" name="mobile" required>
				</label>
				<label>
					<span>From Date</span>
					<input type="text" name="fromdate" required>
				</label>
				<label>
					<span>To Date</span>
					<input type="text" name="todate"  required>
				</label>
				
				<button type="submit" class="submit">Book Now</button>
			</form>
		
		</div>
		 <div class="sub-cont">
			<div class="img">
			
				
			</div>
		</div> 
		
		<h3 style="color:red">${ride}</h3>
	</div>

</body>
</html>
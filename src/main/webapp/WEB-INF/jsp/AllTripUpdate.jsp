<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<!DOCTYPE html>
<html>
<head>
	<title>Trip Update</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	 <style><%@include file="loginstyle.css"%></style>
</head>
<body>
	<div class="cont">
		<div class="form sign-in">
			
			<h2>Trip Update Form</h2><br>
			
				
				<form id="signupform" action="<%=request.getContextPath()%>/updateTripNow/${customerId}/${tripBookingId}" method="get">
				<label>
					<span>Trip Booking ID</span>
					<input type="text" value="${tripBookingId}" name="tripBookingId" readonly>
				</label>
				<label>
					<span>Customer ID</span>
					<input type="text" value="${customerId}" name="customerId" readonly>
				</label>
				<label>
					<span>Starting Location</span>
					<input type="text" name="startingLocation" value="${startingLocation}" required>
				</label>
				<label>
					<span>Destination</span>
					<input type="text" value="${destination}" name="destination" required>
				</label>
				<label>
					<span>Distance</span>
					<input type="text" value="${distanceInKM}" name="distanceInKM" required>
				</label>
				<label>
					<span>From Date</span>
					<input type="date" name="fromDate" value="${fromDate}" required>
				</label>
				
				<label>
					<span>TO Date</span>
					<input type="date" name="toDate" value="${toDate}" required>
				</label>
				<button type="submit" class="submit">Update Now</button>
			</form>
					<h3>${updateMsg}</h3>
			</div>
			 <div class="sub-cont">
			<div class="img">
			
				
			</div>
		</div> 
		</div>

</body>
</html>
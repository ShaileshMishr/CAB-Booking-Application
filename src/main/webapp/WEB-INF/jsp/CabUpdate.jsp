<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
	<title>CAB Update</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	 <style><%@include file="loginstyle.css"%></style>
</head>
<body>
	<div class="cont">
		<div class="form sign-in">
			
			<h2>Cab Update Form</h2><br>
			
				
				<form id="signupform" action="updatecab" method="post">
				<label>
					<span>Cab ID</span>
					<input type="text" value="${cabId}" name="cabid" readonly>
				</label>
				<label>
					<span>Car Type</span>
					<input type="text" value="${carType}" name="carType" required>
				</label>
				<label>
					<span>Rate</span>
					<input type="text" value="${perKmRate}" name="perKmRate" required>
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
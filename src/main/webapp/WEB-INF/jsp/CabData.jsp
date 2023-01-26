<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
	<title>CAB Data</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	 <style><%@include file="loginstyle.css"%></style>
</head>
<body>
	<div class="cont">
		<div class="form sign-in">
			
			<h2>CAB Data Form</h2><br>
			
			<form id="signupform" action="addtocab" method="post">
				<label>
					<span >Cab Type</span>
					<input type="text" name="type" >
				</label>
				
				<label>
					<span >Cab Rate</span>
					<input type="text" name="rate" >
				</label>
				
				<button type="submit" class="submit">Insert CAB</button>
			</form>
		
		</div>
		 <div class="sub-cont">
			<div class="img">
			
				
			</div>
		</div> 
		
		<h3 style="color:red">${userText}</h3>
	</div>

</body>
</html>
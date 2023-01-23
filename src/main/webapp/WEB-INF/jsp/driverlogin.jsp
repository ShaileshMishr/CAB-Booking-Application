<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
	<title>Login</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<style><%@include file="loginstyle.css"%></style>
</head>
<body>
	<div class="cont">
		<div class="form sign-in">
			
			<h2>Driver Sign In</h2><br>
			
			<div>
				<a href="login" style=" text-decoration: none; color: red;"><span>Customer</span></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="driver" style=" text-decoration: none; color: red;"><span >Driver</span></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="admin" style=" text-decoration: none; color: red;"><span >Admin</span></a>
				
			
			</div>
			
			<form id="signinform" action = "driverLogin" method = "post" >
			<label>
				<span>User Name</span>
				<input type="text" name="dname" autocomplete="on" required />
			</label>
			<label>
				<span>Password</span>
				<input type="password" name="dpwd" required>
			</label>
			<button type="submit" class="submit">Submit</button>
			<a href="home"><p class="forgot-pass">Go To Home Page</p></a>
		</form>
			
		</div>
		<div class="sub-cont">
			<div class="img">
				<div class="img-text m-up">
					<h2>New here?</h2>
					<p>Sign up and have your racing performance evaluated!</p>
				</div>
				<div class="img-text m-in">
					<h2>Already a member?</h2>
					<p>If you already have an account, just sign in!</p>
				</div>
				<div class="img-btn">
					<span class="m-up">Sign Up</span>
					<span class="m-in">Sign In</span>
				</div>
			</div>
			<div class="form sign-up">
				<h2>Sign Up</h2>
				<form id="signupform">
				<label>
					<span>Name</span>
					<input type="text" required>
				</label>
				<label>
					<span>Email</span>
					<input type="email" name="email" required>
				</label>
				<label>
					<span>Password</span>
					<input type="password" required>
				</label>
				<label>
					<span>Confirm Password</span>
					<input type="password" required>
				</label>
				<button type="submit" class="submit">Sign Up Now</button>
			</form>
			</div>
		</div>
	</div>
<script type="text/javascript" src="script.js"></script>
</body>
</html>
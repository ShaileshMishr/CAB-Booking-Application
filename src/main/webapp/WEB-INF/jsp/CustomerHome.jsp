<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 
</head>
  
<body>
	 
	<div class="topnav">
	 <a class="active" href="home">Home</a>
  <a href="getCustomer">Profile</a>
 <%--  <a href="update/${customer.getCustomerId()}/${customer.getUserName()}/${customer.getEmail()}/${customer.getPassword()}/${customer.getMobile()}/${customer.getAddress()}">Update</a> --%>
  <a href="updateCustomer">Update</a>
    <a href="bookRide">Book Ride</a>
     <a href="avail">Avail Cabs</a>
     <a href="getTrip">Trips</a>
  <a href="deletecustomer/${customer.getCustomerId()}">Delete</a> 	
		 
		<b><p style="text-align: right;">Welcome ${name}</p></b>
		
</div>
<h1 style="text-align: center;">Customer Page</h1>
  
  <div class="container">
    <div class="row gy-4">
        <div class="col-sm" style="text-align: center;">
            <div class="card h-100">
                <img src="https://i.ibb.co/TLxMHWw/min.jpg" class="card-img-top" alt="...">
                <div class="card-body">
                    <h3 class="card-title fw-bold">Mini</h3>
                    <h3>price: 15Rs/km /-</h3>
                <a href="bookRide"><button type="button" class="btn btn-success">Book Ride</button></a>
                  
                </div>
            </div>
          
        </div>
        <div class="col-sm" style="text-align: center;">
            <div class="card h-100">
                <img src="https://i.ibb.co/svZsqNB/image1.png" class="card-img-top" alt="...">
                <div class="card-body">
                    <h3 class="card-title fw-bold">Sedan</h3>
                     <h3>price: 20Rs/km /-</h3>
               <a href="bookRide"><button type="button" class="btn btn-success">Book Ride</button></a>
                </div>
            </div>
        </div>
        <div class="col-sm" style="text-align: center;">
            <div class="card h-100">
                <img src="https://i.ibb.co/4fHYKCq/su.jpg" class="card-img-top" alt="...">
                <div class="card-body">
                    <h3 class="card-title fw-bold">SUV</h3>
                     <h3>price: 25Rs/km /-</h3>
 			<a href="bookRide"><button type="button" class="btn btn-success">Book Ride</button></a>                </div>
            </div>
        </div>
    </div>
</div>

	
	

</body>
</html>

<style>
* {
	box-sizing: border-box;
}

.card{
    box-shadow: 0 0 5px 0 rgba(22, 22, 26, .25);
}
.col-sm{
    margin-bottom: 1em;
}
.card{
  height: 100%; 
}

/* Style the navbar */
.topnav {
	overflow: hidden;
	background-color: #e9e9e9;
}

/* Navbar links */
.topnav a {
	float: left;
	display: block;
	color: black;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
	font-size: 17px;
}

/* Navbar links on mouse-over */
.topnav a:hover {
	background-color: #ddd;
	color: black;
}

/* Active/current link */
.topnav a.active {
	background-color: #2196F3;
	color: white;
}

/* Style the input container */
.topnav .login-container {
	float: right;
}

/* Style the input field inside the navbar */
.topnav input[type=text] {
	padding: 6px;
	margin-top: 8px;
	font-size: 17px;
	border: none;
	width: 150px;
	/* adjust as needed (as long as it doesn't break the topnav) */
}

/* Style the button inside the input container */
.topnav .login-container button {
	float: right;
	padding: 6px;
	margin-top: 8px;
	margin-right: 16px;
	background: #ddd;
	font-size: 17px;
	border: none;
	cursor: pointer;
}

.topnav .login-container button:hover {
	background: #ccc;
}

/* Add responsiveness - On small screens, display the navbar vertically instead of horizontally */
@media screen and (max-width: 600px) {
	.topnav .login-container {
		float: none;
	}
	.topnav a, .topnav input[type=text], .topnav .login-container button {
		float: none;
		display: block;
		text-align: left;
		width: 100%;
		margin: 0;
		padding: 14px;
	}
	.topnav input[type=text] {
		border: 1px solid #ccc;
	}
}
 
</style>
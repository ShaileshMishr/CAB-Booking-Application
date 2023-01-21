<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
     <!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
}

.flip-card {
	
  background-color: transparent;
  width: 700px;
  height: 1500px;
  perspective: 1000px;
border-radius: 8px;
  box-shadow: 1px 2px 8px rgba(0, 0, 0, 0.65);
  
  margin: 6rem auto 8.1rem auto;
}

.flip-card-inner {
  position: relative;
  width: 100%;
  height: 100%;
  text-align: center;
  transition: transform 0.6s;
  transform-style: preserve-3d;
  box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);
}

.flip-card:hover .flip-card-inner {
  transform: rotateY(180deg);
}

.flip-card-front, .flip-card-back {
  position: absolute;
  width: 100%;
  height: 100%;
  -webkit-backface-visibility: hidden;
  backface-visibility: hidden;
}

.flip-card-front {
  background-color: #bbb;
   background:  -webkit-linear-gradient(bottom, #2dbd6e, #a6f77b);
  color: black;
}

.flip-card-back {
   background:  -webkit-linear-gradient(bottom, #2dbd6e, #a6f77b);
  color: white;
  transform: rotateY(180deg);
}
}
.form-content {
  background: #fbfbfb;
  border: none;
  outline: none;
  padding-top: 14px;
}
</style>
</head>
<body>

 <div class="back" >

<div class="flip-card">
  <div class="flip-card-inner">
    <div class="flip-card-front">
      <img src="https://e0.pxfuel.com/wallpapers/850/829/desktop-wallpaper-e-commerce-web-designing-development-company-e-commerce.jpg"
      alt="Avatar" style="width:100%;height:100%;">
    </div>
    <div class="flip-card-back">
    <div id="card">
    <div id="card-content">
      <div id="card-title">
      <h1>${uid}</h1>
		
        <h2>Your Cart Item</h2>
        <div class="underline-title"></div>
      </div>
      <table border="3" style="text-align:center; margin:auto;" >
		<tr>
			<th class="form-content">User_ID</th>
			<th class="form-content">Prod_ID</th>
			
			<th class="form-content">Prod_Name</th>
			<th class="form-content">Prod_Desc</th>
			<th class="form-content">Price</th>
			<th class="form-content" >Product Image</th>
			
			<c:forEach items="${cartss}" var="cart">
				<tr class="form-content">
					<td class="form-content">${cart.getUser_id()}</td>
					<td class="form-content">${cart.getProd_id()}</td>
					<td class="form-content">${cart.getProd_name()}</td>
					<td class="form-content">${cart.getProd_desc()}</td>
					<td class="form-content">${cart.getPrice()}</td>
					<td  class="form-content"><img src="${cart.getImage()}" style="width:104px;height:142px;"></td>
					
				</tr>

			</c:forEach>

	</table>
	
	<div id="card-title">
	<!--  <h1><a href = "product">All Product</a></h1> -->
	 <h2><a href = "home">Home Page</a></h2>
     
    </div>
    </div>
  </div>
</div>


</div>
</body>
</html>


<!-- 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Your Cart Item:</h1>
	
	<table border="1">
		<tr>
			<th>User_ID</th>
			<th>Prod_ID</th>
			<th>Prod_Name</th>
			<th>Prod_Desc</th>
			<th>Price</th>
						
			<c:forEach items="${cartss}" var="cart">
				<tr>
					<td>${cart.getUser_id()}</td>
					<td>${cart.getProd_id()}</td>
					<td>${cart.getProd_name()}</td>
					<td>${cart.getProd_desc()}</td>
					<td>${cart.getPrice()}</td>
					
					
				</tr>

			</c:forEach>

	</table>
	<h3 style="color:red">${cartMsg}</h3>
	

</body>
</html>

 -->
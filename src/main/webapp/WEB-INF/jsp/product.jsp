<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Welcome ${name}!</h1>
<h1>  ${userId}!</h1>

	<h1>Product List:</h1>
	
	<table border="3">
		<tr>
			<th>Prod_ID</th>
			<th>Prod_Name</th>
			<th>Prod_Desc</th>
			<th>Price</th>
			<th>Action</th>
			
			<c:forEach items="${allProducts}" var="product">
				<tr>
					<td>${product.getProdId()}</td>
					<td>${product.getProdName()}</td>
					<td>${product.getProdDesc()}</td>
					<td>${product.getPrice()}</td>
					<td><a href = "addtocart/${product.getProdId()}/${product.getProdName()}/${product.getProdDesc()}/${product.getPrice()}/${userId}">ADD To Cart</a>&nbsp
						
						</td>
					
				</tr>

			</c:forEach>

	</table>
	
	<a href = "processCart">Display Cart</a><br/><br/>
	<h3 style="color:red">${cartMsg}</h3>
	

</body>
</html>
 -->
 
       <!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
}


#card-title {
  font-family: "Raleway Thin", sans-serif;
  letter-spacing: 4px;
  padding-bottom: 23px;
  padding-top: 13px;
  text-align: center;
}

.flip-card {
	
  background-color: transparent;
  width: 700px;
  height: 1600px;
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
      <img src="https://neilpatel.com/wp-content/uploads/2015/04/image12.jpg"
      alt="Avatar" style="width:100%;height:100%;">
    </div>
    <div class="flip-card-back">
    <div id="card">
    <div id="card-content">
      <div id="card-title">
      <h1> Welcome ${name}!</h1>
      <!-- <h1>  ${userId}!</h1>  -->
		
        <h2>Product List</h2>
        <div class="underline-title"></div>
      </div>
      <table border="3" style="text-align:center; margin:auto;" >
		<tr>
			<th class="form-content">Prod_ID</th>
			
			<th class="form-content">Prod_Name</th>
			<th class="form-content">Prod_Desc</th>
			<th class="form-content">Price</th>
			<th class="form-content" >Product Image</th>
			<th class="form-content" >Action</th>
			
			<c:forEach items="${allProducts}" var="product">
				<tr class="form-content">
					<td class="form-content">${product.getProdId()}</td>
					
					<td class="form-content">${product.getProdName()}</td>
					<td class="form-content">${product.getProdDesc()}</td>
					<td class="form-content">${product.getPrice()}</td>
					<td><img src="${product.getImage()}" style="width:104px;height:142px;"></td>
					<td class="form-content"><a href = "addtocart/${product.getProdId()}/${product.getProdName()}/${product.getProdDesc()}/${product.getPrice()}/${userId}">ADD To Cart</a>&nbsp
						
						</td>
					
				</tr>

			</c:forEach>

	</table>
	
	<div id="card-title">
	<h1><a href = "processCart">Display Cart</a></h1>
	 <h2><a href = "home">Home Page</a></h2>
	<h1 style="color:red">${cartMsg}</h1>
      
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
  <meta charset="utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  <title>E-Commerce</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
</head>

<body>
  <div id="card">
    <div id="card-content">
      <div id="card-title">
      <h1> Welcome ${name}!</h1>
      <h1>  ${userId}!</h1> 
		
        <h2>Product List</h2>
        <div class="underline-title"></div>
      </div>
     
       <table border="3" style="text-align:center; margin:auto; background-color:" >
		<tr>
			<th class="form-content">Prod_ID</th>
			
			<th class="form-content">Prod_Name</th>
			<th class="form-content">Prod_Desc</th>
			<th class="form-content">Price</th>
			<th class="form-content" >Action</th>
			
			<c:forEach items="${allProducts}" var="product">
				<tr class="form-content">
					<td class="form-content">${product.getProdId()}</td>
					
					<td class="form-content">${product.getProdName()}</td>
					<td class="form-content">${product.getProdDesc()}</td>
					<td class="form-content">${product.getPrice()}</td>
					<td class="form-content"><a href = "addtocart/${product.getProdId()}/${product.getProdName()}/${product.getProdDesc()}/${product.getPrice()}/${userId}">ADD To Cart</a>&nbsp
						
						</td>
					
				</tr>

			</c:forEach>

	</table>
	
	<div id="card-title">
	<h1><a href = "processCart">Display Cart</a></h1>
	<h1 style="color:red">${cartMsg}</h1>
      
    </div>
  </div>
</body>

</html>

<style>

a {
  text-decoration: none;
}
body {
  background: -webkit-linear-gradient(bottom, #2dbd6e, #a6f77b);
  background-repeat: no-repeat;
}
label {
  font-family: "Raleway", sans-serif;
  font-size: 11pt;
}

#card {
  background: #fbfbfb;
  border-radius: 8px;
  box-shadow: 1px 2px 8px rgba(0, 0, 0, 0.65);
  height: 670px;
  margin: 6rem auto 8.1rem auto;
  width: 600px;
}
#card-content {
  padding: 12px 44px;
}
#card-title {
  font-family: "Raleway Thin", sans-serif;
  letter-spacing: 4px;
  padding-bottom: 23px;
  padding-top: 13px;
  text-align: center;
}
#signup {
  color: #2dbd6e;
  font-family: "Raleway", sans-serif;
  font-size: 10pt;
  margin-top: 16px;
  text-align: center;
}

.form {
  align-items: left;
  display: flex;
  flex-direction: column;
}
.form-border {
  background: -webkit-linear-gradient(right, #a6f77b, #2ec06f);
  height: 1px;
  width: 100%;
}
.form-content {
  background: #fbfbfb;
  border: none;
  outline: none;
  padding-top: 14px;
}
.underline-title {
  background: -webkit-linear-gradient(right, #a6f77b, #2ec06f);
  height: 2px;
  margin: -1.1rem auto 0 auto;
  width: 89px;
}

</style>
      
       -->
 
 


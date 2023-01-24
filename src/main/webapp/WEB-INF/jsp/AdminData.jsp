<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<html lang="en">
<head>
  <title>Admin Data</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.1/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
 <%--   <style><%@include file="loginstyle.css"%></style> --%>
</head>
<body>
 
<div class="container">
  <h2>Admin Data</h2>
  <div class="card" style="width:400px; text-align: center;margin: auto">
    <img class="card-img-top" src="https://www.w3schools.com/bootstrap4/img_avatar3.png" alt="Card image" style="width:100%">
    <div class="card-body">
      <h3 class="card-title">${aname}</h3>
      <p class="card-text"><b>Admin ID:</b> ${aId}</p>
      <p class="card-text"><b>Admin Name:</b> ${aname}</p>
      <p class="card-text"><b>Admin Email:</b> ${aemail}</p>
      <p class="card-text"><b>Admin Mobile:</b> ${amob}</p>
      <p class="card-text"><b>Admin Address:</b> ${aaddr}</p>
      
      <div>
      <a href="deleteadmin" class="btn btn-danger">Delete Account</a> 
      
       <a href="updateadmin" class="btn btn-success">Update Account</a> 
      
      </div>
     
    </div>
  </div>
  
</div>

</body>
</html>


<style>

*{
background-image: url(https://i.pinimg.com/originals/e7/23/54/e723540dd0c92db5c1e13377f7900b5d.jpg);
background-size: cover;
background-repeat: no-repeat;

}
h3,h2,p{
color: white;
}

h2{
text-align: center;
}


</style>

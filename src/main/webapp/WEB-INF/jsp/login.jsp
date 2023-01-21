<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  


  <!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>E-Commerce</title>
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
}

#card-content {
  padding: 12px 44px;
}



#submit-btn {
  background: -webkit-linear-gradient(right, #a6f77b, #2dbd6e);
  border: none;
  border-radius: 21px;
  box-shadow: 0px 1px 8px #24c64f;
  cursor: pointer;
  color: white;
  font-family: "Raleway SemiBold", sans-serif;
  height: 42.3px;
  margin: 0 auto;
  margin-top: 50px;
  transition: 0.25s;
  width: 155px;
  font-size: 25px;
}
#submit-btn:hover {
  box-shadow: 0px 1px 18px #24c64f;
}

.flip-card {
	
  background-color: transparent;
  width: 500px;
  height: 500px;
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
  border: 20px;
  outline: none;
  padding-top: 20px;
  font-size: 18px;
  width:50%;
  margin:auto;
  text-align: center;
}
</style>
</head>
<body>

 <div class="back" >

<div class="flip-card">
  <div class="flip-card-inner">
    <div class="flip-card-front">
      <img src="https://img.freepik.com/free-vector/login-page-template-glass-style_1017-31854.jpg?w=2000"
      alt="Avatar" style="width:100%;height:100%;">
    </div>
    <div class="flip-card-back">
    <div id="card">
    <div id="card-content">
      <div id="card-title">
        <h2>LOGIN PAGE</h2>
        
      </div>
        <div class="underline-title"></div>
      </div>
      <form action = "processLogin" method = "post" class="form">
        <label for="user-email" style="padding-top:18px; font-size: 25px;">
            &nbsp;User Name
          </label><br>
        <input id="user-email" class="form-content" type="text" name="uname" autocomplete="on" required />
        <div class="form-border"></div>
        <label for="user-password" style="padding-top:30px; font-size: 25px;">&nbsp;Password
          </label><br>
        <input id="user-password" class="form-content" type="password" name="pwd" required />
        <div class="form-border"></div>
       
        <input id="submit-btn" type="submit" name="submit" value="LOGIN" />
       
      </form>
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
        <h2>LOGIN</h2>
        <div class="underline-title"></div>
      </div>
      <form action = "processLogin" method = "post" class="form">
        <label for="user-email" style="padding-top:13px">
            &nbsp;User Name
          </label>
        <input id="user-email" class="form-content" type="text" name="uname" autocomplete="on" required />
        <div class="form-border"></div>
        <label for="user-password" style="padding-top:22px">&nbsp;Password
          </label>
        <input id="user-password" class="form-content" type="password" name="pwd" required />
        <div class="form-border"></div>
       
        <input id="submit-btn" type="submit" name="submit" value="LOGIN" />
       
      </form>
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
  height: 410px;
  margin: 6rem auto 8.1rem auto;
  width: 329px;
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

#submit-btn {
  background: -webkit-linear-gradient(right, #a6f77b, #2dbd6e);
  border: none;
  border-radius: 21px;
  box-shadow: 0px 1px 8px #24c64f;
  cursor: pointer;
  color: white;
  font-family: "Raleway SemiBold", sans-serif;
  height: 42.3px;
  margin: 0 auto;
  margin-top: 50px;
  transition: 0.25s;
  width: 153px;
}
#submit-btn:hover {
  box-shadow: 0px 1px 18px #24c64f;
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


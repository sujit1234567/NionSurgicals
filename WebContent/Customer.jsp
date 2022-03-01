<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <!-- Mobile Metas -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="shortcut icon" type="image/png" href="images/nionicon.png"  />

    <!-- Site Metas -->

     <title>Online Hospital Equipments site in India: Shop Online for Surgical Instrument, Medical Device & Equipment,Hospital Furnitures ,Lab Diagnostics ,Home Healthcare  and More - nionsurgicals.com</title>
<meta name="description" content="nionsurgicals.com: Online Shopping India - We are top manufacturers and suppliers of Hospital Medical Equipment and Home Healthcare products.. Free Shipping & Cash on Delivery Available.">
<meta name="keywords" content="nionsurgicals.com, Nionsurgicals,nionsurgicals, Online Hospital Equipment, online hospital equipment india, india hospital devices online, amazon india, nion, buy online, buy surgicals online, buy covid-19 online, buy sanitizer online, ppt kit, hospital furniture, labs, home healthcare, medical device, Syringes, ECG,test tubes glass,  scissors, chair,blood pressure monitors, temperature">
<meta name="google" content="nositelinkssearchbox">

    <!-- Site Icons -->
   <jsp:include page="boot.jsp"/>

    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->


 <style>


* {
  box-sizing: border-box;
}

/* Add padding to containers */
.container {
  padding: 16px;
  background-color: white;
}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Overwrite default styles of hr */
hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

/* Set a style for the submit button */
.registerbtn {
  background-color: #4CAF50;
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.registerbtn:hover {
  opacity: 1;
}

/* Add a blue text color to links */
a {
  color: dodgerblue;
}

/* Set a grey background color and center the text of the "sign in" section */
.signin {
  background-color: #f1f1f1;
  text-align: center;
}
</style> 

</head>
<body>

 
 <jsp:include page="navigation.jsp"/>


  <div class="contact-box-main">
 <div class="container">

<form action="customerservlet" method="POST">
<input type="hidden" name="action" value="add">


<!-- <center>
<fieldset>
<legend>Add Customer</legend>

<table>

<tr>
<td>Customer Name :</td>
<td><input type="text" placeholder="enter the your name"  name="custname"></td>

</tr>
<tr>
<td>Customer Email :</td>
<td><input type="text" placeholder="enter the your email" name="custemail"></td>
</tr>
<tr>
<td>Customer Password:</td>
<td><input type="text" placeholder="enter the your password" name="custpassword"></td>

</tr>
<tr>
<td>Customer Contact:</td>
<td><input type="text" placeholder="enter the contact number" name="custcontact"></td>

</tr>
<tr>
<td>Customer Address :</td>
<td><input type="text" placeholder="enter the your address" name="custaddress"></td>

</tr>

<tr>
<td><input type="submit" value="submit" ></td>

<td><input type="submit" value="reset" ></td>
</tr>
</table>
</fieldset>
</center>  -->



<div class="container">
    <h1>Register</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>
     
      <label for="name"><b>Name</b></label>
    <input type="text" placeholder="Enter Name" name="custname" id="name" required>
    
     <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="custemail" id="email" required>
    
      <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="custpassword" id="psw" required>
    
    <label for="psw-repeat"><b>Repeat Password</b></label>
    <input type="password" placeholder="Repeat Password" name="psw-repeat" id="psw-repeat" required>
    
     <label for="contact"><b>Contact</b></label>
    <input type="text" placeholder="Enter Contact" name="custcontact" id="email" required>
     
    <label for="address"><b>Address</b></label>
    <input type="text" placeholder="Enter Email" name="custaddress" id="email" required>

   

    
    <hr>
    <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>

    <button type="submit" class="registerbtn">Register</button>
  </div>
  
  <div class="container signin">
    <p>Already have an account? <a href="#">Sign in</a>.</p>
  </div>
 
</form> 

 </div>

</div>

 
<jsp:include page="jsfile.jsp"/>
 
</body>
</html>
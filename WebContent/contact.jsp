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


 <style type="text/css">
 
/*  body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;} */

input[type=text], select, textarea {
  width: 100%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  margin-top: 6px;
  margin-bottom: 16px;
  resize: vertical;
  
}

input[type=submit] {
  background-color: #4CAF50;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
  
}

.container {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
 
 
 
 </style>


</head>
<body>
<%
 String message = (String)request.getAttribute("message");

%>
<jsp:include page="navigation.jsp"/>
 

  <div class="contact-box-main">
  <%if(message!=null){ %>
<h3 style="color:red ;text-align:center"><%=message %></h3>
<%} %>
 <div class="container">
 
<form action="customermsgservlet" method="POST">
<input type="hidden" name="action" value="add">

    <label for="name">Name</label>
    <input type="text" id="name" name="name" placeholder="Your name..">

    <label for="number">Contact</label>
    <input type="text" id="contact" name="contact" placeholder="Your contact number..">

    <label for="email">Email</label>
    <input type="text" id="email" name="email" placeholder="Your email address..">
    
    
    
    <label for="message">Message</label>
    <textarea id="message" name="message" placeholder="Write something.." style="height:200px"></textarea>
     
     </br></br>
    <input type="submit" value="Submit">
   
   
    




  
 
</form> 
        
 </div>

</div>


<jsp:include page="jsfile.jsp"/>
 
</body>
</html>
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

<script type="text/javascript" src="jquery.min.js"></script>
<script type="text/javascript" src="jquery.validate.min.js"></script>
<script type="text/javascript">


$(function(){
	   $("form").validate({
	   rules: {
		   username:"required",
		   password:"required"       
	   }
});
});
 
</script>
	 
	 <style type="text/css">
	 
	 .registerbtn {
	 background-color: #4CAF50;
  color: white;
  padding: 5px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  width:100px;
  
}

 
	 
	 </style>
	 
	   
</head>
<body>
<jsp:include page="navigation.jsp"/>
<div style="color: red;font-size:large;">
<%

String fail=(String)request.getAttribute("loginfaild");
if(fail!=null)
{
out.println(fail);
}



%>

<%


String msg=(String)request.getAttribute("changepassmsg");
if(msg!=null)
{
out.println(msg);
}

%>

</div>
<form action="loginservlets" method="post">
<input type="hidden" name="action" value="login">
<center>
<fieldset>
    <legend> Login </legend><legend></legend>
    
<table>
     <!-- <tr>
       <td> Select: </td>
       <td> 
          <select name="type">
              <option selected disabled> ----------Select-------</option>
              <option name="Admin"> Admin </option>
              <option name="User"> User </option>
          </select>
          </td>
    </tr>     -->
    <tr>
       <td> Email: </td>
       <td><input type="text" name="username"></td>
    </tr>
    
    <tr>
       <td> Password: </td>
       <td><input type="password" name="password"></td>
    </tr>  
   
    <tr>
      <td> <input type="submit" value ="login" class="registerbtn"> </td>
      <td> <input type="reset" value ="Reset"   class="registerbtn"> </td>
    </tr>
    
    
    



</table>

<p style="text-size:40px;font-size:20px"><a href="Customer.jsp">Sign In /</a>
<a href="ChangePassword.jsp">forget password ?</a></p>


</fieldset>
</center>
</form>






<jsp:include page="footer.jsp"/>
   <jsp:include page="jsfile.jsp"/>
</body>
</html>
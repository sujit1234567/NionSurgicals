<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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

<script type="text/javascript" src="jquery.min.js"></script>
<script type="text/javascript" src="jquery.validate.min.js"></script>
<script type="text/javascript">
	
		$(function(){
			$("form").validate({
				rules:{
					
					username:{
						required:true,
					},
					
					password:{
						required:true,
					},
				},
			});
		});
</script>
</head>

<body>
<jsp:include page="navigation.jsp"></jsp:include><br>
<br>
<form action="loginservlets" method="post">
<input type="hidden" name="action" value="change">
<center>
	<fieldset>
		<legend>Change Password</legend>
			<table>
				<!-- <tr>
					<td>Select:</td>
					<td>
					<select name="type">
						<option selected disabled>------------Select-----------</option>
						<option name="Admin">Admin</option>
						<option name="User">User</option>
					</select>
					</td>
				</tr>
				 -->
				<tr>
					<td>User Name:</td>
					<td><input type="text" name="username"></td>
				</tr>
				
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password"></td>
				</tr>
				
				<tr>
					<td><input type="submit" value="Change Password"></td>
					<td><input type="reset" value="Reset"></td>
				</tr>
				
			</table>
	</fieldset>
</center>
</form>
<jsp:include page="footer.jsp"/>
   <jsp:include page="jsfile.jsp"/>
</body>
</html>
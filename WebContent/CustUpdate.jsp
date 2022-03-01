<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="java.util.ArrayList" %>
     <%@page import="java.util.List" %>
     <%@page import="com.product.pojo.*" %>
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

  <jsp:include page="boot.jsp"/>
<title>Insert title here</title>
</head>
<body>
 <jsp:include page="navigation.jsp"/>

<form action="customerservlet" method="post">
<input type="hidden" name="action" value="update">

<%   


Customer c=(Customer)session.getAttribute("cust");

%>
<center>
<fieldset>
<legend>Update Customer</legend>

<table>



<%-- <tr>
<td>Customer Id :</td>
<td><input type="text" placeholder="enter the your Id"  name="custid" value= <%=c.getCustid()%>></td>
</tr> --%>
<tr>
<td>Customer Name :</td>
<td><input type="text" placeholder="enter the your name"  name="custname" value= <%=c.getCustname()%>></td>

</tr>
<tr>
<td>Customer Email :</td>
<td><input type="text" placeholder="enter the your email" name="custemail" value= <%=c.getCustemail()%>></td>
</tr>
<%-- <tr>
<td>Customer Password:</td>
<td><input type="text" placeholder="enter the your password" name="custpassword" value= <%=c.getCustpassword()%>></td>

</tr> --%>
<tr>
<td>Customer Contact:</td>
<td><input type="text" placeholder="enter the contact number" name="custcontact" value= <%=c.getCustcontact()%>></td>

</tr>
<tr>
<td>Customer Address :</td>
<td><input type="text" placeholder="enter the your address" name="custaddress" value= <%=c.getCustaddress()%>></td>

</tr>

<tr>
<td><input type="submit" value="submit" ></td>

<td><input type="submit" value="reset" ></td>
</tr>
</table>
</fieldset>
</center>
</form>



<jsp:include page="footer.jsp"/>
<jsp:include page="jsfile.jsp"/>
</body>
</html>
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

</head>


<body>
 <jsp:include page="navigation.jsp"/>


<% 
List<Customer> custlist=new ArrayList<Customer>();

custlist=(List<Customer>)session.getAttribute("clist");

%>

<form>

<center>
<fieldset>
<legend>Customer List</legend>
<table border=1 cellspacing=0>
<tr>
<td>Customerid</td>
<td>Customername</td>
<td>Customeremail</td>
<td>Customerpassword</td>
<td>Customercontact</td>
<td>Customeraddress</td>


<td colspan=2><center>Action</center></td>

</tr>

<% for(Customer c:custlist)
{
%>

<tr>
<td><%= c.getCustid()%></td>
<td><%= c.getCustname() %></td>
<td><%= c.getCustemail() %></td>
<td><%= c.getCustpassword() %></td>
<td><%= c.getCustcontact() %></td>
<td><%= c.getCustaddress() %></td>




<td><a href="customerservlet?action=update&id=<%=c.getCustid() %>">update</a></td>
<td><a href="customerservlet?action=delete&id=<%=c.getCustid() %>">delete</td>
</tr>
<%

}
%>
</center>
</fieldset>
</table>
</form>

<jsp:include page="footer.jsp"/>
<jsp:include page="jsfile.jsp"/>
</body>


</html>
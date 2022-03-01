<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="java.util.List" %>
    <%@page import="java.util.ArrayList" %>
    <%@page import="com.product.pojo.CustomerMsg" %>
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

</head>
<body>

 <jsp:include page="navigation.jsp"/>
<br><br>
<%

List<CustomerMsg> lmessage=new ArrayList<>();

lmessage=(List<CustomerMsg>)session.getAttribute("message");


%>
<%-- <% 

if(!lmessage.isEmpty())
{

%> --%>



<form action="" method="">
<centre>
<fieldset>
<lengend>Message List</lengend>
<table border="1" cellspacing=0>
<tr>
  <th>Id</th>
  <th>Name</th>
  <th>Contact</th>
  <th>Email</th>
  <th>Message</th>
  <th>Date</th>
  <th>Action</th>
 
  
</tr>
<%

for(CustomerMsg cmsg :lmessage)
{
%>
	<tr>
	<td><%=cmsg.getId() %></td>
	<td><%=cmsg.getName() %></td>
	
	
	
	<td><%=cmsg.getContact() %></td>
	<td><%=cmsg.getEmail() %></td>
	

	<td><%=cmsg.getMassage()%></td>
	<td><%=cmsg.getMessagedate() %></td>
	<td>  <a href="customermsgservlet?action=delete&id=<%=cmsg.getId() %>">Delete</a></td>
	
	</tr>
	 
          
<%
	}

%>

</table>


<%-- <%
}
else{
%>
<b style="color:red">No Items added yet</b>
<%} %> --%>
</fieldset>

</centre>
</form>
<br><br>

   <jsp:include page="footer.jsp"/>


   
    <!-- Start Footer  -->
  

  
    <a href="#" id="back-to-top" title="Back to top" style="display: none;">&uarr;</a>

    <!-- ALL JS FILES -->
   <jsp:include page="jsfile.jsp"/>

</body>
</html>
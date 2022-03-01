<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.List" %>
    <%@page import="java.util.ArrayList" %>
    <%@page import="com.product.pojo.Cart" %>
    
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

<%


   String user =(String)session.getAttribute("User");
   String admin=(String)session.getAttribute("Admin");

%>

<%
List<Cart> cartlist=new ArrayList<>();
cartlist=(List<Cart>)session.getAttribute("cartlist");

if(user!=null){

if(!cartlist.isEmpty())
{

%>


 <div class="container">
<form action="orderservlet" method="post">
<centre>
<fieldset>
<lengend>Cart List</lengend>
<table border="1" cellspacing=0>
<tr>
 <!--  <th>Cart Id</th> -->
 <!--  <th>Product Id</th> -->
  <th>Product Name</th>
 <!--  <th>Product Category</th> -->
  <th>Product Image</th>
  <th>Product Quantity</th>
 <!--  <th>Customer Email</th> -->
  <th>Product Price</th>
  
</tr>
<%

for(Cart ca:cartlist)
{
%>
	<tr>
	<%-- <td><%=ca.getCartid() %></td> --%>
	<%-- <td><%=ca.getProductid() %></td>
	 --%>
	
	
	<td><%=ca.getProductname() %></td>
	<%-- <td><%=ca.getProductcategory() %></td> --%>
	
	<td><img src="<%= ca.getProductimage() %>" height="200px" width="200px"></img></td>
	<td><input type="text" name="quantity" class="quantity" value="1"></td>
	<%-- <td><%=ca.getCustemail() %></td> --%>
	<td><%=ca.getProductprice() %></td>
	
	</tr>
	 <td><input type="hidden" name="price" value="<%=ca.getProductprice() %>">
	 <input type="hidden" name="productname" value="<%=ca.getProductname() %>">
            <a href="cartservlet?action=delete&id=<%=ca.getCartid() %>">Delete</a></td>
<%
	}

%>

</table>

<input type="submit" value="place order">
<%
}
else{
%>

<b style="color:red">No Items added yet</b>
<%} %>
<%}

else{
	%>
	<%
	request.setAttribute("logins", "Login First....!");
	RequestDispatcher rd=request.getRequestDispatcher("productinfo.jsp");
	rd.forward(request, response);
	%>	
	<!-- <b style="color:red;margin-left:600px;font-size:20px"><a href="Login.jsp">Login First....!</a></b>	 -->

     


<%} %>
</fieldset>

</centre>
</form>
</div>
<br><br>

   <jsp:include page="footer.jsp"/>


   
    <!-- Start Footer  -->
  

  
    <a href="#" id="back-to-top" title="Back to top" style="display: none;">&uarr;</a>

    <!-- ALL JS FILES -->
   <jsp:include page="jsfile.jsp"/>
</body>
</html>
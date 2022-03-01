<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.ArrayList"  %> 
   <%@ page import="java.util.List"  %>  
   <%@ page import="com.product.pojo.*" %>
  
   
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
  
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
<style>



.content{
  background: white;
  grid-column: 1/-1;
  grid-row: 3/6;
}

.content{

display: grid;
grid-template-rows: repeat(2,210px);
grid-template-columns: repeat(5,190px);
grid-gap: 3em;
grid-row-gap: 5em;
padding-left: 60px;
padding-top: 40px;
}

</style>

 <jsp:include page="boot.jsp"/>
</head>
<body>
<jsp:include page="navigation.jsp"/>

<!-- <li class="search"><input type="text" name="search"><a href="Search"><i class="fa fa-search"></i></a></li>
                        <li class="side-menu"> -->

 <br><br>
<%

List<Product> plist=new ArrayList<>();
plist=(List<Product>)session.getAttribute("lproduct");
   String user =(String)session.getAttribute("User");
   String admin=(String)session.getAttribute("Admin");

%>


<form action="Search">
<center>
<input type="hidden" name="action" value="search">
<input type="text" name="pname"/>
<input type="submit" value="search"/>
</center>
</form>


<form>
<%if(admin!=null && user==null){%>
<center>
<fieldset>
<legend>ProductList</legend>

<table border=1 cellspacing=0>
<tr>
<td>Product Id :</td>
<td>Product Name :</td>
<td>Product Image :</td>
<td>Product Category</td>
<td>Product Description</td>
<td>Product Price</td>

<%} %>

<%
if(admin!=null && user==null){
%>
<td colspan=2><center>Action</center></td>
<%} %>

<% if(admin==null && user!=null){
%>
<td><center>Action</center></td>
<%} %>
</tr>


<%for(Product p:plist){ %>
<%
if(admin!=null && user==null){
%>
<tr>

<td><%=p.getProductid() %></td>
<td><%=p.getProductname() %></td>
<td><img src="<%= p.getProductimage() %>" height="100" width="100"></img></td>
<td><%=p.getProductcategory() %></td>
<td><%=p.getProductdescription() %></td>
<td><%=p.getProductprice() %></td>

<%} %>

<%
if(admin!=null && user==null){
%>
<td><a href="productservlet?action=update&id=<%=p.getProductid() %>">update</a></td>
<td><a href="productservlet?action=delete&id=<%=p.getProductid() %>">delete</a></td>
<%} %>
</tr>
<%} %>




<%
if(admin==null && user!=null || admin==null && user==null){
%>
 <div class="content">
 <%for(Product p:plist){ %>
   <div class="c1">
   <a href="Search?action=search&id=<%=p.getProductid() %>">
     <img src="<%=p.getProductimage() %>" alt="heromovie" height="210px" width="190px"/>
     <p style="border:2px solid #ddd;color:black;background:#ddd;padding-left:20px;height:50px;"><%=p.getProductname() %></a></p>
        </a>
         </div>
         <%} %>
         </div>


<%} %>







</table>
</fieldset>
</center>
</form>

 //kuch kaam ka nhi.....


</body>
</html>
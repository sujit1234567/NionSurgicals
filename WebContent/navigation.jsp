<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.ArrayList"  %> 
   <%@ page import="java.util.List"  %>  
   <%@ page import="com.product.pojo.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

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
    
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]--> 
    
    
   
    

</head>
<body>

<%

String admin=(String)session.getAttribute("Admin");
String user=(String)session.getAttribute("User");
List<Product> plist=new ArrayList<>();
plist=(List<Product>)session.getAttribute("lproduct");
%>


    <!-- Start Main Top -->
    <header class="main-header">
        <!-- Start Navigation -->
        <nav class="navbar navbar-expand-lg navbar-light bg-light navbar-default bootsnav">
            <div class="container">
                <!-- Start Header Navigation -->
                <div class="navbar-header">
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbar-menu" aria-controls="navbars-rs-food" aria-expanded="false" aria-label="Toggle navigation">
                    <i class="fa fa-bars"></i>
                </button>
                    <a class="navbar-brand" href="index.jsp" style="margin-left:50px"><img src="images/nions.png" class="logo" alt="" height="100px" width="180px"/></a> 
                </div>
              
                <!-- End Header Navigation -->

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="navbar-menu">
                  <% 
       if(user==null && admin!=null){
        %>
                    <ul class="nav navbar-nav ml-auto" data-in="fadeInDown" data-out="fadeOutUp">
                        <li class="nav-item active"><a class="nav-link" href="index.jsp">Home</a></li>
                         <li class="nav-item active"><a class="nav-link" href="productservlet">Products</a></li>
                           <li class="nav-item active"><a class="nav-link" href="AddProduct.jsp">Add Product</a></li>
                            
                          <!--    <li class="nav-item active"><a class="nav-link" href="ChangePassword.jsp">Change Password</a></li> -->
                             <li class="nav-item active"><a class="nav-link" href="customermsgservlet">Show Message</a></li>
                             <li class="nav-item active"><a class="nav-link" href="customerservlet">Show All User</a></li>
                             <li class="nav-item active"><a class="nav-link" href="LoginServlet">Log Out</a></li>
                               
                     <%
        }
        if(user!=null && admin==null){
        %>      
         <ul class="nav navbar-nav ml-auto" data-in="fadeInDown" data-out="fadeOutUp">
         <li class="nav-item active"><a class="nav-link" href="index.jsp">Home</a></li>
          <li class="nav-item active"><a class="nav-link" href="productservlet">Products</a></li>
           <%--  <li class="nav-item active"><a class="nav-link" href="customerservlet?action=update&email=<%=user%>">Edit Profile</a></li> --%>
           <!--  <li class="nav-item active"><a class="nav-link" href="ChangePassword.jsp">Change Password</a></li> -->
             <li class="nav-item active"><a class="nav-link" href="LoginServlet">Log Out</a></li>
              <li class="nav-item "><a class="nav-link" href="contact.jsp">Contact Us</a></li>
             <!--  <li class="nav-item active"><a class="nav-link" href="#">FeedBack</a></li> -->
          <div class="attr-nav">
                    <ul>
                      <!--   <li class="search"><input type="text" name="productname"><a href="#"><i class="fa fa-search"></i></a></li>
                     -->  <li class="side-menu"> 
                       
                     
                       
                  
                      
							 <a href="cartservlet">
							 <i class="fa fa-shopping-bag"></i>
								<span class="badge">3</span>
								<p>My Cart</p>
							</a>
							
								
							
						</li>
                    </ul>
                </div>
          
         <%
        }
        if(admin==null && user==null){
        %>   
         <ul class="nav navbar-nav ml-auto" data-in="fadeInDown" data-out="fadeOutUp">
            <li class="nav-item "><a class="nav-link" href="index.jsp">Home</a></li>
          <li class="nav-item "><a class="nav-link" href="productservlet">Products</a></li>
          <!--  <li class="nav-item "><a class="nav-link" href="Customer.jsp">Registration</a></li> -->
           <li class="nav-item "><a class="nav-link" href="Login.jsp">Login</a></li>
          <li class="nav-item "><a class="nav-link" href="contact.jsp">Contact Us</a></li>
           <li class="nav-item "><a class="nav-link" href="#">About Us</a></li>
           
         <%} %>
         
         
           <%
        if(admin!=null && user!=null){
        	%>
        
         <ul class="nav navbar-nav ml-auto" data-in="fadeInDown" data-out="fadeOutUp">
           <li class="nav-item active"><a class="nav-link" href="LoginServlet">Log Out</a></li>
        
        
          <%} %>
                        <!-- <li class="nav-item"><a class="nav-link" href="about.jsp">About Us</a></li>
                        <li class="dropdown">
                            <a href="#" class="nav-link dropdown-toggle arrow" data-toggle="dropdown">SHOP</a>
                            <ul class="dropdown-menu">
								<li><a href="shop.jsp">Sidebar Shop</a></li>
								<li><a href="shop-detail.jsp">Shop Detail</a></li>
                                <li><a href="cart.jsp">Cart</a></li>
                                <li><a href="checkout.jsp">Checkout</a></li>
                                <li><a href="my-account.jsp">My Account</a></li>
                                <li><a href="wishlist.jsp">Wishlist</a></li>
                            </ul>
                        </li>
                        <li class="nav-item"><a class="nav-link" href="gallery.jsp">Gallery</a></li>
                        <li class="nav-item"><a class="nav-link" href="contact-us.jsp">Contact Us</a></li>
                    </ul>
                </div> 
                <!-- /.navbar-collapse -->

                <!-- Start Atribute Navigation -->
                
</div>
</div>
</nav>
</header>

</body>
</html>
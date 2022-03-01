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

<style>
.button {
  display: inline-block;
  padding: 15px 25px;
  font-size: 12px;
  cursor: pointer;
  text-align: center;
  text-decoration: none;
  outline: none;
  color: #fff;
  background-color: #30669c;
  border: none;
  border-radius: 15px;
  box-shadow: 0 9px #999;
}

.button:hover {background-color:#a84a2d}

.button:active {
  background-color: #a84a2d ;
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}
</style>

    <!-- Site Icons -->
   <jsp:include page="boot.jsp"/>
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<body>
<%

List<Product> plist=new ArrayList<>();
plist=(List<Product>)session.getAttribute("lproduct");
   String user =(String)session.getAttribute("User");
   String admin=(String)session.getAttribute("Admin");

%>

<%
Product p=(Product)session.getAttribute("product");

%>
<%
String loginmsg=(String)  request.getAttribute("logins");
%>
 
<jsp:include page="navigation.jsp"/>







<div class="shop-detail-box-main">
        <div class="container">
            <div class="row">
                <div class="col-xl-5 col-lg-5 col-md-6">
                    <div id="carousel-example-1" class="single-product-slider carousel slide" data-ride="carousel">
                        <div class="carousel-inner" role="listbox">
                            <div class="carousel-item active"> <img class="d-block w-100" src="<%=p.getProductimage() %>" alt="First slide"> </div>
                            <div class="carousel-item"> <img class="d-block w-100" src="<%=p.getProductimage() %>" alt="Second slide"> </div>
                            <div class="carousel-item"> <img class="d-block w-100" src="<%=p.getProductimage() %>" alt="Third slide"> </div>
                        </div>
                        <a class="carousel-control-prev" href="#carousel-example-1" role="button" data-slide="prev"> 
						<i class="fa fa-angle-left" aria-hidden="true"></i>
						<span class="sr-only">Previous</span> 
					</a>
                        <a class="carousel-control-next" href="#carousel-example-1" role="button" data-slide="next"> 
						<i class="fa fa-angle-right" aria-hidden="true"></i> 
						<span class="sr-only">Next</span> 
					</a>
                        <ol class="carousel-indicators">
                            <li data-target="#carousel-example-1" data-slide-to="0" class="active">
                                <img class="d-block w-100 img-fluid" src="<%=p.getProductimage() %>" alt="" />
                            </li>
                            <li data-target="#carousel-example-1" data-slide-to="1">
                                <img class="d-block w-100 img-fluid" src="<%=p.getProductimage() %>" alt="" />
                            </li>
                            <li data-target="#carousel-example-1" data-slide-to="2">
                                <img class="d-block w-100 img-fluid" src="<%=p.getProductimage() %>" alt="" />
                            </li>
                        </ol>
                    </div>
                </div>
                <div class="col-xl-7 col-lg-7 col-md-6">
                    <div class="single-product-details">
                        <h2><%=p.getProductname() %></h2>
                        <%-- <h5> <del>$ 60.00</del><%=p.getProductprice() %></h5> --%>
                        <p class="available-stock"><span> More than 20 available / <a href="#">8 sold </a></span><p>
						<%-- <h5><%=p.getProductcategory() %></h5> --%>
						<%-- <h4>Short Description:</h4>
						<p><%=p.getProductdescription() %> </p> --%>
				     <a href="tel:7304487103"><button class="button" >INQUERY tel: 730-448-7103</button></a>
						</br></br>
						<ul>
							<li>
								<div class="form-group quantity-box">
									<label class="control-label">Quantity</label>
									<input class="form-control" value="0" min="0" max="20" type="number">
								</div>
							</li>
						</ul>

						<div class="price-box-bar">
							<div class="cart-and-bay-btn">
								<%-- <a class="btn hvr-hover" data-fancybox-close="" href="orderservlet?action=orderplace&id=<%= p.getProductid() %>">Buy New</a> --%>
								<a class="btn hvr-hover" data-fancybox-close="" href="cartservlet?action=addtocart&id=<%= p.getProductid() %>">Add to cart</a>
						
							</div>
						</div>
                        <div>
                        <%
                        if(loginmsg!=null){ %>
                        	<h1 style="color:red;font-size:30px"><%=loginmsg%></h1>
                       <%  }
                        
                        %>
                       
                        </div>						
						</div>
                    </div>
                </div>
            </div>
			
		

       
                      
                        
                    </div>
                </div>
            </div>

        </div>
    </div>


   
    <!-- Start Footer  -->
  
<jsp:include page="footer.jsp"/>
  
    <a href="#" id="back-to-top" title="Back to top" style="display: none;">&uarr;</a>

    <!-- ALL JS FILES -->
   <jsp:include page="jsfile.jsp"/>

</body>
</html>
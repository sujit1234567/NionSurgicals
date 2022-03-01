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
</head>
<body>

 <jsp:include page="navigation.jsp"/>


<form action="productservlet" method="post">
<input type="hidden" name="action" value="add">
 <center>
 <fieldset>
 <legend><h4>Add Product</h4></legend>
 <table>
   <tr>
   <td>Enter Product Name:</td>
   <td><input type="text" name="pname"></td>
   </tr>
   
   
    <tr>
   <td>Enter Product category:</td>
   <td><input type="text" name="pcategory"></td>
   </tr> 
   
   <tr>
   <td>Insert Product Image:</td>
   <td><input type="text" name="pimage"></td>
   </tr>
  
   
   <tr>
   <td>Enter Product Description:</td>
   <td><input type="text" name="pdescription"></td>
   </tr>
   <tr>
   <td>Enter Product Price:</td>
   <td><input type="text" name="pprice"></td>
   </tr>
   <tr>
   <td><input type="submit" value="save"></td>
   <td><input type="reset" value="reset"></td>
   </tr>
 </table>
 
 </fieldset>
 </center>
</form>
 
  <jsp:include page="footer.jsp"/>


   
    <!-- Start Footer  -->
  

  
    <a href="#" id="back-to-top" title="Back to top" style="display: none;">&uarr;</a>

    <!-- ALL JS FILES -->
   <jsp:include page="jsfile.jsp"/>
 
</body>
</html>
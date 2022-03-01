<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="shortcut icon" type="image/png" href="images/nionicon.png"  />
<title>Insert title here</title>
</head>
<body>
<form action="loginservlets" method="post">
<input type="hidden" name="action" value="adminlogin">
<center>
<fieldset>
    <legend> Login </legend>
    
<table>
     <tr>
       <td> Select: </td>
       <td> 
          <select name="type">
              <option selected disabled> ----------Select-------</option>
              <option name="Admin"> Admin </option>
             <!--  <option name="User"> User </option> -->
          </select>
          </td>
    </tr>  
    <tr>
       <td> User Name: </td>
       <td><input type="text" name="username"></td>
    </tr>
    
    <tr>
       <td> Password: </td>
       <td><input type="password" name="password"></td>
    </tr>  

    <tr>
      <td> <input type="submit" value ="login"> </td>
      <td> <input type="reset" value ="Reset"> </td>
    </tr>
</table>




</fieldset>
</center>
</form>








</body>
</html>
package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.product.dao.CartDaoImpl;
import com.product.dao.OrdersDaoImpl;
import com.product.pojo.Orders;

/**
 * Servlet implementation class orderservlet
 */
@WebServlet("/orderservlet")
public class orderservlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		double totalprice=0;	
		HttpSession session=request.getSession();
		String  custemail=(String)session.getAttribute("User");
		OrdersDaoImpl odb=new OrdersDaoImpl();
		
		odb.placeOrder(custemail);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		double totalprice=0;	
		String proname="";
		HttpSession session=request.getSession();
		String  custemail=(String)session.getAttribute("User");
		OrdersDaoImpl odb=new OrdersDaoImpl();
		CartDaoImpl cdi=new CartDaoImpl();
	//	Orders order=odb.placeOrder(custemail,totalbill);
		
		String quantity[]=request.getParameterValues("quantity");
		String price[]=request.getParameterValues("price");
		//String productname=request.getParameter("productname");
		String productname[]= request.getParameterValues("productname");
		
		for(int i=0; i<price.length; i++) 
		{	
		   totalprice=totalprice+(Integer.parseInt(quantity[i])*(Double.parseDouble(price[i])));	
		}
		for(int i=0;i<productname.length;i++)
		{
			proname=proname+" , "+productname[i];
		
		}
	
	
		Orders order=odb.placeOrder(custemail, proname ,totalprice);
		if(order!=null)
		{
			//System.out.println("fdsfsf");
			boolean b=cdi.deleteFromCartByCustEmail(custemail);
			//System.out.println(b);
			
			
			if(b)
			{
				//System.out.println("order" ,order);
				
				
				request.setAttribute("ord", order);
				
				RequestDispatcher rd=request.getRequestDispatcher("bill.jsp");
				
				rd.forward(request, response);
				
			}
			else{
				
				
				response.sendRedirect("Fail.jsp");
			}
		}
		else{
			
			response.sendRedirect("Fail.jsp");
			
		}
				
				
	}}

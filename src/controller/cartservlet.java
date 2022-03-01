package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.product.dao.*;
import com.product.pojo.Cart;



/**
 * Servlet implementation class cartservlet
 */
@WebServlet("/cartservlet")
public class cartservlet extends HttpServlet {
	
	CartDao cd=new CartDaoImpl();
	Cart ct=new Cart();
	
	boolean flag;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		
		HttpSession session=request.getSession();
		
		List<Cart> cartlist=new ArrayList<>();
		
		String action=request.getParameter("action");
		
		String custemail=(String)session.getAttribute("User");
		
		if(action!=null && action.equals("addtocart"))
		{
			
			int pid=Integer.parseInt(request.getParameter("id"));
			int quantity=1;
			
			Cart ca=new Cart(pid,quantity, custemail);
			flag=cd.addToCart(ca);
		
		if(flag){
			//out.print("product added successfully in cart");
			
			cartlist=cd.showCart(custemail);
			session.setAttribute("cartlist", cartlist);
			response.sendRedirect("CartList.jsp");
		}
		else{
			out.println("failed");
		}
		}
else if(action!=null && action.equals("delete")) {
			
			int cartid=Integer.parseInt(request.getParameter("id"));
			
			flag=cd.deleteFromCart(cartid);
			
			if(flag) {
				
				//out.print("Cart item deleted successfully.");
				cartlist=cd.showCart(custemail);
				session.setAttribute("cartlist", cartlist);
				response.sendRedirect("CartList.jsp");
			}
			else
			{
				out.print("Cart item not deleted.");
			}
		}	
		else{
			
			
			cartlist=cd.showCart(custemail);
			session.setAttribute("cartlist", cartlist);
			response.sendRedirect("CartList.jsp");
			
		}
		
		
		
		
		
		
	}

	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		
	}

}

package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.product.dao.ProductDao;
import com.product.dao.ProductDaoImpl;
import com.product.pojo.Cart;
import com.product.pojo.FeedBack;

 ////////////////////////////NEED FULL CHANAGES //////////////////////////////////////////////////////

/**
 * Servlet implementation class Feedback
 */
@WebServlet("/Feedback")
public class Feedback extends HttpServlet {
	
	ProductDao fd=new ProductDaoImpl();
	boolean flag;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          
		
        PrintWriter out=response.getWriter();
		
		HttpSession session=request.getSession();
		
		List<FeedBack> fblist=new ArrayList<>();
		//fblist=fd.getAllFeedBack();
		session.setAttribute("fblist", fblist);
		response.sendRedirect("feedbacklist.jsp");
		}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter out=response.getWriter();
		
		int feedbackid;
		String custname,custemail,review,suggestion;
		
		boolean flag;
		
		String action=request.getParameter("action");	
		
		if(action!=null && action.equals("add")) 
		  { 
			
			custname=request.getParameter("cname");
			custemail=request.getParameter("cemail");
			review=request.getParameter("review");
			suggestion=request.getParameter("suggest");
		
		 
		
		FeedBack f=new FeedBack(custname,custemail,review,suggestion);
		   
		  // flag=fd.addFeedBack(f);
		   
		   
		   
		//   if(flag){
			   //out.print("Feedback Added Successfully!!!");
			   
			   request.setAttribute("feed", "Feedback Added Successfully!!!");
			   RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			   
			   rd.forward(request, response);
			
			   
		   }
		   else{
			   
			   out.print("Something went wrong.....");
		   }
		   
		  
	}
	}

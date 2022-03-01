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

import com.product.dao.CustomerDao;
import com.product.dao.CustomerDaoImpl;
import com.product.pojo.Customer;
import com.product.pojo.*;

/**
 * Servlet implementation class customerservlet
 */
@WebServlet("/customerservlet")
public class customerservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	CustomerDao ct=new CustomerDaoImpl();
	boolean flag;
    public customerservlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		List<Customer> custlist=new ArrayList<Customer>();
		
		String action=request.getParameter("action");
		if(action!=null && action.equals("delete"))
		{
			int custid=Integer.parseInt(request.getParameter("id"));
			flag=ct.deleteCustomer(custid);
			if(flag)
			{
				custlist=ct.showAllCustomer();
				session.setAttribute("clist", custlist);
				response.sendRedirect("CustList.jsp");
				
			}
			else{
				out.print("customer not deleted");
			}
		}
		
		/*else if(action!=null && action.equals("update"))
		{
		int custid=Integer.parseInt(request.getParameter("id"));
		Customer customer=ct.searchCustomerById(custid);
		
		session.setAttribute("cust", customer);
		response.sendRedirect("CustUpdate.jsp");
		}*/

		else if(action!=null && action.equals("update"))
		{
		String mail=request.getParameter("email");
		Customer customer=ct.searchCustomerByEmail(mail);
		
		session.setAttribute("cust", customer);
		response.sendRedirect("CustUpdate.jsp");
		}
		
		else{
	    custlist=ct.showAllCustomer();
		session.setAttribute("clist", custlist);
		response.sendRedirect("CustList.jsp");
	
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CustomerDao cd=new CustomerDaoImpl();
		
		List<Customer> clist=new ArrayList<>();
		HttpSession session=request.getSession();
		
		PrintWriter out=response.getWriter();
		
		int custid;
		String custname,custemail,custpassword,custcontact,custaddress;
		boolean flag;
		
		String action=request.getParameter("action");	
		
		if(action!=null && action.equals("add")) 
		  { 
		custname=request.getParameter("custname");
		custemail=request.getParameter("custemail");
		custpassword=request.getParameter("custpassword");
		custcontact=request.getParameter("custcontact");
		
		custaddress=request.getParameter("custaddress");
		
		
		Customer cust=new Customer(custname,custemail,custpassword,custcontact,custaddress);
		
		
		flag=cd.AddCustomer(cust);
		
		if(flag){
			
			clist=cd.showAllCustomer();
			session.setAttribute("clist", clist);
		
			//response.sendRedirect("CustList.jsp");
			response.sendRedirect("Login.jsp");
			out.print("successfully registrated....");
			
		}
		else{
			
			out.print("something went wrong......");
		}
		  }
		else if(action!=null && action.equals("update")){
			custid=Integer.parseInt(request.getParameter("custid"));
			custname=request.getParameter("custname");
			custemail=request.getParameter("custemail");
			custpassword=request.getParameter("custpassword");
			custcontact=request.getParameter("custcontact");
			
			custaddress=request.getParameter("custaddress");
			
			Customer cust=new Customer(custid,custname,custemail,custpassword,custcontact,custaddress);
			
			flag=cd.UpdateCustomer(cust);
			
			
			if(flag)
			{
				clist=cd.showAllCustomer();
				session.setAttribute("clist", clist);
				response.sendRedirect("CustList.jsp");
				//out.println("customer updated successfully....");
				
			}
			else{
				out.println("something went wrong....");
			}
			
			
		}
		
		
		
		
		
		
		
		
	}

}

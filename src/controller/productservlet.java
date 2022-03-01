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

import com.product.pojo.Product;
import com.product.dao.ProductDao;
import com.product.dao.ProductDaoImpl;


/**
 * Servlet implementation class AddProduct
 */
@WebServlet("/productservlet")
public class productservlet extends HttpServlet {
	
	ProductDao pd=new ProductDaoImpl();
	private static final long serialVersionUID = 1L;
    
	
    
    public productservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		int productid;
		boolean flag;
		String action=request.getParameter("action");
		List<Product> plist=new ArrayList<>();
		HttpSession session=request.getSession();
		if(action!=null && action.equals("delete"))
		{
			productid=Integer.parseInt(request.getParameter("id"));
		
			flag=pd.deleteProduct(productid);
			if(flag)
			{
				//out.println("successfully deleted..");
				plist=pd.showAllProduct();
				session.setAttribute("lproduct", plist);
				//response.sendRedirect("ProductList.jsp");
				response.sendRedirect("gallery.jsp");
				
			}
			else{
				out.println("something went wrong...");
			}
		}
		else if(action!=null && action.equals("update"))
		{
			productid=Integer.parseInt(request.getParameter("id"));
		    Product p=pd.searchproductById(productid);
		    session.setAttribute("p", p);
		    response.sendRedirect("UpdateProduct.jsp");
		}
		else if(action!=null && action.equals("search"))
		{
			String productname=request.getParameter("pname");
			List<Product> product=pd.searchproductByName(productname);
			session.setAttribute("lproduct", product);
			//response.sendRedirect("ProductList.jsp");
			response.sendRedirect("gallery.jsp");
		}
		else if(action!=null && action.equals("searchbyid"))
		{
		   int pid=Integer.parseInt(request.getParameter("id"));
		   Product p=pd.searchproductById(pid);
		   session.setAttribute("product", p);
		   response.sendRedirect("productinfo.jsp");
		}
		else if(action!=null && action.equals("categorybydevice"))
		{
			String pcategory=request.getParameter("pcategory");
			  List<Product> p=pd.searchproductByCategory(pcategory);
			  session.setAttribute("lproduct", p);
		      response.sendRedirect("gallery.jsp");
		
		}
		else if(action!=null && action.equals("categorybydiagnostics"))
		{
			String pcategory=request.getParameter("pcategory");
			  List<Product> p=pd.searchproductByCategory(pcategory);
			  session.setAttribute("lproduct", p);
		      response.sendRedirect("gallery.jsp");
		
		}
		else if(action!=null && action.equals("categorybydisposable"))
		{
			String pcategory=request.getParameter("pcategory");
			  List<Product> p=pd.searchproductByCategory(pcategory);
			  session.setAttribute("lproduct", p);
		      response.sendRedirect("gallery.jsp");
		
		}
		else if(action!=null && action.equals("categorybysurgical"))
		{
			String pcategory=request.getParameter("pcategory");
			  List<Product> p=pd.searchproductByCategory(pcategory);
			  session.setAttribute("lproduct", p);
		      response.sendRedirect("gallery.jsp");
		
		}
		else if(action!=null && action.equals("sanitizer"))
		{
			String pcategory=request.getParameter("pcategory");
			 List<Product> p=pd.searchproductByCategory(pcategory);
			  session.setAttribute("lproduct", p);
		      response.sendRedirect("productinfo.jsp");
			
		}
		
		
		else{
			plist=pd.showAllProduct();
			session.setAttribute("lproduct", plist);
	       // response.sendRedirect("ProductList.jsp");
			//response.sendRedirect("products.jsp");
			response.sendRedirect("gallery.jsp");
			
			
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		List<Product> plist=new ArrayList<Product>();
		int productid;
		String productname,productcategory,productimage,productdescription;
		double productprice;
	    boolean flag;
	    String action=request.getParameter("action");
		
	    if(action!=null && action.equals("add"))
	    {
	    productname=request.getParameter("pname");
		productimage=request.getParameter("pimage");
		productcategory=request.getParameter("pcategory");
		productdescription=request.getParameter("pdescription");
		productprice=Double.parseDouble(request.getParameter(("pprice")));
		
		Product p=new Product(productname,productimage,productcategory,productdescription,productprice);
		
		flag=pd.addProduct(p);
		
		if(flag)
		{
			//out.println("product inserted succesfully...");
			plist=pd.showAllProduct();
			session.setAttribute("lproduct", plist);
			response.sendRedirect("gallery.jsp");
             
		}
		else{
			//out.println("something went wrong....");
			 request.setAttribute("loginfaild", "invalid user name..");
		      RequestDispatcher rd=request.getRequestDispatcher("AddProduct.jsp");
		      rd.forward(request, response);
		}
		
		
	    }
	    else if(action!=null & action.equals("update"))
	    {
	    	productid=Integer.parseInt(request.getParameter("pid"));
	    	productname=request.getParameter("pname");
	 		productimage=request.getParameter("pimage");
	 		productcategory=request.getParameter("pcategory");
	 		productdescription=request.getParameter("pdescription");
	 		productprice=Double.parseDouble(request.getParameter(("pprice")));
	 		
	 		Product p=new Product(productid,productname,productimage,productcategory,productdescription,productprice);
	 		
	 		flag=pd.updateProduct(p);
	 		
	 		if(flag)
	 		{
	 			//out.println("product inserted succesfully...");
	 			plist=pd.showAllProduct();
	 			session.setAttribute("lproduct", plist);
	 		//	response.sendRedirect("ProductList.jsp");
	 			response.sendRedirect("gallery.jsp");
	              
	 		}
	 		else{
				//out.println("something went wrong....");
	 			  request.setAttribute("loginfaild", "invalid user name..");
			      RequestDispatcher rd=request.getRequestDispatcher("UpdateProduct.jsp");
			      rd.forward(request, response);
			}
			
			
	    }
	    
		
	}

}

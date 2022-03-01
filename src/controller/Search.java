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

import com.product.dao.ProductDao;
import com.product.dao.ProductDaoImpl;
import com.product.pojo.FeedBack;
import com.product.pojo.Product;
   

//////////////////////////////////// NEED FULL MANATNANCE//////////

/**
 * Servlet implementation class Search
 */
@WebServlet("/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
     
     
	
	ProductDao pd=new ProductDaoImpl();
    public Search() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
		PrintWriter out=response.getWriter();
		
		HttpSession session=request.getSession();
		String action=request.getParameter("action");
		String name=request.getParameter("pname");
		
		List<Product> p=new ArrayList<>();
	//	f=fd.searchFoodByName(name);
		if(action!=null && action.equals("search"))
		{
		p=pd.searchproductByName(name);
		session.setAttribute("lproduct", p);
		response.sendRedirect("gallery.jsp");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

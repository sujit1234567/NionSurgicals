package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.product.dao.CustomerMsgDao;
import com.product.dao.CustomerMsgDaoImpl;
import com.product.pojo.CustomerMsg;

/**
 * Servlet implementation class customermsgservlet
 */
@WebServlet("/customermsgservlet")
public class customermsgservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       CustomerMsgDao cmd=new CustomerMsgDaoImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public customermsgservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		boolean flag;
		HttpSession session=request.getSession();
		String action=request.getParameter("action");
		
		if(action!=null && action.equals("delete"))
		{
			int id=Integer.parseInt(request.getParameter("id"));
			flag=cmd.deleteMessageById(id);
			if(flag)
			{
				List<CustomerMsg> allmsg	=cmd.showAllMessage();
				session.setAttribute("message", allmsg);
				response.sendRedirect("showmessage.jsp");
			}
			
		}
		
		else{
		List<CustomerMsg> allmsg=cmd.showAllMessage();
		session.setAttribute("message", allmsg);
			response.sendRedirect("showmessage.jsp");
		}
		}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		String action=request.getParameter("action");
		HttpSession session=request.getSession();
		boolean flag;
		
		if(action!=null && action.equals("add")){
		
		String name=request.getParameter("name");
		String contact=request.getParameter("contact");
		String email=request.getParameter("email");
		String message=request.getParameter("message");
		
		flag=cmd.addMessage(name, contact, email, message);
		
		if(flag)
		{
			request.setAttribute("message", "thanks for your message");
			RequestDispatcher req=request.getRequestDispatcher("contact.jsp");
			req.forward(request, response);
			
		}
		else{
			request.setAttribute("message", "something went wrong.....");
			RequestDispatcher req=request.getRequestDispatcher("contact.jsp");
			req.forward(request, response);
		}
		
		}
	}

}

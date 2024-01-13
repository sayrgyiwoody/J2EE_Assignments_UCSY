

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		 response.setContentType("text/html");  
	     PrintWriter out = response.getWriter();
	     
	     String name = request.getParameter("name");  
	     String password = request.getParameter("password");
	     
	     if(password.equals("ucsy123")){  
	         RequestDispatcher dispatcher = request.getRequestDispatcher("WelcomeServlet");  
	        dispatcher.forward(request, response);  
	   }  
	    else{  
	         out.print("Sorry User Name or Password Error!");  
	         RequestDispatcher dispatcher = request.getRequestDispatcher("/index.html");  
	         dispatcher.include(request, response);                  
	    }  


	}

}



import java.io.IOException;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*; 

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MySevlet
 */
@WebServlet("/MySevlet")
public class MySevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MySevlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
////		response.getWriter().append("Served at: ").append(request.getContextPath());
//		response.setContentType("text/html"); 
//        PrintWriter out = response.getWriter();
//        out.println("<html>");
//        out.println("<head>");
//        out.println("<title>Hello World!</title>");  out.println("</head>");
//        out.println("<body>");
//        out.println("<h1>Hello World!</h1>");
//        out.println("</body>"); 
//        out.println("</html>");
		
            response.setContentType("text/html");
            PrintWriter pwriter = response.getWriter();
            ServletContext scontext = getServletContext();
            String name = scontext.getInitParameter("uname");
		    pwriter.println("User Name in Servlet 1 :" + name); 
		    pwriter.close();


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

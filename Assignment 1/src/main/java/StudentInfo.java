

import java.io.IOException;
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
 * Servlet implementation class StudentInfo
 */
@WebServlet("/StudentInfo")
public class StudentInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		   response.setContentType("text/html");      
		   PrintWriter out = response.getWriter();  
		   out.print("<ul>\n" +
		 "<li>Roll No.: YKPT - " + request.getParameter("rollNum") + "\n" +  
		 "<li>Name: " + request.getParameter("name") + "\n" +  
		 "<li>Email: " + request.getParameter("email") + "\n" +  "</ul>\n");
		}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Square
 */
@WebServlet("/Square")
public class Square extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Square() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		   response.setContentType("text/html");     
		   String lengthParam = request.getParameter("length");
		   
		   if (lengthParam != null && !lengthParam.isEmpty()) {
		        try {
		            // Convert the length parameter to a double
		            double length = Double.parseDouble(lengthParam);

		            // Calculate area and perimeter
		            double area = length * length;
		            double perimeter = 4 * length;

		            // Prepare the HTML response
		            PrintWriter out = response.getWriter();
		            out.print("<html><body>");
		            out.print("<ul>");
		            out.print("<li>Area: " + area + "</li>");
		            out.print("<li>Perimeter: " + perimeter + "</li>");
		            out.print("</ul>");
		            out.print("</body></html>");

		        } catch (NumberFormatException e) {
		            // Handle the case where the length parameter is not a valid number
		            response.getWriter().println("Invalid length parameter.");
		        }
		    } else {
		        // Handle the case where the length parameter is missing
		        response.getWriter().println("Missing length parameter.");
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

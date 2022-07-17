package webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Browser sends Http Request to Web Server
 * 
 * Code in Web Server => Input:HttpRequest, Output: HttpResponse
 * JEE with Servlets
 * 
 * Web Server responds with Http Response
 */

//Java Platform, Enterprise Edition (Java EE) JEE6

//Servlet is a Java programming language class 
//used to extend the capabilities of servers 
//that host applications accessed by means of 
//a request-response programming model.

//1. extends javax.servlet.http.HttpServlet
//2. @WebServlet(urlPatterns = "/login.do")
//3. doGet(HttpServletRequest request, HttpServletResponse response)
//4. How is the response created?

@WebServlet(urlPatterns = "/log.do")
public class LoginServlet extends HttpServlet {
	
	private UserValidation serv = new UserValidation();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException ,IOException {
//		request.setAttribute("name", request.getParameter("name"));
//		request.setAttribute("password", request.getParameter("password"));
		
		request.getRequestDispatcher("/WEB-INF/view/log.jsp").forward(request, response);
		
		
//		out.println("<html>");
//		out.println("<head>");
//		out.println("<title>Yahoo</title>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("My First Servlet");
//		out.println("</body>");
//		out.println("</html>");
//		out.println("Hola");

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException ,IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");

		boolean isUservalid = serv.isUservalid(name, password);
		
		if(isUservalid) {
		request.setAttribute("name", name);
		request.setAttribute("password", password);
		
		request.getRequestDispatcher("/WEB-INF/view/post.jsp").forward(request, response);
		}
		else {
			request.setAttribute("errorMessage", "Invalid Credentials!!");
			request.getRequestDispatcher("/WEB-INF/view/log.jsp").forward(request, response);

		}
		

		
	}

}
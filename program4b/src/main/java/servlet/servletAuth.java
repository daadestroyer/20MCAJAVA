package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servletAuth
 */
@WebServlet(urlPatterns = "/servletAuth", initParams = @WebInitParam(name = "rvce", value = "rvce"))
public class servletAuth extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public servletAuth() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		PrintWriter pw = response.getWriter();
		ServletConfig sc = getServletConfig();
		String pass = sc.getInitParameter("rvce");
		String uname = request.getParameter("uname");
		String upass = request.getParameter("upass");
		
		if(uname.equalsIgnoreCase("rvce") && upass.equalsIgnoreCase(pass)) {
			out.println("<center><h1 style='margin-top:300px;'>username and password is valid</h1></center>");
		}
		else {
			out.println("<center><h1 style='margin-top:300px;'>username and password is invalid</h1></center>");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

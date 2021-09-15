package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class webrefresh
 */
@WebServlet("/webrefresh")
public class webrefresh extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;

	double price1;
	double price2;
	public webrefresh() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void init() {
		// Reset hit counter.
		  price1 = 13.234;
		  price2 = 12.321;	
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		response.setIntHeader("Refresh", 1);

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		price1 = price1 * 2;
		price2 = price2 * 2;
		
		String title = "Auto page refresh using Servlet";
		out.println("<html>");
		out.println("<body style='margin-top:30px;'>");
		out.println("<center><h2>Auto page refresh</h2></center>");
		out.println("<center>" + title + "</center>");
		out.println("<table border='1px' style='margin-left:700px;margin-top:40px;'> ");

		out.println("<tr>");
		out.println("<th style='padding: 10px;'>Current Time</th>");
		out.println("<td  colspan='2'style='padding: 10px;' >" + dateFormat.format(date) + "</td>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<th style='padding: 5px;'>Stocks</th>");
		out.println("<th colspan='2' style='padding: 5px;'>Price</th>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<td style='padding: 5px;text-align:center;'>" + price1++ + "</td>");
		out.println("<center><td style='padding: 5px;text-align:center;'>" + price2++ + "</td></center>");
		out.println("</tr>");

		out.println("</table>");
		out.println("<body>");
		out.println("");

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

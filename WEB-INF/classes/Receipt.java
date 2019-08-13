import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Receipt extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("<h1 align='center'>Receipt</h1>");
		out.println("<br><br>");
		out.println("<p> your order is sucessfull</p>");
		out.close();
	}
}


import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Wallet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
        try{
        	String name=request.getParameter("wall");
        	String password=request.getParameter("pass");
        	if(password.equals("1234")){	
                request.getRequestDispatcher("link.html").include(request, response);  
        		RequestDispatcher rd=request.getRequestDispatcher("Receipt");
        		rd.forward(request,response);
        		
        	}
        	else{
        		out.println("<font color='red'><b>password is incorrect</b></font>");
        		RequestDispatcher rd=request.getRequestDispatcher("wallet.html");
        		rd.include(request,response);
        	}
        }finally{
        	out.close();
        }
    }
}
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Cart extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		int pendrive=Integer.parseInt(request.getParameter("pendrive"));
		int laptop=Integer.parseInt(request.getParameter("laptop"));
		int mobile=Integer.parseInt(request.getParameter("mobile"));
		try{
		String pendrive1=request.getParameter("pendrive1");
		String laptop1=request.getParameter("laptop1");
		String mobile1=request.getParameter("mobile1");
		int a=499;
		int b=19999;
		int c=9999;
		if(pendrive1=="null"){
			out.println("");
		}
		else{
		
		out.println("<h1>pendrive</h1>"+pendrive*a);
	}

	
		out.println("<h1>laptop</h1>"+laptop*b);
		out.println("<h1>mobile</h1>"+mobile*c);
        out.println("<h1>total</h1>"+(pendrive*a+laptop*b+mobile*c));
        out.println(
        	"<form method='Post' action='wallet.html'>");
        out.println("<input type='submit' valut='submit'>");
    }finally{
	out.close();
}
	} 
}
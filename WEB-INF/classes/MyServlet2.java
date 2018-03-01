
import java.io.*;
import java.util.*;
import javax.servlet.*;


public class MyServlet2 extends GenericServlet{

	  public void service(ServletRequest req,ServletResponse resp)
	  throws ServletException ,IOException{
	  
     //request getParameter	  
	  
	     String p1  =  req.getParameter("user_name");
	     String p2  =  req.getParameter("user_age");
		 
		 
		 ServletConfig conf  = getServletConfig();
	  String  mousePrice = conf.getInitParameter("mouse");
	  String  keyboardPrice = conf.getInitParameter("keyboard");
		 
		 
	  
	  	StringBuffer htmlCode  = new StringBuffer();

		 htmlCode.append("<html>");
		 htmlCode.append("<body>");
		 htmlCode.append("<h1>p1= "+p1+"</h1>");
		 htmlCode.append("<h1>p2= "+p2+"</h1>");
		 htmlCode.append("<hr>");
		 htmlCode.append("<h1>mouse price = "+mousePrice+"</h1>");
		 htmlCode.append("<h1>keyboard price = "+keyboardPrice+"</h1>");
		 htmlCode.append("</html>");

		 resp.setContentType("text/html");
		 resp.getWriter().print(htmlCode);
		
	  
	}  


}


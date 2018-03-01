
import java.io.*;
import java.util.*;
import javax.servlet.*;


public class MyServlet1 extends GenericServlet{

	  public void service(ServletRequest req,ServletResponse resp)
	  throws ServletException ,IOException{
	  
     //request getParameter	  
	  
	     String p1  =  req.getParameter("user_name");
	  
	  //get init pararm
	  ServletConfig conf  = getServletConfig();
	  String  ip1 = conf.getInitParameter("topic1");
	  String  ip2 = conf.getInitParameter("topic2");
	  String  ip3 = conf.getInitParameter("topic3");
	  
	  
	  
	  
	  
	  	StringBuffer htmlCode  = new StringBuffer();

		 htmlCode.append("<html>");
		 htmlCode.append("<body>");
		 htmlCode.append("<h1>p1= "+p1+"</h1>");
		 
		 
		 htmlCode.append("<hr>");
	
	htmlCode.append("init param 1 = " +ip1+"<br>");
	htmlCode.append("init param 2 = " +ip2+"<br>");
	htmlCode.append("init param 3 = " +ip3+"<br>");
		 
		 
   String  keyboardPrice = conf.getInitParameter("keyboard");
	htmlCode.append("init keyboard price  = " +keyboardPrice+"<br>");
		 
		 
		 htmlCode.append("</body>");
		 htmlCode.append("</html>");

		 resp.setContentType("text/html");
		 resp.getWriter().print(htmlCode);
		
	  
	}  


}


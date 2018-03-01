
import java.io.*;
import java.util.*;
import javax.servlet.*;


public class MyServlet3 extends GenericServlet{

	  public void service(ServletRequest req,ServletResponse resp)
	  throws ServletException ,IOException{
	  
	   //how to get context paramter
		ServletContext cntx  = getServletContext();
		
		String pName  = cntx.getInitParameter("project_name");
		String url  = cntx.getInitParameter("db_url");
		String driverClass  = cntx.getInitParameter("driver_class_name");
	  
	  
	  
	  	StringBuffer htmlCode  = new StringBuffer();

		 htmlCode.append("<html>");
		 htmlCode.append("<body>");
		 htmlCode.append("<h1>Service3</h1>");
		 
		 htmlCode.append("<h1>"+pName+"</h1>");
		 htmlCode.append("<h1> driver class"+driverClass+"</h1>");
		 htmlCode.append("<h1> url "+url+"</h1>");
		 
		  
		 htmlCode.append("</body>");
		 htmlCode.append("</html>");

		 resp.setContentType("text/html");
		 resp.getWriter().print(htmlCode);
		
	  
	}  


}


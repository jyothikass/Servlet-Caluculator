package servlets_demo;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class Division
 */
public class Division extends GenericServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		System.out.println(" helloo ge");
		
		

		double n1=Double.parseDouble(request.getParameter("num1"));
		int n2=Integer.parseInt(request.getParameter("num2"));
		
		response.getWriter().print("<h1>The sub of "+n1+"and "+n2+" is "+(n1/n2)+"</h1>");
		
	}

}

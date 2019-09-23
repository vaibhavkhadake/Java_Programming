import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class AddServlet extends HttpServlet
{

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
	{
		
		int number1=Integer.parseInt(request.getParameter("number1"));
		int number2=Integer.parseInt(request.getParameter("number2"));
		
		
		int result=number1+number2;
		
//		PrintWriter printWriter=response.getWriter();
//		printWriter.println("Result is "+result);
		request.setAttribute("result", result);
		
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("square");
		requestDispatcher.forward(request, response);
		
		 
		//System.out.println("Result is "+result);
	}
	
}

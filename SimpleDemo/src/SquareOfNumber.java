import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class SquareOfNumber  extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse responce) throws IOException
	{
		
		int result=(int) request.getAttribute("result");
		
		result=result*result ;
		responce.getWriter().println(result);
		
	}

}

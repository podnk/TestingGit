package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SelectServlet extends ForwardServlet
{
	private static final long serialVersionUID = -5826735542762688442L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException
	{
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException
	{
		if(req.getParameter("enter") != null)
		{
			super.forward("/accountPage.jsp", req, resp);
		}
		else if (req.getParameter("register") != null)
		{
			super.forward("/registerPage.jsp", req, resp);
		}
	}
}

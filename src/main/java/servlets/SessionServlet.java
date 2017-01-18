package servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionServlet extends HttpServlet
{
	private static final long serialVersionUID = -3650451697995446344L;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
		HttpSession session = request.getSession();	
		
		String loginLog = (String) request.getAttribute("loginLog");
		
		session.setAttribute("loginLog", loginLog);
				
		RequestDispatcher dispatcher = request.getRequestDispatcher("showSession.jsp");
		dispatcher.forward(request, response);
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
		super.doPost(request, response);
	}

}

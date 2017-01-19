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
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		HttpSession session = req.getSession();	
		
		String loginLog = (String) req.getParameter("loginLog");
		String passwordLog = (String) req.getParameter("passwordLog");
		
		session.setAttribute("loginLog", loginLog);
		session.setAttribute("passwordLog", passwordLog);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("showSession.jsp");
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		super.doPost(req, resp);
	}

}

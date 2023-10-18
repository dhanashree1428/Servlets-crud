package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class HomeController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String save = req.getParameter("save");
		String delete = req.getParameter("delete");
		String update = req.getParameter("update");
		String getbyid = req.getParameter("getid");
		String getall = req.getParameter("getall");
		
		if(save != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("save.jsp");
			requestDispatcher.forward(req, resp);
		}else
			if(delete != null) {
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("delete.jsp");
				requestDispatcher.forward(req, resp);
			}else
				if(update != null) {
					RequestDispatcher requestDispatcher = req.getRequestDispatcher("update.jsp");
					requestDispatcher.forward(req, resp);
				}else
					if(getbyid != null) {
						System.out.println("write a code to dispatch to getid form");
					}else
						if(getall != null) {
							RequestDispatcher requestDispatcher = req.getRequestDispatcher("getall.jsp");
							requestDispatcher.forward(req, resp);
			
						}
		
	}
}


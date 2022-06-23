package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.daoImpl.UserDaoImpl;
import com.db.DBConnection;
import com.model.User;

import comdao.UserDao;

/**
 * Servlet implementation class UserRegistartion
 */
@WebServlet("/user_register")
public class UserRegistartion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserRegistartion() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String fullName = request.getParameter("fullName");
			String password = request.getParameter("password");
			String email = request.getParameter("email");
			User u = new User(fullName, email, password);
			UserDao userDao = new UserDaoImpl(DBConnection.getConnection());
			boolean f = userDao.userRegistration(u);
			HttpSession session = request.getSession();

			if (f) {
				session.setAttribute("succMsg", "Registration Successfully");
				response.sendRedirect("user_signup.jsp");
			} else {
				session.setAttribute("errorMsg", "Something went wrong on server");
				response.sendRedirect("user_signup.jsp");
			}
		} catch (Exception e) {
			System.out.println("Error : " + e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

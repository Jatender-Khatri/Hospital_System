package com.servlet.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.User;

/**
 * Servlet implementation class AdminLogin
 */
@WebServlet("/adminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminLogin() {
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
			String email = request.getParameter("email");
			String password = request.getParameter("password");

			HttpSession session = request.getSession();

			if ("kumarjatender0@gmail.com".equals(email) && "jatender123".equals(password)) {
				session.setAttribute("adminObj", new User());
				response.sendRedirect("admin/index.jsp");
			} else {
				session.setAttribute("errorMsg", "Invalid username or password");
				response.sendRedirect("admin_login.jsp");
			}
		} catch (Exception e) {
			// TODO: handle exception
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

package com.sapient.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EligibleServlet
 */
public class EligibleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EligibleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int age = Integer.parseInt(request.getParameter("txtage"));
		String qual = request.getParameter("txtqual");
		
		String res ="not eligible";
		if(age >= 20 && age <= 22 && (qual.equals("be") || qual.equals("btech")))
			res = "eligible";
		request.setAttribute("result", res);
		PrintWriter out = response.getWriter();
		out.println("<h1> sapient technologies</h1>");
		RequestDispatcher rd = request.getRequestDispatcher("EligibleResult.jsp");
		rd.include(request, response);
		out.println("<h1>thank you</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

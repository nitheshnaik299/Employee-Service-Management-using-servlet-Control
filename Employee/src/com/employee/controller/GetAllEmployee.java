package com.employee.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.employee.model.Emplyee;
import com.employee.service.EmployeeServiceImpl;

/**
 * Servlet implementation class GetAllEmployee
 */
@WebServlet("/getallemployee")
public class GetAllEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAllEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		EmployeeServiceImpl es = new EmployeeServiceImpl();
		es = new EmployeeServiceImpl();
		List<Emplyee> empList = null;
		try {
			empList = es.display();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HttpSession ssn = request.getSession();
		ssn.setAttribute("emplArr", empList);
		response.sendRedirect("Viewall.jsp");
		
	}

}

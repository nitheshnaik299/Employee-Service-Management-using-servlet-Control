package com.employee.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.employee.model.Emplyee;
import com.employee.service.EmployeeServiceImpl;

/**
 * Servlet implementation class GetEmployee
 */
@WebServlet("/getemployee")
public class GetEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		EmployeeServiceImpl es=new EmployeeServiceImpl();
		Emplyee emp=new Emplyee();
		String empid=request.getParameter("empid");
		Emplyee emp1;
		emp.setEmpId(empid);
		try {
			emp1=es.getEmployee(empid);
			HttpSession ssn=request.getSession();
			ssn.setAttribute("empid", empid);
			ssn.setAttribute("ename", emp1.getEmpName());
			ssn.setAttribute("Dob", emp1.getDob());
			ssn.setAttribute("sal", emp1.getBasicsalary());
			response.sendRedirect("Showdata.jsp");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

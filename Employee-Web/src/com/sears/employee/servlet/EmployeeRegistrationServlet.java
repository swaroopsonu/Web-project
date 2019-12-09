package com.sears.employee.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sears.employee.bean.EmployeeBean;
import com.sears.employee.dao_layer.EmployeeDao;

@WebServlet("/EmployeeRegistrationServlet")
public class EmployeeRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EmployeeRegistrationServlet() {
		super();

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		PrintWriter pw = response.getWriter();

		EmployeeDao EmployeeDaoObj = new EmployeeDao();
		EmployeeBean EmployeeBeanObj = new EmployeeBean();

		EmployeeBeanObj.setEmpId(request.getParameter("Empid"));
		EmployeeBeanObj.setName(request.getParameter("EmpName"));
		EmployeeBeanObj
				.setAge(Integer.parseInt(request.getParameter("EmpAge")));
		EmployeeBeanObj.setGender(request.getParameter("gender"));
		EmployeeBeanObj.setFTE(request.getParameter("isFte"));
		EmployeeBeanObj.setSalary(Integer.parseInt(request
				.getParameter("salary")));

		// RequestDispatcher
		// RequestDispatcherObj=request.getRequestDispatcher("reg1");
		// RequestDispatcherObj.forward(request, response);

		if (EmployeeDaoObj.setRegisterService(EmployeeBeanObj)) {
			pw.println("Registration Successful");
		} else
			pw.println("Not Successful");

	}

}

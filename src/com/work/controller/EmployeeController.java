package com.work.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.work.dao.EmployeeDAO;
import com.work.dao.EmployeeDAOimplement;
import com.work.entity.Employee;


public class EmployeeController extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	
	RequestDispatcher dispatcher = null;

	//CREATE A REF VARIABLE FOR EmployeeDAO.
	EmployeeDAO employeeDAO = null;

	//CREATE CONSTRUCTOR AND INITIALIZE EmployeeDAO.
	public EmployeeController()
	{
		employeeDAO = new EmployeeDAOimplement();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int  id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("fname");
		String dob = request.getParameter("dob");
		String role = request.getParameter("designation");
		Employee employee = new Employee();
		employee.setId(id);
		employee.setName(name);
		employee.setDob(dob);
		employee.setDepartment(role);
		if(employeeDAO.save(employee))
		{
			request.setAttribute("message", "Save successfully!!");
		}

		//GET THE REQUEST DISPATCHER.
		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/employee_list.jsp");

		//FORWARD THE REQUEST AND RESPONSE OBJECTS.
		dispatcher.forward(request, response);
	}
	
	

}

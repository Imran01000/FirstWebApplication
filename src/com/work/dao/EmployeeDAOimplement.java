package com.work.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.work.entity.Employee;
import com.work.util.DBconnection;

public class EmployeeDAOimplement implements EmployeeDAO 
{

	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;
	
	@Override
	public List<Employee> get() 
	{
		//CREATE REFRENCE VARIABLE.
		List<Employee> list = null;
		Employee employee = null;
		
		try
		{
			list = new ArrayList<Employee>();
			
			//CREATE SQL QUERY.
			String query = "SELECT * FROM table_employee";
			
			//GET THE DATABASE CONNECTION.
			connection = DBconnection.openConecction();
			
			//CREATE A STATEMENT.
			Statement statement = connection.createStatement(); 
			
			//EXECUTE THE EXECUTE QUERY.
			resultSet = statement.executeQuery(query);
			
			//PROCESS THE resultSet.
			while(resultSet.next())
			{
				employee = new Employee();
			//	employee.setId(resultSet.getInt("id"));
				employee.setName(resultSet.getString("name"));
				employee.setDob(resultSet.getString("dob"));
				employee.setDepartment(resultSet.getString("department"));
				list.add(employee);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		//RETURN LIST>
		return list;
	}

}

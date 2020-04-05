package com.work.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
	PreparedStatement preparedStatement = null;
	
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

	@Override
	public boolean save(Employee e) {
		boolean flag = false;
		try
		{
			String query = "INSERT INTO public.table_employee(user_id, name, dob, department)"
					+ "	VALUES ('"+e.getId()+"','"+e.getName()+"', '"+e.getDob()+"', '"+e.getDepartment()+"');";
			connection = DBconnection.openConecction();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.executeUpdate();
			flag = true;
			
		}
		catch (SQLException e1) 
		{
			e1.printStackTrace();
		}
		return flag;
	}

}

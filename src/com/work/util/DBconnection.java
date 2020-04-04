package com.work.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection 
{
	//DEFINE THE DATABASE PROPERTIES.
	private static final String URL = "jdbc:postgresql://localhost:8080/Employee_db";
	private static final String DRIVER = "org.postgresql.Driver";
	private static final String USERNAME = "postgres";
	private static final String PASSWORD = "Imran1996";
	private static Connection connection = null;
	
	//DEFINE STATIC METHOD.
	public static Connection openConecction()
	{
		//CHECK THE CONNECTION.
		if(connection != null)
		{
			return connection;
		}
		else
		{
			try
			{
				//LOAD THE DRIVER.
				Class.forName(DRIVER);
				
				//GET THE CONNECTION.
				connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			//RETURN THE CONNECTION.
			return connection;
		}
	}
}

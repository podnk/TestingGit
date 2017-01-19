package main;

import java.sql.ResultSet;
import connection.DBConnection;

public class Main
{
	public static void main(String[] args)
	{
		String url = "jdbc:postgresql://127.0.0.1:5432/postgres";
		
		DBConnection conn = new DBConnection(url, "postgres", "");
		conn.init();
		
		try
		{
			ResultSet resultSet = conn.query("SELECT * FROM employees");
			
			while(resultSet.next())
			{
				System.out.println(resultSet.getString("name"));
			}
		} 
		catch (Exception e){}
	}
}

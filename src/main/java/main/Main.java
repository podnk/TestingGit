package main;

import java.util.Properties;

import connection.DBConnection;

public class Main
{
	public static void main(String[] args)
	{
		String url = "jdbc:postgresql://localhost:5432/postgres";
		
		Properties properties = new Properties();		
		properties.setProperty("user", "");
		properties.setProperty("password", "");
		properties.setProperty("characterEncoding", "UTF-8");
		properties.setProperty("useUnicode", "true");
		
		System.out.println("URL: " + url);
		
		DBConnection dbConnection = new DBConnection(url, properties);
		dbConnection.init();
		dbConnection.query("select * from eployees");
	}
}

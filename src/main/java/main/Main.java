package main;

import connection.DBConnection;

public class Main
{
	public static void main(String[] args)
	{
		DBConnection dbConnection = new DBConnection(
				"localhost:5432", "postgres", "postgres", "postgres");
	}
}

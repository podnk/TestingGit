package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBConnection 
{
	private String url;
	private String name;
	private String password;
	
	private Connection connection;
	private Properties properties = new Properties();
	
	public DBConnection(Properties properties)
	{
		this.properties = properties;
	}
	
	public DBConnection(String url, String name, String password)
	{
		this.url = url;
		this.name = name;
		this.password = password;
	}
	
	public void init()
	{
		try
		{
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(url, name, password);
		}
		catch(ClassNotFoundException cnfe){}
		catch (SQLException sqle){}
	}
	
	public void closeConnection()
	{ 
		try
		{ 
			connection.close(); 
		}
		catch (Exception ex){} 
	}
	
	public ResultSet query(String sqlExecute)
	{
		ResultSet result = null;
		try
		{
			Statement statement = connection.createStatement();
			result = statement.executeQuery(sqlExecute);
		}
		catch (SQLException ex){}
		return result;
	}
	
	public void updateQuery(String sqlUpdate)
	{
		try
		{
			Statement statement = connection.createStatement();
			statement.executeUpdate(sqlUpdate);
		}
		catch (SQLException ex){}
	}
}

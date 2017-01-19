package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBConnection 
{
	private String host; 		private String user; 
	private String password; 	private String nameDB;
	private String url;
	
	private Properties properties = new Properties();
	private Connection postgresConnection;
	
	public DBConnection(String host, String user, String password, String nameDB)
	{
		this.host = host;
		this.user = user;
		this.password = password;
		this.nameDB = nameDB;
	}
	
	public DBConnection(String url, Properties properties)
	{
		this.url = url;
		this.properties = properties;
	}
	
	public void init()
	{
		try
		{
			Class.forName("org.postgresql.Driver");
			postgresConnection = DriverManager.getConnection(url);
		}
		catch(ClassNotFoundException cnfe){}
		catch (SQLException sqle){}
	}
	
	public void initProperties()
	{
		url = "jdbc:postgresql://" + host + "/" + nameDB;
		
		properties.setProperty("user", user);
		properties.setProperty("password", password);
		properties.setProperty("characterEncoding", "UTF-8");
		properties.setProperty("useUnicode", "true");
		
		System.out.println("URL: " + url);
	}
	
	public void closeConnection()
	{
		try{postgresConnection.close();}
		catch (Exception ex){}
	}
	
	public ResultSet query(String queryString)
	{
		ResultSet result = null;
		try
		{
			Statement statement = postgresConnection.createStatement();
			statement.executeQuery(queryString);
		}
		catch (SQLException sqlex){}
		return result;
	}
}

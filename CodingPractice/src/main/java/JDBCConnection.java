import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection {

	public static void main(String [] args)
	{
		System.out.println("Hello");
		
		String url = "jdbc:mysql://127.0.0.1:3306/Business";
		String userName = "root";
		String password = "admin";
		
		try {
			
		
		// 1. Load JDBC Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(url,userName,password);
		
		Statement statement = connection.createStatement();
		
		String query = "select * from customerinfo where Location ='Asia';";
		
		ResultSet resultSet = statement.executeQuery(query);
		
		while(resultSet.next())
		{
			String courseName = resultSet.getString(1);
			String location = resultSet.getString("Location");
			
			System.out.println(courseName + "Location : " + location);
		}
		
		} catch (Exception e) {
			  e.printStackTrace();
		}
	}
	
}

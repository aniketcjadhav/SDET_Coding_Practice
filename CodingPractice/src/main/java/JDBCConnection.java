import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JDBCConnection {

	public static void main(String [] args) throws ClassNotFoundException, SQLException
	{
		
		
		String url = "jdbc:mysql://127.0.0.1:3306/Business";
		String userName = "root";
		String password = "admin";
		Random random = new Random();
		
		
		List<Customer> customerList = new ArrayList<>();
		String[] courses = {
	            "Java Programming",
	            "Python Programming",
	            "Web Development",
	            "Data Science",
	            "Machine Learning",
	            "Database Management",
	            "Cloud Computing",
	            "Cyber Security"
	        };
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(url,userName,password);
		
		try {
			
		
		//Load JDBC Driver
		
		Statement statement = connection.createStatement();
		
		
		//Retrive Data from Table
		String query = "select * from customerinfo where Location ='Asia';";
		
		ResultSet resultSet = statement.executeQuery(query);
		
		
		while(resultSet.next())
		{
			String courseName = resultSet.getString(1);
			String Date = resultSet.getString(2);
			int Amount = resultSet.getInt(3);
			String location = resultSet.getString("Location");
			
			customerList.add(new Customer(courseName, Date, Amount, location));
		}
		
		} catch (Exception e) {
			  e.printStackTrace();
		}
		
		//Print All Results
		
		for(Customer c :customerList)
		{
			System.out.println(c.getCourseName() +"  "+ c.getDate() +"  "+ c.getAmount() +"  "+c.getLocation());
			
		}
		
		
		//Insert Data Into Table
		int index = random.nextInt(customerList.size());
		String courseName = courses[index];
		
		String insertSQL = "INSERT INTO CustomerInfo VALUES (?, CURRENT_DATE(), ?, ?)";
		
		try {
			
			PreparedStatement pStatement = connection.prepareStatement(insertSQL);
		    pStatement.setString(1, courseName);
		    pStatement.setInt(2, random.nextInt(100));
		    pStatement.setString(3, "Africa");

		    pStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}


public class Customer {

	String CourseName;
	String Date;
	int Amount;
	String Location;
	
	
	public Customer(String courseName, String date, int amount, String location) {
		
		CourseName = courseName;
		Date = date;
		Amount = amount;
		Location = location;
	}


	public String getCourseName() {
		return CourseName;
	}


	public void setCourseName(String courseName) {
		CourseName = courseName;
	}


	public String getDate() {
		return Date;
	}


	public void setDate(String date) {
		Date = date;
	}


	public int getAmount() {
		return Amount;
	}


	public void setAmount(int amount) {
		Amount = amount;
	}


	public String getLocation() {
		return Location;
	}


	public void setLocation(String location) {
		Location = location;
	}
	
	
	
}

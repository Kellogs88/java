import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class jdbcTest {
	
	public static void main(String args[]) {
		
		Connection myConn = null;
		Statement mystmt = null;
		ResultSet myRs = null;
		
		try {
			//1.Get a connection to dataBase
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?useTimezone=true&serverTimezone=UTC", "student", "student");
			
			System.out.println("Database connection successful!\n");
			
			//2.Create a statement
			mystmt = myConn.createStatement();
			
			//3.Execute SQL query
			myRs = mystmt.executeQuery("select * from employees");
			
			//4.process the result set
			while (myRs.next()) {
				System.out.println(myRs.getString("last_name") + ", " + myRs.getString("last_name"));
				
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

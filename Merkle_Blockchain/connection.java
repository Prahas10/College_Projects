package end_sem3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {
	static Connection con = null;
	 
    public static Connection connectDB()
 
    {
    String url = "jdbc:mysql://localhost:3306/blockchain";
    String username = "root";
    String password = "Prahas@12319";{
    
    try{
		Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password); // creating the connection between the compiler and sql database

        return con;
        }
    catch (SQLException e) {
    	 
        System.out.println(e);
    } catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	return con;
}
}

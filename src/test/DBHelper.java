package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {

	static String dbURL = "jdbc:mysql://localhost:3306/test";
	static String username = "root";
	static String password = "admin";
	
	
	static Connection getConnection() {
		
		try {
			return DriverManager.getConnection(dbURL, username, password);
		}catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	
		return null;
	}
		
}

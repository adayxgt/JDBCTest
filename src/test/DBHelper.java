package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class DBHelper {

	String dbURL = "jdbc:mysql://localhost:3306/test";
	String username = "root";
	String password = "1980103cve";
	
	
	Connection getConnection() {
		
		try {
			return DriverManager.getConnection(dbURL, username, password);
		}catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
		return null;
}

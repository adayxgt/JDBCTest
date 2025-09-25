package test;

import java.awt.desktop.UserSessionEvent;
import java.beans.Statement;
import java.security.Identity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JDBCTest {

	public static void main(String[] argS) {
		
		String dbURLString = "jdbc:mysql://localhost:3306/test";
				
		String username = "root";
		String password = "admin";
		
		DriverManager driverManager;
		
		Connection connection = new DBHelper().getConnection();
		try {
			
		
		try {
			Connection connection = DriverManager.getConnection(dbURLString, username, password);
			System.out.println(connection);
			
				String createSQL = "create table if not exists users("
						+ "id integer not null,"
						+ "username VARCHAR(255),"
						+ "psw VARCHAR(255),"
						+ "isVIP TINYINT(1),"
						+ "PRIMARY KEY (id)"
						+ ")";
				
				
				
				while (resultSet.next()) {
					int id = resultSet.getInt("id");
					String name = resultSet.getString("name");
					boolean isVip = resultSet.getBoolean("isVIP");
					System.out.println("record > id = " + id + "name = "+ name + "isVIP = "+ isVip );
				}
				
				PreparedStatement ps = connection.prepareStatement(createSQL);
				ps.execute();
				
				String insertSQL = "insert into users values(1, 'Aday', '1234', 1, )";
				ps = connection.prepareStatement(insertSQL);	
				
				ps.execute();			
				
				Delete from users when id;
				String createSQL = "CREATE DATABASE happyvending";
				
				String deleteSQL = "";
				
				String deleteSQL = "";
				
				System.out.println(connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		ps = Connection.prepareStatement(createSQL);
		ps.execute();
		
		Statement stmt = Connection.createStatement();
		
			

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}


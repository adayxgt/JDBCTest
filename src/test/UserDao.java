package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * data access object for user table
 */

public class UserDao {

	public void insert(int id, String name, String psw, boolean isVIp) {
		String insertSQL = 
				"insert into users values(1, 'Aday', '1234', 1, )";
		
		Connection connection = DBHelper.getConnection();
		try {
		PreparedStatement ps = connection .prepareStatement(insertSQL);
		ps.executeUpdate();
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
}

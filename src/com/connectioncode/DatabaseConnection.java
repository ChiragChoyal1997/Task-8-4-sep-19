package com.connectioncode;
import java.sql.*;
//Private constructor and singleton structure
public class DatabaseConnection {
	private static DatabaseConnection connection=null;
	Connection con ;
	private DatabaseConnection() {
		
	}
	public static DatabaseConnection connect() {
		if(connection == null) {
			connection = new DatabaseConnection();		
		}
		return connection;
	}
	public Connection getCon() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "newuser";
		String password = "user";
		String drivername = "oracle.jdbc.driver.OracleDriver";
		try {
			Class.forName(drivername);
			con = DriverManager.getConnection(url,username,password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	public void closeConnection() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

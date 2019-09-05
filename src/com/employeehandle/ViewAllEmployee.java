package com.employeehandle;

import java.sql.*;


public class ViewAllEmployee {
	public void viewAll(Connection con) {
		String sql = "Select eno, ename, salary from emp";
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"--"+rs.getString(2)+"--"+rs.getInt(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

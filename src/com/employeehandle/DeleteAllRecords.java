package com.employeehandle;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteAllRecords {
	public void deleteAll(Connection con) {
		
		String sql = "delete from emp";
		Statement stmt;
		try {
			stmt = con.createStatement();
			int i = stmt.executeUpdate(sql);
			if(i>0) {
				System.out.println("All records deleted");
			}
			else {
				System.out.println("something went wrong");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	} 
}

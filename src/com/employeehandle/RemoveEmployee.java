package com.employeehandle;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class RemoveEmployee {
	public void remove(Connection con,Scanner sc) {
		
		System.out.println("Enter employee id of employee to remove ");
		int empno = sc.nextInt();
		
		String sql = "delete from emp where eno = "+empno;
		try {
			Statement stmt = con.createStatement();
			int i = stmt.executeUpdate(sql);
			if(i == 1) {
				System.out.println("Employee record has been deleted");
			}
			else {
				System.out.println("Unable to delete record/check employee id again !");
			}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

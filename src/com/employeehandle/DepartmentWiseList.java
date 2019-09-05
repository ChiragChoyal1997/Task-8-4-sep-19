package com.employeehandle;

import java.sql.*;
import java.util.Scanner;

public class DepartmentWiseList {
	public void deptList(Connection con,Scanner sc) {
		System.out.print("Enter department name :-> ");
		String dept = sc.nextLine();
		String sql = "select eno,ename,salary,dept from emp where lower(dept) like lower('"+dept+"%')";
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" - "+rs.getString(2)+" - "+rs.getInt(3)+" - "+rs.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
}

package com.employeehandle;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SalaryChange{
	public void changeSalary(Connection con,Scanner sc) {
		System.out.print("Enter employee id :->");
		int empno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter new salary");
		int newsal = sc.nextInt();
		String sql = "update emp set salary="+newsal+" where eno="+empno;
		try {
			Statement stmt = con.createStatement();
			int i = stmt.executeUpdate(sql);
			if(i == 1) {
				System.out.println("Salary of employee is updated!");
			}
			else {
				System.out.println("Unable to update salary !");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

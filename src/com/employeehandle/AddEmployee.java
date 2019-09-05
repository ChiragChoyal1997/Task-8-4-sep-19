package com.employeehandle;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class AddEmployee {
	public void insert(Connection con,Scanner sc) {
		System.out.println("Insert a new employee in record");
		System.out.print("Enter employee id :-> ");
		int empno = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter employee name :-> ");
		String empname = sc.nextLine();
		System.out.print("Enter employee salary :-> ");
		int sal = sc.nextInt();
		try {
			CallableStatement cs = con.prepareCall("{call employee.insert_employee(?,?,?)}");
			cs.setInt(1, empno);
			cs.setString(2, empname);
			cs.setInt(3, sal);
			int i = cs.executeUpdate();
			if(i == 1) {
				System.out.println("Emloyee record inserted !");
			}
			else {
				System.out.println("Emloyee record not inserted !");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

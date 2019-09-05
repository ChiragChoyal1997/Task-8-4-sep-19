package com.employee.sort;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class SortBy {
	public void sortBy(Connection con,int option,Scanner sc) {
		
		int choice = 1;
		System.out.println("Which way Ascending or Descending");
		System.out.println("----------------------------------");
		System.out.println("1. Ascending");
		System.out.println("2. Descending");
		System.out.println("----------------------------------");
		System.out.println("Enter your choice");	
		choice = sc.nextInt();
		String sql = null;
		switch (choice) {
		case 1:
			switch (option) {
				case 1:
					 sql = "Select eno,ename,salary,dept from emp order by eno";
					 SortBy.executeSql(con,sql);
					break;
				case 2:
					sql = "Select eno,ename,salary,dept from emp order by ename";
					SortBy.executeSql(con,sql);
					break;
				case 3:
					sql = "Select eno,ename,salary,dept from emp order by salary";
					SortBy.executeSql(con,sql);
					break;
				case 4:
					sql = "Select eno,ename,salary,dept from emp order by dept";
					SortBy.executeSql(con,sql);
					break;
				default:
					break;
			}
			break;
		case 2:
			switch (option) {
			case 1:
				sql = "Select eno,ename,salary,dept from emp order by eno desc";
				SortBy.executeSql(con,sql);
				break;
			case 2:
				sql = "Select eno,ename,salary,dept from emp order by ename desc";
				SortBy.executeSql(con,sql);
				break;
			case 3:
				sql = "Select eno,ename,salary,dept from emp order by salary desc";
				SortBy.executeSql(con,sql);
				break;
			case 4:
				sql = "Select eno,ename,salary,dept from emp order by dept desc";
				SortBy.executeSql(con,sql);
				break;
			default:
				break;
			}
			break;
		default:
			break;
		}
	}
	public static void executeSql(Connection con,String sql) {
		
		try {
			Statement stmt  = con.createStatement();
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

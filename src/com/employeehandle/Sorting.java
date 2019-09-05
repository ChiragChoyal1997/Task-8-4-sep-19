package com.employeehandle;

import java.sql.Connection;
import java.util.Scanner;

import com.employee.sort.SortBy;

public class Sorting {
	public void sortEmployee(Connection con,Scanner sc) {
		
		int option = 1;
		
		while(option >= 1 && option<=4 ) {
		System.out.println("Sort By");
		System.out.println("----------------------------");
		System.out.println("1. Employee Id");
		System.out.println("2. Employee Name");
		System.out.println("3. Employee Salary");
		System.out.println("4. Employee Department");
		System.out.println("---------------------------");
		System.out.print("Enter your choice :-> ");
		option = sc.nextInt();
		SortBy sb = new SortBy();
		switch (option) {
		case 1:
			sb.sortBy(con,option,sc);
			break;
		case 2:
			sb.sortBy(con,option,sc);
			break;
		case 3:
			sb.sortBy(con,option,sc);
			break;
		case 4:
			sb.sortBy(con,option,sc);
			break;
		default:
			System.out.println("Exited from sorting menu");
			break;
		}
		}
	}
}

package com.employeehandle;

import java.sql.Connection;
import java.util.Scanner;

import com.employee.search.SearchBy;
public class SearchEmployee {
	public void search(Connection con,Scanner sc) {
		int option = 1;
		while(option >= 1 && option <= 2) {
		System.out.println("=================================");
		System.out.println("By what you want to search ?");
		System.out.println("------------------------------");
		System.out.println("1. Employee Id");
		System.out.println("2. Employee Name");
		System.out.println("------------------------------");
		System.out.print("Enter your choice :-> ");
		option = sc.nextInt();
		SearchBy sid = new SearchBy();
				switch (option) {
				case 1:
					sid.searchBy(con,option,sc);
					break;
				case 2:
					sid.searchBy(con,option,sc);
					break;
				default:
					System.out.println("Exited from search menu");
					break;
				}
		}
	}
}

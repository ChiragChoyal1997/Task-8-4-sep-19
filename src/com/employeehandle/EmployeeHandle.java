package com.employeehandle;

import java.sql.Connection;
import java.util.Scanner;

import com.connectioncode.DatabaseConnection;

public class EmployeeHandle {
	public static void main(String args[]) {
		DatabaseConnection connection = DatabaseConnection.connect();
		Connection con = connection.getCon();
		Scanner newsc= new Scanner(System.in);
		int choice = 1;
		while(choice >= 1 && choice <=8){
		System.out.println("==============================");
		System.out.println("Welcome to dashboard");
		System.out.println("------------------------------");
		System.out.println("1. Add Employee");
        System.out.println("2. View All Employee");
        System.out.println("3. Remove Employee");
        System.out.println("4. Clear Data");
        System.out.println("5. Change Salary");
        System.out.println("6. Search Employee");
        System.out.println("7. View dept-wise-list");
        System.out.println("8. Sorting");
        System.out.println("9. Exit");
		System.out.println("==============================");
		System.out.print("Enter your choice :-> ");
		choice = newsc.nextInt();
		
		switch(choice){
		        case 1:
		        {
		        	AddEmployee e = new AddEmployee();
		        	e.insert(con,newsc);
		            break;
		        }
		        case 2:
		        {
		        	ViewAllEmployee v = new ViewAllEmployee();
		        	v.viewAll(con);
		            break;
		        }
		        case 3:
		        {
		        	RemoveEmployee rm = new RemoveEmployee();
		        	rm.remove(con,newsc);
		            break;
		        }
		        case 4:
		        {
		        	DeleteAllRecords dr = new DeleteAllRecords();
		        	dr.deleteAll(con);
		            break;
		        }
		        case 5:
		        {
		        	SalaryChange s = new SalaryChange();
		        	s.changeSalary(con,newsc);
		            break;
		        }
		        case 6:
		        {
		        	SearchEmployee se = new SearchEmployee();
		        	se.search(con,newsc);
		            break;
		        }
		        case 7:
		        {
		            DepartmentWiseList dwl = new DepartmentWiseList();
		            dwl.deptList(con,newsc);
		            break;
		        }
		        case 8:
		        {
		        	Sorting s = new Sorting();
		        	s.sortEmployee(con,newsc);
		        	break;
		        }
		        default:
		        {
		        	connection.closeConnection();
		        	System.out.println("Gave wrong input");
		            System.out.println("BYE - BYE");
		            break;            
		        }
		    }
		}
		newsc.close();
	}
}

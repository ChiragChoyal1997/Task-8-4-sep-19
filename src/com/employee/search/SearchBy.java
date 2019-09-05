package com.employee.search;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class SearchBy{
	public void searchBy(Connection con,int option,Scanner sc) {
		try {
			CallableStatement cs = con.prepareCall("{? = call employee.search_employee(?)}");
			switch (option) {
			case 1:
				System.out.print("Enter employee id :-> ");
				int id = sc.nextInt();
				cs.setInt(2, id);
				break;
			case 2:
				System.out.print("Enter employee name :-> ");
				String name = sc.nextLine();
				cs.setString(2, name);
				break;
			default:
				break;
			}
			cs.registerOutParameter(1,Types.VARCHAR);
			cs.execute();
		    System.out.println(cs.getString(1));
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
}

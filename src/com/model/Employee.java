package com.model;

public class Employee {
	
	private int eno;
	private String ename;
	private float salary;
	
	
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
	public Employee(int eno, String ename, float salary) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
	}

	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}	
}

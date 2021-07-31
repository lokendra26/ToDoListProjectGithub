package com.mph.model;

public class Employee {

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	private int empno;
	private String empname;


	public Employee(int empno, String empname) {
		super();
		this.empno = empno;
		this.empname = empname;
		
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", empname=" + empname + "]";
	}	

}

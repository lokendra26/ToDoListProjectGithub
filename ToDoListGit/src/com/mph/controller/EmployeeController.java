package com.mph.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import com.mph.model.Employee;

public class EmployeeController implements Employeeinterface {

	Employee emp;
	List<Employee> empList = new ArrayList<>();
	
	public List<Employee> addEmployee() {
		emp = new Employee();

		// System.out.println(emp.empno+ " " + emp.empname);

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Emp Number:");
		int eno = sc.nextInt();
		emp.setEmpno(eno);

		System.out.println("Enter your name :");
		emp.setEmpname(sc.next());

		empList.add(emp);
		System.out.println("Employee Added Sucessfully !!!");
		return empList;

	}
	public void viewEmployee(List empList) {
		System.out.println("Employee details:");
		 System.out.println(empList);
		empList.forEach(System.out::println);
		
	}
}

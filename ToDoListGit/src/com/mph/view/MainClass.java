package com.mph.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

import com.mph.controller.EmployeeController;
import com.mph.controller.Employeeinterface;

import com.mph.exception.UserNotFoundException;
import com.mph.model.Employee;

public class MainClass {

	static Boolean valid(String un, String pw) throws IOException {
		String username = "user";
		String password = "pass";
		BiPredicate<String,String>p1 =(x,y)->x.equals(y);
		BiPredicate<String,String>p2 =(x,y)->x.equals(y);
		Boolean b = p1.test(un, username)&& (p2.test(pw, password));
		return b;
	}

	public static void main(String[] args) throws Exception {
		System.out.println("Welcome To EMS");
		try {
			EmployeeController ec = new EmployeeController();
			Scanner sc = new Scanner(System.in);
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			System.out.println("Enter your username:");
			String un = br.readLine();
			System.out.println("Enter your password:");
			String pw = br.readLine();

			if ((valid(un, pw))) {

				System.out.println("Please Wait...\n ");

				try {
					Thread.sleep(3000);
				} catch (InterruptedException ie) {
					ie.printStackTrace();
				}

				System.out.println("Logged in successfully..\n");
				System.out.println("Welcome " + un + "\n ");
				String input = null;
				List<Employee> elist = null;
				do {
					System.out.println("Enter your choice:\n");
					System.out.println("1. Add Employee");
					System.out.println("2. View Employee");
					
					int choice = sc.nextInt();

					switch (choice) {
					case 1: {
						elist = ec.addEmployee();
						break;
					}
					case 2: {
						ec.viewEmployee(elist);
						break;
					}
					default:
						System.out.println("Please enter the valid choice");

					}
					System.out.println("Do you want to continue? Y or y");
					input = sc.next();
				} while (input.equals("Y") || input.equals("y"));
			} else {
				throw new UserNotFoundException();
			}
		} catch (UserNotFoundException ufe) {
			ufe.printStackTrace();
		}
		System.out.println("System Exited. Thanks for using EMS");
		// sc.close();
		System.exit(0);

	}
}
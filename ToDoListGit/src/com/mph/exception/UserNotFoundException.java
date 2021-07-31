package com.mph.exception;

public class UserNotFoundException extends Exception {

	public UserNotFoundException() {

		System.out.println("User Not Found Exception thrown");
	}

	@Override
	public String toString() {
		return "Invalid Credentials :(";
	}
}

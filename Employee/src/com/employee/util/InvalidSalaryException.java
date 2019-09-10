package com.employee.util;

public class InvalidSalaryException extends RuntimeException{
	 public InvalidSalaryException(String msg)
	 {
		 System.out.println(msg);
	 }
	}

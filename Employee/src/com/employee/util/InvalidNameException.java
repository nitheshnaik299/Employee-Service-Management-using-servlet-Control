package com.employee.util;

public class InvalidNameException extends RuntimeException{
 public InvalidNameException(String msg)
 {
	 System.out.println(msg);
 }
}

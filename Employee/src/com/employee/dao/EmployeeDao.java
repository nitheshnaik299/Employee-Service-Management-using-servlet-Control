package com.employee.dao;

import java.io.*;
import java.sql.Connection;
import java.util.List;

import com.employee.model.Emplyee;
public interface EmployeeDao {
	
	public Connection getConnection() throws Exception;
	public boolean  save(Emplyee emp) throws Exception;
	public  boolean  delete (String empid) throws Exception;
	public  boolean update (Emplyee emp) throws Exception;
	public Emplyee  getEmployee( String empId) throws Exception;
	public  List<Emplyee> getAllEmployees() throws Exception;
}

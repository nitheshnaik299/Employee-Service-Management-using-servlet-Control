package com.employee.service;

import java.util.List;

import com.employee.model.Emplyee;

public interface EmployeeService {
	public boolean validateEmployee(Emplyee emp)  throws RuntimeException ;
	public  String  genearateId(String empname) throws Exception;
	public boolean  save(Emplyee emp)throws Exception;
	public  boolean  delete (String empid)throws Exception;
	public  boolean update (Emplyee emp)throws Exception;;
	public Emplyee  getEmployee( String empId)throws Exception;
	public  List<Emplyee> display()throws Exception;;

}

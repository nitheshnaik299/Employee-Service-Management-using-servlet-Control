package com.employee.service;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;

import com.employee.dao.EmployeeDao;
import com.employee.dao.EmployeeDaoImpl;
import com.employee.model.Emplyee;
import com.employee.util.InvalidDobException;
import com.employee.util.InvalidNameException;
import com.employee.util.InvalidSalaryException;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDao Dao;
	public EmployeeServiceImpl()
	{
		Dao=new EmployeeDaoImpl();
	}
	

	@Override
	public boolean validateEmployee(Emplyee emp) throws RuntimeException {
		// TODO Auto-generated method stub
		String empName=emp.getEmpName();
		LocalDate dob=emp.getDob();
		float salary=emp.getBasicsalary();
		
		if(empName.length()<4 || empName.length()>15)
		{
			throw new InvalidNameException("name must be between 4 to 15 character");
		}
		
		if(dob.isAfter(LocalDate.of(1996, 12, 31)) || dob.isBefore(LocalDate.of(1900,1,1)))
		{
			throw new InvalidDobException("enter efdhgsadvjah");
		}
		if(salary<=0)
		{
			throw new InvalidSalaryException("salary must be greater than 0");
		}
		return true;
	
	}

	@Override
	public String genearateId(String empname) throws Exception {
		// TODO Auto-generated method stub
		String namechar=empname.substring(0,2).toUpperCase();
		Random rand=new Random();
		int dgt=(int) (rand.nextDouble()*10000);
		
		return namechar+dgt;
	}

	@Override
	public boolean save(Emplyee emp) throws Exception {
		// TODO Auto-generated method stub
		if(validateEmployee(emp))
		{
		emp.setEmpId(genearateId(emp.getEmpName()));
		System.out.println(emp.getEmpId()+emp.getEmpName()+emp.getDob()+emp.getBasicsalary());
		return Dao.save(emp);
		}
			
		return false;
	}

	@Override
	public boolean delete(String empid) throws Exception {
		// TODO Auto-generated method stub
		return Dao.delete(empid);
	}

	@Override
	public boolean update(Emplyee emp) throws Exception {
		// TODO Auto-generated method stub
		float sal=emp.getBasicsalary();
		if(sal>0)
			return Dao.update(emp);
		
		return false;
	}

	@Override
	public Emplyee getEmployee(String empId) throws Exception {
		// TODO Auto-generated method stub
		return Dao.getEmployee(empId);
	}

	@Override
	public List<Emplyee> display() throws Exception {
		// TODO Auto-generated method stub
		return Dao.getAllEmployees();
	}

	

}

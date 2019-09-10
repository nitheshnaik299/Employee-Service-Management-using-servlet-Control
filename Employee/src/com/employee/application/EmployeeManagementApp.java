
package com.employee.application;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.StringTokenizer;

import com.employee.model.Emplyee;
import com.employee.service.EmployeeService;
import com.employee.service.EmployeeServiceImpl;

public class EmployeeManagementApp {
	EmployeeService es;
    BufferedReader in;
    public EmployeeManagementApp()
    {
   	 es=new EmployeeServiceImpl();
   	 in=new BufferedReader(new InputStreamReader(System.in));
    }

     
     public void addEmployee() throws Exception
     {
    	
    	String empName;
    	LocalDate dob;
    	float sal;
    	System.out.println("Enter employee derails name dob salary");
    	empName=in.readLine();
    	String strDate=in.readLine();
    	StringTokenizer stk=new StringTokenizer(strDate,"/");
    	int date=Integer.parseInt(stk.nextToken());
    	int month=Integer.parseInt(stk.nextToken());
    	int year=Integer.parseInt(stk.nextToken());
    	dob=LocalDate.of(year, month, date);
    	sal=Float.parseFloat(in.readLine());
    	System.out.println(empName+sal+dob);
    	Emplyee emp=new Emplyee();
    	emp.setEmpName(empName);
    	emp.setBasicsalary(sal);
    	emp.setDob(dob);
    	
    	es.save(emp);
     }
 	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
     
    EmployeeManagementApp app=new EmployeeManagementApp();
    app.addEmployee();
}
     
	}

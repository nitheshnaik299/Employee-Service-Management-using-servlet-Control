package com.employee.dao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.employee.model.Emplyee;

public class EmployeeDaoImpl implements EmployeeDao {
	Connection con=null;
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

	@Override
	public Connection getConnection() throws Exception{
		// TODO Auto-generated method stub
	 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sakhadb","root","root");
	 return  con;
	}

	@Override
	public boolean save(Emplyee emp) throws Exception{
		// TODO Auto-generated method stub
		con=getConnection();
		System.out.println(emp.getEmpId()+emp.getEmpName()+emp.getDob()+emp.getBasicsalary());
		PreparedStatement ps=con.prepareStatement("insert into emplyee values(?,?,?,?)");
		System.out.println(emp.getEmpId()+emp.getEmpName()+emp.getDob()+emp.getBasicsalary());
		ps.setString(1, emp.getEmpId());
		ps.setString(2, emp.getEmpName());
		LocalDate dobraw=emp.getDob();
		ps.setDate(3, new java.sql.Date(dobraw.getYear()-1900, dobraw.getMonthValue()-1, dobraw.getDayOfMonth()));
		ps.setFloat(4, emp.getBasicsalary());
		System.out.println(emp.getEmpId()+emp.getEmpName()+emp.getDob()+emp.getBasicsalary());
		int r=ps.executeUpdate();
		return r>0?true:false;
		}

	@Override
	public boolean delete(String empid) throws Exception{
		// TODO Auto-generated method stub
		con=getConnection();
		
		PreparedStatement ps=con.prepareStatement("delete from emplyee where empid=?");
		ps.setString(1, empid);
		
		int r=ps.executeUpdate();
	      return r>0?true:false;
	    	
	}

	@Override
	public boolean update(Emplyee emp) throws Exception{
		// TODO Auto-generated method stub
        con=getConnection();
		String empid1=emp.getEmpId();
		float sal=emp.getBasicsalary();
		PreparedStatement ps=con.prepareStatement("Update emplyee set sal=? where empid=?");
		
		ps.setFloat(1,sal) ;
		ps.setString(2, empid1);
		
		int r=ps.executeUpdate();
	      return r>0?true:false;
	}

	@Override
	public Emplyee getEmployee(String empId)throws Exception {
		// TODO Auto-generated method stub
		   con=getConnection();
		  
			PreparedStatement ps=con.prepareStatement("select * from emplyee where empid=?");
			
			ps.setString(1, empId);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				java.sql.Date rowDate=rs.getDate(3);
				Emplyee emp=new Emplyee(rs.getString(1),rs.getString(2),LocalDate.of(rowDate.getYear(), rowDate.getMonth(), rowDate.getDate()),rs.getFloat(4));
			    //emp.setEmpId(empId);
			    //emp.setEmpName(rs.getString(2));
			    //emp.setDob(LocalDate.of(rowDate.getYear(), rowDate.getMonth(), rowDate.getDate()));
			    //emp.setBasicsalary(rs.getString(4));
				return emp;
			}
		return null;
	}

	@Override
	public List<Emplyee> getAllEmployees() throws Exception{
		// TODO Auto-generated method stub
		con=getConnection();
		PreparedStatement ps=con.prepareStatement("select * from emplyee");
		ResultSet rs=ps.executeQuery();
		List<Emplyee> emplist= new ArrayList<>();
		while(rs.next()) {
			java.sql.Date rowdate=rs.getDate(3);
			Emplyee emp=new Emplyee(rs.getString(1),rs.getString(2),LocalDate.of(rowdate.getYear(), rowdate.getMonth(),rowdate.getDate()),rs.getFloat(4));
			emplist.add(emp);
		}
		return emplist;
	
	}
}

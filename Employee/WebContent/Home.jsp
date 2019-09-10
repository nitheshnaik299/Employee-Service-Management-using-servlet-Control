<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: Right;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover {
  background-color: #111;
}
</style>
</head>
<body Style="background-image:url('/home/sakha-lenovo-4/Downloads/1.jpeg')">
<img src="Sak.png" height=70 width=250>
<ul>
  <li><a class="active" href="Home.jsp">Home</a></li>
  <li><a href="AddEmployee.jsp">Add Employee</a></li>
  <li><a href="ShowAll.jsp">View All employee</a></li>
  <li><a href="DeleteEmployee.jsp">Delete Employee</a></li>
  <li><a href="UpdateEmployee.jsp">Update Employee</a></li>
  <li><a href="EmployeeView.jsp">Get Employee</a></li>
</ul>
<h1 align="center">SakhaTech Employee management system</h1>


</body>
</html>
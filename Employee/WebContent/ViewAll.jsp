<jsp:include page="Home.jsp"/>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<title>Insert title here</title>
<style> 
input[type=text] {
  width: 30%;
  padding: 12px 20px;
  margin: 8px 0;
  box-sizing: border-box;
  border: 1px solid #555;
  outline: none;
}

input[type=text]:focus {
  background-color: lightblue;
}

input[type=button], input[type=submit], input[type=reset] {
  background-color: #4CAF50;
  border: none;
  color: white;
  padding: 16px 32px;
  text-decoration: none;
  margin: 4px 2px;
  cursor: pointer;
}
</style>
</head>
<body>


<h3 class="center-align">All Employees</h3><br><br><br>
<div class="container">
<table class="striped">
<thead>
          <tr>
              <th>Employee ID</th>
              <th>Employee Name</th>
              <th>Date of Birth</th>
              <th>Basic Salary</th>
              <th colspan="2">Delete/Update</th>
          </tr>
        </thead>
  <c:forEach items="${emplArr}" var="empl">
    <tr>
      <td>${empl.empId}</td>
      <td>${empl.empName}</td>
      <td>${empl.dob}</td>
      <td>${empl.basicsalary}</td>
      <td><a href='DeleteEmployee?empid=${empl.empId}'>Delete</a></td>
      <td><a href='updater?empId=${empl.empId}'>Update</a></td>
      </tr>
  </c:forEach>
</table>
</div>
</body>
</html>
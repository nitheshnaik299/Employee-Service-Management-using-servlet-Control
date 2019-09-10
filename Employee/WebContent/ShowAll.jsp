<jsp:include page="Home.jsp"/>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
#employee {
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#employee td, #employee th {
  border: 1px solid #ddd;
  padding: 8px;
}

#employee tr:nth-child(even){background-color: #f2f2f2;}

#employee tr:hover {background-color: #ddd;}

#employee th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #4CAF50;
  color: white;
}
</style>
</head>
<body>
<h3 class="center-align">All Employees</h3><br><br><br>
<div class="container">
<table class="striped" id="employee" >
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
      <td><a href='deletecontroller?empid=${empl.empId}'>Delete</a></td>
      <td><a href='updater?empId=${empl.empId}'>Update</a></td>
      </tr>
  </c:forEach>
</table>
</div>
</body>
</html>
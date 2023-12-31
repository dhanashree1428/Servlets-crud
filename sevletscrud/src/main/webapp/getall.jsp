<%@page import="dto.Employee"%>
<%@page import="java.util.List"%>
<%@page import="service.EmployeeService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Getall Employees</title>
</head>
<body>
<h1>Details of Employees</h1>
	<%! EmployeeService employeeService = new EmployeeService(); 
		List<Employee> employees = employeeService.getAllEmployees();	
	%>
	<table border="2px" cellspacing = "0" cellpadding = "1">
	<tr>
	<th>Id</th>
	<th>Name</th>
	<th>Email</th>
	<th>Gender</th>
	<th>Salary</th>
	<th>Delete</th>
	<th>Update</th>
	</tr>	
	<% for(Employee e : employees){ %>
		<tr>
			<td><%= e.getId() %></td>
			<td><%= e.getName() %></td>
			<td><%= e.getEmail() %></td>
			<td><%= e.getGender() %></td>
			<td><%= e.getSalary() %></td>
			<td><a href="delete.jsp?id=<%= e.getId() %>">Delete</a></td>
			<td><a href="update.jsp?id=<%= e.getId() %>">Update</a></td>
		</tr>	
	<% } %>
	</table>
</body>
</html>
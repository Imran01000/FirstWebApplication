<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://unpkg.com/bootstrap@4.1.0/dist/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
</head>

<body>

	<div class="container">
		<table border="1" class="table table-bordered table-secondary table-hover">
	
		<tr class="table-danger">
			<th>Name</th>
			<th>Department</th>
			<th>Date Of Birth</th>
		</tr>
		
		<c:forEach items = "${list}" var = "emp">
		<tr>
			<td>${emp.name}</td>
			<td>${emp.department}</td>
			<td>${emp.dob}</td>
		</tr>
		</c:forEach>
		
	</table>
	
	</div>
	
</body>

</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table>
	
		<tr>
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
	
</body>

</html>
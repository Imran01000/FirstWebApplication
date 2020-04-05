<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://unpkg.com/bootstrap@4.1.0/dist/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
</head>
<body>

	<div class="container">
	
	<form action="${pageContext.request.contextPath}/EmployeeController" method="POST">
	
		<table border="1" class="table table-bordered table-secondary table-hover">
		
			<tr class="table-danger">
				<td>Add Information</td>	
			</tr>
			
			<tr>		
				<td>
					Enter employee name:-<input type="text" name="fname" placeholder="Enter name" />
				</td>
			</tr>
			
			<tr>
				<td>
					Enter date of birth:-<input type="date" name="dob" placeholder="Enter date of birth" />
				</td>
			</tr>
			
			<tr>
				<td>
					Enter designation:<input type="text" name="designation" placeholder="Enter role" />
				</td>
			</tr>
			
			<tr>
				<td>
					<button  class="btn btn-secondary" type="submit">Add</button>
				</td>
			</tr>
			
		</table>
		
	</form>
		
	</div>
	
</body>
</html>
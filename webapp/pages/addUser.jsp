<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<div>


			<form action="/addUser" method="post">
				First name : <input type="text" name="${fistName}">
				Last name : <input type="text" name="${lastName}">
				Age : <input type="text" name="${age}">
				Role : <select name="${role}">
							<option value="admin">admin</option>
							<option value="moderator">moderator</option>
							<option value="user">user</option>
					   </select>
				Email <input type="email" name="${email}">
				<input type="submit" value="Add">
			</form>
		</div>
	</body>
</html>
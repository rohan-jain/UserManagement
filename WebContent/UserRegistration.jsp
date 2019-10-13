<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration</title>
</head>
<body>
	<form action="UserRegistrationServlet" method="POST">
		<table>
		<tr>
			<td>
				Name : <input type="text" name="username"/>
			</td>
		</tr>
		<tr>
			<td>
				Address : <input type="text" name="useraddress"/>
			</td>
		</tr>
		<tr>
			<td>
				Email : <input type="text" name="useremail"/>
			</td>
		</tr>
		<tr>
			<td>
				Phone Number : <input type="text" name="usernumber"/>
			</td>
		</tr>
		<tr>
			<td>
				Password : <input type="text" name="userpassword"/>
			</td>
		</tr>
		<tr>
			<td>
				Organization : <input type="text" name="userorganization"/>
			</td>
		</tr>
		<tr>
			<td>
				<input type="submit" value="Submit"/>
			</td>
		</tr>
	</table>
</form>
</body>
</html>
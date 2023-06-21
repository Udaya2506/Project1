<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Form</title>

<style type="text/css">
.error{
	color: red;
}
</style>
</head>
<body>

	<h2>User Registeration Form</h2>

	<form:form action="register" method="POST" modelAttribute="user">
		<table>
			<tr>
				<td>UserName</td>
				<td>
				<form:input path="userName"/>
				<form:errors path="userName"  cssClass="error" />
				</td>
				
			</tr>
			<tr>
				<td>UserEmail</td>
				<td><form:input path="userEmail"/>
				<form:errors path="userEmail"  cssClass="error" /></td>
			</tr>
			<tr>
				<td>UserPassword</td>
				<td><form:input path="userPassword"/>
				<form:errors path="userPassword"  cssClass="error" /></td>
			</tr>
			<tr>
				<td>UserAge</td>
				<td><form:input path="userAge"/>
				<form:errors path="userAge"  cssClass="error" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register"> </td>
			</tr>
			
			

		</table>

	</form:form>


</body>
</html>
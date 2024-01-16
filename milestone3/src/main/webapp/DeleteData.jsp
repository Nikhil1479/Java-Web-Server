<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Delete Data</h1>

	<form action="delete" method="POST">

		<label for="slNo">Sl_No:</label> <input type="number" id="Sl_no"
			name="Sl_no" required><br>
		<br> <input type="submit" value="Delete Data">
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Student Management System</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<link rel="stylesheet" href="css/style.css">

</head>
<body>
	<nav class="navbar navbar-dark bg-dark">
		<a class="navbar-brand">Student Management System</a>
	</nav>

	<div class="main">
		<h1>Admin Log in</h1>
		<br>
		<form id="loginform" action="login" method="post">
			<div class="form-outline mb-4">
				<label class="form-label">Username</label> <input type="text"
					name="admin" id="user" class="form-control" /> <i
					class="fa fa-check-circle"></i> <i class="fa fa-exclamation-circle">
				</i><br> <small>Error Message</small>
			</div>

			<div class="form-outline mb-4">
				<label class="form-label">Password</label> <input type="password"
					name="pass" id="pass" class="form-control" /> <i
					class="fa fa-check-circle"></i> <i class="fa fa-exclamation-circle">
				</i><br> <small>Error Message</small>
			</div>

			<button type="submit" class="btn btn-primary btn-block mb-4">Log
				in</button>
		</form>
	</div>
</body>
</html>
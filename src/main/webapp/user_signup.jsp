<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient Sign up Page</title>
<%@include file="component/all_css.jsp"%>
<link rel="stylesheet" href="css/style.css" />
<style>
* {
	box-sizing: border-box;
}

body {
	background: rgb(219, 226, 226);
}

.row {
	background: white;
	border-radius: 30px;
	box-shadow: 12px 12px 22px gray;
}

img {
	border-top-left-radius: 30px;
	border-bottom-left-radius: 30px;
}

.btn1 {
	border: none;
	outline: none;
	height: 50px;
	width: 100%;
	background-color: black;
	color: white;
	border-radius: 4px;
	font-weight: bold;
}

.btn1:hover {
	background: white;
	border: 1px solid;
	color: black;
}
</style>
</head>
<body>
	<%@include file="component/navbar1.jsp"%>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<section class="Form my-4 mx-5">
		<div class="container">
			<div class="row no-gutters">
				<div class="col-lg-5">
					<img alt="" src="image/jk.jpg" class="img-fluid"
						style="height: 450px;">
				</div>
				<div class="col-lg-7 px-5 pt-5">
					<c:if test="${not empty succMsg}">
						<div class="container text-center">
							<div class="alert alert-success" role="alert">${succMsg}</div>
						</div>
						<c:remove var="succMsg" />
					</c:if>
					<c:if test="${not empty errorMsg}">
						<div class="container text-center">
							<div class="alert alert-danger" role="alert">${errorMsg}</div>
						</div>
						<c:remove var="errorMsg" />
					</c:if>
					<h1 class="font-weight-bold py-3">Patient</h1>
					<h4>Sign up your account</h4>
					<form action="user_register" method="post">
						<div class="form-row">
							<div class="col-lg-7">
								<input name="fullName" placeholder="Full Name" type="text"
									class="form-control my-3 p-4" required />
							</div>
						</div>
						<div class="form-row">
							<div class="col-lg-7">
								<input name="email" placeholder="email" type="Email"
									class="form-control my-3 p-4" required />
							</div>
						</div>
						<div class="form-row">
							<div class="col-lg-7">
								<input placeholder="********" type="password"
									class="form-control my-3 p-4" name="password" required />
							</div>
						</div>

						<div class="form-row">
							<div class="col-lg-7">
								<button type="submit" class="btn1 mt-3 mb-5">Signup</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</section>
</body>
</html>
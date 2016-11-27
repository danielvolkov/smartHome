<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

	<title>MySmartHome</title>
	<meta name="description" content="Pi House">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link href="<c:url value="/resources/css/bootstrap.css"/> " rel="stylesheet" type="text/css">
	<link rel="icon" href="<c:url value="/resources/images/home.ico"/>">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<style>
	body {
		background-color: #474e5d;;
	}
	.container-fluid {
		padding-top: 40px;
		padding-bottom: 70px;
	}
	.bg-1 {
		background-color: #1abc9c; /* Green */
		color: #ffffff;
	}
	.bg-2 {
		background-color: #474e5d; /* Dark Blue */
		color: #ffffff;
	}
	.dvsize {
		width: 20%;
		position: relative;
	}
	.btnsize {
		width: 100%;

	}
</style>

<body>
<div class="container-fluid bg-2 text-center">
	<h1>Turn ON/OFF your light</h1>

		<form method="post" action="turnA">

			<button type="submit" class="btn btn-default btn-lg" >Hallway</button></form>
		<form method="post" action="turnB">
			<button type="submit" class="btn btn-default btn-lg">Bath Room</button></form>
		<form method="post" action="turnC">
			<button type="submit" class="btn btn-default btn-lg">Kitchen</button></form>
		<form method="post" action="turnD">
			<button type="submit" class="btn btn-default btn-lg">Small Room</button></form>
		<form method="post" action="turnE">
			<button type="submit" class="btn btn-default btn-lg">Garderobe</button></form>
		<form method="post" action="turnF">
			<button type="submit" class="btn btn-default btn-lg">Main Room</button></form>
		<form method="post" action="turnG">
			<button type="submit" class="btn btn-default btn-lg">Sconce</button></form>
	<form method="post" action="getAir">
		<button type="submit" class="btn btn-default btn-lg">Air</button></form>

<div>
	<label>temperature: ${temperature}</label>
	<label> humidity:  ${humidity}</label>
</div>
</div>
<div class="container-fluid ">
	<form method="post" action="logout">
		<button type="submit" class="btn btn-danger btn-lg">Go out</button>
	</form>
</div>



</body>
</html>

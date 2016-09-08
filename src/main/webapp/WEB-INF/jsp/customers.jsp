<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="myApp">
<head>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7"
	crossorigin="anonymous">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css"
	integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r"
	crossorigin="anonymous">

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"
	integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS"
	crossorigin="anonymous"></script>

<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.8/angular.min.js"></script>


<script src="../../resources/app.js"></script>
<script src="../../resources/MotorController.js"></script>
<script src="../../resources/MotorService.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body ng-controller="MotorController">
<div>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">Logo</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Home</a></li>
        <li><a href="products">Products</a></li>
        <li><a href="orders">Orders</a></li>
        <li><a href="#">Stores</a></li>
        <li><a href="customers">Customers</a></li>
        <li><a href="#">Contact</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><span class="glyphicon glyphicon-user"></span> Your Account</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
      </ul>
    </div>
  </div>
</nav>
<div>

 <table class="table table-hover table-condensed">
 <thead>
 <tr class="active">
				<th><button
						ng-click="orderByField='customerName';reverseSort = !reverseSort">
						<span class="caret"></span>Customer Name
					</button></th>
				<th><button
						ng-click="orderByField='customerLastName';reverseSort = !reverseSort">
						<span class="caret"></span>Last Name
					</button></th>
				<th><button
						ng-click="orderByField='customerFirstName';reverseSort = !reverseSort">
						<span class="caret"></span>First Name
					</button></th>
					<th><button
						ng-click="orderByField='phone';reverseSort = !reverseSort">
						<span class="caret"></span>Phone Number
					</button></th>
			</tr>
			
 </thead>
 <tbody>
			<tr ng-repeat="c in customers | orderBy:orderByField:reverseSort">

				<td><strong>{{c.customerName}}</strong></td>
				<td><strong>{{c.contactLastName}}</strong></td>
				<td><strong>{{c.contactFirstName}}</strong></td>
				<td><strong>{{c.phone}}</strong></td>
			</tr>
		</tbody>
 
 </table>

</div>


</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="myApp">
<head>
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

<style>
    /* Remove the navbar's default margin-bottom and rounded borders */
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    
    /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
    .row.content {height: 450px}
    
    /* Set gray background color and 100% height */
    .sidenav {
      padding-top: 20px;
      background-color: #f1f1f1;
      height: 100%;
    }
    
    /* Set black background color, white text and some padding */
    footer {
      background-color: #555;
      color: white;
      padding: 15px;
    }
    
    /* On small screens, set height to 'auto' for sidenav and grid */
    @media screen and (max-width: 767px) {
      .sidenav {
        height: auto;
        padding: 15px;
      }
      .row.content {height:auto;}
    }
  </style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="../../resources/app.js"></script>
<script src="../../resources/MotorController.js"></script>
<script src="../../resources/MotorService.js"></script>

<title>AutoMobil</title>
</head>
<body>
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
<div class="container-fluid text-center" ng-controller="MotorController">
  <div class="row content">
    <div class="col-sm-2 sidenav">
      <p><a href="#">Link</a></p>
      <p><a href="#">Link</a></p>
      <p><a href="#">Link</a></p>
    </div>
    <div class="col-sm-8 text-left">
      <h1>Welcome To Motoromania!</h1>
     <!--  <div ng-repeat='p in myWelcome'>  
        {{p.productName}}
    </div> -->
    <table class="table table-hover table-condensed">
		<thead>
			<tr class="active">
				<th><button
						ng-click="orderByField='productName';reverseSort = !reverseSort">
						<span class="caret"></span>Order Number
					</button></th>
				<th><button
						ng-click="orderByField='productLine';reverseSort = !reverseSort">
						<span class="caret"></span>Order Date
					</button></th>
				<th><button
						ng-click="orderByField='buyPrice';reverseSort = !reverseSort">
						<span class="caret"></span>Shipped Date
					</button></th>
					<th><button
						ng-click="orderByField='buyPrice';reverseSort = !reverseSort">
						<span class="caret"></span>Status
					</button></th>
			</tr>
		</thead>
		<tbody>
			<tr
				ng-repeat="m in orders | orderBy:orderByField:reverseSort">

				<td><strong>{{m.orderNumber}}</strong></td>
				<td><strong>{{m.orderDate}}</strong></td>
				<td><strong>{{m.shippedDate}}</strong></td>
				<td><strong>{{m.status}}</strong></td>
	
			</tr>
		</tbody>


	</table>
    
      <hr>
      <h3>Test</h3>
      <p>Hola !.</p>
    </div>
    <div class="col-sm-2 sidenav">
     
    </div>
  </div>
</div>



<footer class="container-fluid text-center">
  <p>Footer Text</p>
</footer>

</div>
</div>
</body>
</html>
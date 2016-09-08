'use strict'

myApp.controller('MotorController',['$scope','MotorService','$http',function($scope,MotorService,$http) {
	
	$scope.test = "hello boss";
	$scope.hey = "namastey";
	
	$scope.products = [];
   
	
	$http({
        method : "GET",
        url : "http://localhost:8080/Motordom/getProducts"
    }).then(function mySucces(response) {
        $scope.myWelcome = response.data;
    }, function myError(response) {
        $scope.myWelcome = response.statusText;
    });
	
	$http({
        method : "GET",
        url : "http://localhost:8080/Motordom/getCustomers"
    }).then(function mySucces(response) {
        $scope.customers = response.data;
    }, function myError(response) {
        $scope.customers = response.statusText;
    });
	
	$http({
        method : "GET",
        url : "http://localhost:8080/Motordom/getOrders"
    }).then(function mySucces(response) {
        $scope.orders = response.data;
    }, function myError(response) {
        $scope.orders = response.statusText;
    });
	
	
}]);
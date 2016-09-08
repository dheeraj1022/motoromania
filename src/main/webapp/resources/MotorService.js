myApp.factory('MotorService',['$http','$q',function($http,$q){
	
return {
	
	displayProducts: function(){
		
		return $http.get("http://localhost:8080/Motordom/getProducts").then
		(function(response){
		return response.data;	
		},function(errResponse){
			console.error('Error Fetching the movies');
		});
	}
	
	
};
	
}]);
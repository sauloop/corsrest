angular.module('demo', []).controller(
		'Hello',
		function($scope, $http) {
			$http.get('https://corsrest.herokuapp.com:8080/greeting').then(
					function(response) {
						$scope.greeting = response.data;
					});
		});
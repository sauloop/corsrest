angular.module('demo', []).controller(
		'Hello',
		function($scope, $http) {
			$http.get('https://corsrest.herokuapp.com/greeting').then(
					function(response) {
						$scope.greeting = response.data;
					});
		});
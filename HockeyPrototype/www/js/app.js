var app=angular.module('app', ['ionic']);
	app.config(function($stateProvider,$urlRouterProvider){
		$stateProvider
		.state('teams',{
			url:'/teams',
			templateUrl: "views/teams.html",
			controller: "appController"
		})
		.state('players',{
			url:'/players',
			templateUrl: "views/players.html",	
			controller: "appController"
		});
		$urlRouterProvider.otherwise('/teams');
	});
	
	app.run(function($ionicPlatform) {
	  $ionicPlatform.ready(function() {
		// Hide the accessory bar by default (remove this to show the accessory bar above the keyboard
		// for form inputs)
		if(window.cordova && window.cordova.plugins.Keyboard) {
		  cordova.plugins.Keyboard.hideKeyboardAccessoryBar(true);
		}
		if(window.StatusBar) {
		  StatusBar.styleDefault();
		}
	  });
	});
	
	app.controller('appController',['$scope',function($scope){
		
		$scope.loadTeams= function(){
			
		};
		
		$scope.loadPlayers= function(team){
			
		};
	}]);
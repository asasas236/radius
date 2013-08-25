angular.module('radius', []).config(['$routeProvider',
	function($routeProvider) {
		$routeProvider.
		when('/users', {
			templateUrl: 'user/userlayer.html'
			, controller: UsersCtrl
		}).
		when('/nas', {
			templateUrl: 'nas/naslayer.html'
			, controller: NASCtrl
		}).
		when('/report', {
			templateUrl: 'report/reportlayer.html'
			, controller: ReprotCtrl
		}).
		when('/card', {
			templateUrl: 'card/cardlayer.html'
			, controller: CardCtrl
		}).
		otherwise({
			redirectTo: '/users'
		});
	}
]);
angular.module('radius', []).config(['$routeProvider',
	function($routeProvider) {
		$routeProvider.
		when('/users', {
			templateUrl: 'admin/userlayer'
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
		when('/login', {
			templateUrl: 'admin/login'
			, controller: LoginCtrl
		}).
		otherwise({
			redirectTo: '/login'
		});
	}
]);
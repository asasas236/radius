'use strict';

/* Controllers */

// 控制用户信息的控制器
function UsersCtrl($scope, $http) {
	$scope.url = 'user/adduser.html';
}
UsersCtrl.$inject = ['$scope', '$http'];

// 控制NAS信息的控制器
function NASCtrl($scope, $http) {
	$scope.url = 'nas/addnas.html';
}
NASCtrl.$inject = ['$scope', '$http'];

// 控制NAS信息的控制器
function ReprotCtrl($scope, $http) {
	$scope.url = 'report/onlineuser.html';
}
ReprotCtrl.$inject = ['$scope', '$http'];

// 控制NAS信息的控制器
function CardCtrl($scope, $http) {
	$scope.url = 'card/addcard.html';
}
CardCtrl.$inject = ['$scope', '$http'];

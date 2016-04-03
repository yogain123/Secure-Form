angular
  .module('app', [
    'ui.router'
  ])
  .config(['$urlRouterProvider', '$stateProvider', function($urlRouterProvider, $stateProvider) {
    $urlRouterProvider.otherwise('/home');
    $stateProvider
      .state('home', {
        url: '/home',
        templateUrl: 'resources/html/home.html',
        controller: 'homeCtrl'
          })
      .state('display',{
        url:'/display',
        templateUrl:'resources/html/display.html',
        controller:'displayCtrl',
        controllerAs:'list'
      })
      .state('about', {
        url: '/about',
        templateUrl: 'resources/html/about.html',
        controller: 'aboutCtrl'
      })
      .state('contact', {
        url: '/contact',
        templateUrl: 'resources/html/contact.html'
      });
  }]);
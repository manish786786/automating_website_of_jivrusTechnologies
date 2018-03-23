var myApp= angular.module("myApp",['ui.router']);

myApp.config(function($stateProvider,$urlRouterProvider){
    $urlRouterProvider.otherwise('/home');
    
    $stateProvider
        .state('home',{
        url:'/home',
        templateUrl:'home.html',
        
    })
        .state('products',{
        url:'/products',
        templateUrl:'products.html',
        
    })
        .state('services',{
        url:'/services',
        templateUrl:'services.html',
        
    })
        .state('customers',{
        url:'/customers',
        templateUrl:'customers.html',
        
    })
         .state('partners',{
        url:'/partners',
        templateUrl:'partners.html',
        
    })
         .state('careers',{
        url:'/careers',
        templateUrl:'careers.html',
        
    })
         .state('abouts',{
        url:'/abouts',
        templateUrl:'abouts.html',
        
    })
         .state('contacts',{
        url:'/contacts',
        templateUrl:'contacts.html',
        
    })
    

})
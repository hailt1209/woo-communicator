'use strict';

angular.
module('wooCommerceApp').
config(['$routeProvider',
    function config($routeProvider) {
        $routeProvider.
        when('/products', {
            template: '<product-list></product-list>'
        }).
        when('/products/new', {
            template: '<product-creation></product-creation>'
        }).
        otherwise('/products');
    }
]);
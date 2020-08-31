'use strict';

angular.module('productCreation').component('productCreation', {
    templateUrl: 'product-creation/product-creation.template.html',
    controller: ['$scope', '$http', function ProductCreationController($scope, $http) {

        $scope.types = ["simple", "grouped", "external", "variable"];

        $scope.originalProduct = {
            name: '',
            type: 'simple',
            regularPrice: '',
            description: ''
        };

        $scope.newProduct = angular.copy($scope.originalProduct);

        $scope.submitNewProduct = function () {
            $http.post('api/v1/products', $scope.newProduct).then(function success(response) {
                $scope.message = 'New product added!';
                $scope.errorMessage = '';
            }, function error(response) {
                $scope.errorMessage = 'Error adding new product!';
                $scope.message = '';
            });
        };

        $scope.reset = function () {
            $scope.newProduct = angular.copy($scope.originalProduct);
        };
    }]
});
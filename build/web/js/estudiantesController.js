/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/* global angular */

var app = angular.module('cursoApp', []);

app.controller('estudiantesCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
        $scope.estudiantes = null;
        $scope.id = 6;
        $scope.data = {
            singleSelect: null
        };

        $scope.getEstudiantes = function () {
            $http.get("./webresources/ServicioEstudiante", {})
                    .then(function (response) {
                        $scope.estudiantes = response.data;
                    }, function () {
                        alert("error");
                    });
        };

        $scope.guardarEstudiante = function () {
            $http.post("./webresources/ServicioEstudiante", $scope.nuevoEstudiante)
                    .then(function (response) {
                        $scope.getEstudiantes();
                    }, function () {
                        alert("Error al guardar Estudiantes");
                    });
        };

        $scope.guardar = function () {
            $scope.data.id = $scope.id++;
            $scope.estudiantes.push($scope.data);
            $scope.guardarEstudiante();
            $scope.formVisibility = false;
            
            
        };

        $scope.formVisibility = false;
        $scope.mostrarFormulario = function () {
            $scope.formVisibility = true;
        };

        $scope.getEstudiantes();
    }]);
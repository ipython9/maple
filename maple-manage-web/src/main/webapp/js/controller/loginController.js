app.controller('loginController',function($scope,$controller,loginService){

    // $controller('baseController',{$scope:$scope});//继承

    $scope.showName=function () {
        loginService.showName().success(function (response) {
            $scope.loginName=response.loginName;
        })
    }

})
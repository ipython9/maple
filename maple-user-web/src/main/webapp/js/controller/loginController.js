app.controller('loginController',function($scope,$controller,loginService){

    // $controller('baseController',{$scope:$scope});//继承

    $scope.showName=function () {
        loginService.showName().success(function (response) {
            $scope.loginName=response.loginName;
            $scope.entity=response.entity;
        })
    }
    //保存
    $scope.save=function(){
        loginService.update($scope.entity ).success(
            function(response){
                if(response.success){
                    alert(response.message);
                }else{
                    alert(response.message);
                }
            }
        );
    }

    //上传图片
    $scope.uploadFile=function(){
        loginService.uploadFile().success(
            function(response){
                if(response.success){
                    $scope.picpath= response.message;
                    $scope.entity.picpath=response.message;
                }else{
                    alert(response.message);
                }
            }
        );
    }

})
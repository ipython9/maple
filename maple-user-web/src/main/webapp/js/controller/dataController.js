 //控制层 
app.controller('dataController' ,function($scope,$controller   ,$location,dataService) {

    $controller('baseController', {$scope: $scope});//继承

    $scope.findJobList = function () {
        dataService.findAll().success(
            function (response) {
                $scope.list = response;
            }
        )
    }

    //查询二级商品分类列表
    $scope.$watch('entity.jobid', function (newValue, oldValue) {
        dataService.findSize(newValue).success(
            function (response) {
                $scope.entity.size = response;
            }
        );
    })

    $scope.add = function () {
        dataService.add($scope.entity).success(
            function (response) {
                if (response.success) {
                    alert(response.message);
                } else {
                    alert(response.message);
                }
            }
        )
    }

    $scope.searchEntity = {};
    $scope.finddataList = function (page, rows) {
        // if($scope.searchEntity.dataname==null){
        //     $scope.searchEntity.dataname="";
        // }
        $scope.searchEntity.dataname = "";
        dataService.findOnedataModel(page, rows, $scope.searchEntity).success(
            function (response) {
                $scope.dataModel = response.rows;
                $scope.paginationConf.totalItems = response.total;//更新总记录数
            }
        );
    }

    $scope.findjob = function (job) {
        $scope.job = job;
    }


    $scope.searchUser = function (page, rows, id, num, startnum) {
        dataService.searchUser(page, rows, id, num, startnum).success(
            function (response) {
                $scope.list = response.rows;
                $scope.paginationConf.totalItems = response.total;//更新总记录数
            }
        );
    }

    $scope.search = function (id,num,startnum) {

        location.href = "http://localhost:9103/admin/receivedata.html#?id="+id+"&num="+ num+"&startnum="+startnum;
    }

    $scope.loadkeywords = function () {
        var id = $location.search()['id'];
        var num = $location.search()['num'];
        var startnum = $location.search()['startnum'];

        var page = 1;
        var rows = 10;
        $scope.searchUser(page,rows,id,num,startnum);//查询
    }
    $scope.findResumeModel=function(userid){
        dataService.resumemodel(userid).success(
            function(response){
                $scope.ResumeModel=response;
            }
        );
    }
    $scope.findResumeModel1=function(userid){
        dataService.resumemodel1(userid).success(
            function(response){
                $scope.ResumeModel=response;
            }
        );
    }
    $scope.updateUserJobStatus=function (id,status) {
       dataService.updateUserJobStatus(id,status).success(
            function (response) {
                alert(response.message);
            }
        )
    }
    $scope.loadkey = function () {
        var id = $location.search()['id'];
        $scope.jobid=$location.search()['jobid'];
        var page = 1;
        var rows = 10;
        $scope.searchRecomend(page,rows,id);//查询
    }
    $scope.searchRecomend = function (page, rows, id) {
        dataService.searchRecomend(page, rows, id).success(
            function (response) {
                $scope.list = response.rows;
                $scope.paginationConf.totalItems = response.total;//更新总记录数
            }
        );
    }

    $scope.updateStatus=function (jobid,userid) {
       dataService.updateStatus(jobid,userid).success(
            function (response) {
                alert(response.message);
            }
        )
    }
})




 //控制层 
app.controller('userController' ,function($scope,$location,$controller,userService){
	
	$controller('baseController',{$scope:$scope});//继承
	
    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		userService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}

    $scope.add=function(){
        userService.add( $scope.entity  ).success(
            function(response){
                if(response.success){
                    //如果注册成功，跳转到登录页
                    location.href="sign.html";
                }else{
                    alert(response.message);
                }
            }
        );
    }
    //分页
	$scope.findPage=function(page,rows){			
		userService.findPage(page,rows).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	
	//查询实体 
	$scope.findOne=function(id){				
		userService.findOne(id).success(
			function(response){
				$scope.entity= response;					
			}
		);				
	}
	
	//保存 
	$scope.save=function(){				
		var serviceObject;//服务层对象  				
		if($scope.entity.id!=null){//如果有ID
			serviceObject=userService.update( $scope.entity ); //修改  
		}else{
			serviceObject=userService.add( $scope.entity  );//增加 
		}				
		serviceObject.success(
			function(response){
				if(response.success){
					//重新查询
					alert("提交成功 请联系公司管理员审核")
					$scope.st=true;
		        	// $scope.reloadList();//重新加载
				}else{
					alert(response.message);
				}
			}		
		);				
	}
	
	 
	//批量删除 
	$scope.dele=function(){			
		//获取选中的复选框			
		userService.dele( $scope.selectIds ).success(
			function(response){
				if(response.success){
					$scope.reloadList();//刷新列表
					$scope.selectIds=[];
				}						
			}		
		);				
	}
	
	$scope.searchEntity={};//定义搜索对象 
	
	//搜索
	$scope.search=function(page,rows){			
		userService.search(page,rows,$scope.searchEntity).success(
			function(response){
				$scope.list=response.rows;
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	
	//resume
	$scope.resumemodel=function(){
		userService.resumemodel().success(
			function (response) {
				$scope.ResumeModel=response;
            }
		)
    }
    //job
    $scope.jobmodel=function(){
        userService.jobmodel().success(
            function (response) {
                $scope.jobModel=response;
            }
        );
    }
    //Compy
    $scope.findmodel=function(){
        userService.compymodel().success(
            function (response) {
                $scope.busModel=response;
            }
        )
    }

    $scope.showName=function () {
        userService.showName().success(function (response) {
            $scope.loginName=response.loginName;
            $scope.entity=response.entity;
        })
    }

    //搜索
    $scope.searchJob=function(page,rows){
        userService.searchJob(page,rows,$scope.searchEntity).success(
            function(response){
                $scope.jobModel=response.rows;
                $scope.paginationConf.totalItems=response.total;//更新总记录数
            }
        );
    }

    //搜索公司
    $scope.searchBusModel=function(page,rows){
		if($scope.searchEntity.compyname==null){
            $scope.searchEntity.compyname="";
		}
        userService.findbusModel(page,rows,$scope.searchEntity).success(
            function(response){
                $scope.busModel=response.rows;
                $scope.paginationConf.totalItems=response.total;//更新总记录数
            }
        );
    }

    //搜索众包
    $scope.searchDataModel=function(page,rows){
        if($scope.searchEntity.dataname==null){
            $scope.searchEntity.dataname="";
        }
        userService.finddataModel(page,rows,$scope.searchEntity).success(
            function(response){
                $scope.dataModel=response.rows;
                $scope.paginationConf.totalItems=response.total;//更新总记录数
            }
        );
    }


    $scope.loadkeywords=function(){
        $scope.searchEntity.name= $location.search()['keywords'];
        var page=1;
        var rows=10;
        $scope.searchJob(page,rows,$scope.searchEntity.name);//查询
    }
    //搜索  （传递参数）
    $scope.search=function(){
        location.href="http://localhost:9103/admin/searchjob.html#?keywords="+$scope.keywords;
    }
    $scope.datamodel={};
    $scope.loaddata=function(){
        $scope.searchEntity.id= $location.search()['keywords'];
        userService.finddata($scope.searchEntity.id).success(
            function(response){
                $scope.datamodel=response;
            }
        );
    }
    $scope.addtask=function (id,num,num2) {
	    var a=true;
        if(num>num2) {
            alert("数量大于任务包数量")
            a=false;
        }
        if(a){
            userService.addtask(id,num).success(
                function (response) {
                    alert(response.message);
                }
            )
        }
    }

});	

 //控制层 
app.controller('userjobController' ,function($scope,$controller,$location,userjobService){
	
	$controller('baseController',{$scope:$scope});//继承
	
    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		userjobService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}    
	
	//分页
	$scope.findPage=function(page,rows){			
		userjobService.findPage(page,rows).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	
	//查询实体 
	$scope.findOne=function(id){				
		userjobService.findOne(id).success(
			function(response){
				$scope.entity= response;					
			}
		);				
	}
	$scope.jobentity={};
    $scope.findTwo=function(jobentity){
                $scope.entity= jobentity;
    }
	//保存 
	$scope.save=function(){				
		var serviceObject;//服务层对象  				
		if($scope.entity.id!=null){//如果有ID
			serviceObject=userjobService.update( $scope.entity ); //修改  
		}else{
			serviceObject=userjobService.add( $scope.entity  );//增加 
		}				
		serviceObject.success(
			function(response){
				if(response.success){
					//重新查询 
		        	$scope.reloadList();//重新加载
				}else{
					alert(response.message);
				}
			}		
		);				
	}
	
	 
	//批量删除 
	$scope.dele=function(){			
		//获取选中的复选框			
		userjobService.dele( $scope.selectIds ).success(
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
		userjobService.search(page,rows,$scope.searchEntity).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}

    $scope.searchUser=function(page,rows){
        userjobService.searchUser(page,rows,$scope.searchEntity).success(
            function(response){
                $scope.list=response.rows;
                $scope.paginationConf.totalItems=response.total;//更新总记录数
            }
        );
    }

    $scope.loadkeywords=function(){
        $scope.searchEntity.userid= $location.search()['userid'];
        var page=1;
        var rows=10;
        $scope.searchUser(page,rows,$scope.searchEntity.userid);//查询
		$scope.findOneJob($scope.searchEntity.userid);
    }
    $scope.findResumeModel=function(userid){
        userjobService.resumemodel(userid).success(
            function(response){
                $scope.ResumeModel=response;
            }
        );
	}

    $scope.findOneJob=function(id){
        userjobService.findOneJob(id).success(
            function(response){
                $scope.Jobentity= response;
            }
        );
    }
    $scope.updateUserJobStatus=function (jobid,userid) {
		userjobService.updateUserJobStatus(jobid,userid).success(
			function (response) {
                alert(response.message);
            }
		)
    }
});	

//服务层
app.service('dataService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../data/findAll.do');
	}
	//分页 
	this.findSize=function(newValue){
		return $http.get('../data/findSize.do?jobid='+newValue);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../data/add.do',entity);
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../edu/update.do',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../edu/delete.do?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../edu/search.do?page='+page+"&rows="+rows, searchEntity);
	}

    this.findOnedataModel=function(page,rows,searchEntity){
        return $http.post('../data/searchOneData.do?page='+page+"&rows="+rows,searchEntity);
    }
    this.searchUser=function(page,rows,id,num,startnum){
        return $http.get('../data/findResume.do?page='+page+"&rows="+rows+"&num="+num+"&startnum="+startnum+"&id="+id);
    }
    this.resumemodel=function(userid){
        return $http.get('../user/finddataModel.do?userid='+userid);
    }
    this.updateUserJobStatus=function (id,status) {
        return $http.get('../data/updateUserJobStatus.do?id='+id+"&status="+status);
    }
    this.searchRecomend=function(page,rows,id){
        return $http.get('../data/findRecommendResume.do?page='+page+"&rows="+rows+"&id="+id);
    }
    this.updateStatus=function (jobid,userid) {
        return $http.get('../userjob/updateUserJobStatus.do?jobid='+jobid+"&userid="+userid);
    }
    this.resumemodel1=function(userid){
        return $http.get('../user/findResumeModel.do?userid='+userid);
    }

});

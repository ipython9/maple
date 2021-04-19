//服务层
app.service('userjobService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../userjob/findAll.do');		
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../userjob/findPage.do?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../userjob/findOne.do?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../userjob/add.do',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../userjob/update.do',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../userjob/delete.do?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../userjob/search.do?page='+page+"&rows="+rows, searchEntity);
	}
    //搜索
    this.searchUser=function(page,rows,searchEntity){
        return $http.post('../userjob/searchUser.do?page='+page+"&rows="+rows,searchEntity);
    }
    this.resumemodel=function(userid){
        return $http.get('../user/findResumeModel.do?userid='+userid);
    }
    this.findOneJob=function(id){
        return $http.get('../job/findOne.do?id='+id);
    }
    this.updateUserJobStatus=function (jobid,userid) {
		return $http.get('../userjob/updateUserJobStatus.do?jobid='+jobid+"&userid="+userid);
    }
});

//服务层
app.service('userService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../user/findAll.do');		
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../user/findPage.do?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../user/findOne.do?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../user/add.do',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../user/update.do',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../user/delete.do?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../user/search.do?page='+page+"&rows="+rows, searchEntity);
	}
	//resume
	this.resumemodel=function(){
		return $http.get('../user/ResumeModel.do')
	}
    this.showName=function(){
        return $http.get('../user/name.do')
    }
    //job
    this.jobmodel=function(){
        return $http.get('../user/JobModel.do')
    }
    //compy
    this.compymodel=function(){
        return $http.get('../user/CompyModel.do')
    }

    //搜索
    this.searchJob=function(page,rows,searchEntity){
        return $http.post('../user/searchJob.do?page='+page+"&rows="+rows, searchEntity);
    }
    //搜索
    this.findbusModel=function(page,rows,searchEntity){
        return $http.post('../user/searchCompy.do?page='+page+"&rows="+rows, searchEntity);
    }
    //搜索
    this.finddataModel=function(page,rows,searchEntity){
        return $http.post('../user/searchData.do?page='+page+"&rows="+rows, searchEntity);
    }

    this.finddata=function (id) {
        return $http.post('../user/datadetail.do?id='+id);
    }
    this.addtask=function(id,num){
		return $http.get('../data/addtask.do?id='+id+"&num="+num);
	}
});

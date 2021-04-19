//服务层
app.service('compyService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../compy/findAll.do');		
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../compy/findPage.do?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../compy/findOne.do?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../compy/add.do',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../compy/update.do',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../compy/delete.do?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../compy/search.do?page='+page+"&rows="+rows, searchEntity);
	}
    //更改状态
    this.updateStatus=function(id,status){
        return $http.get('../compy/updateStatus.do?id='+id+'&status='+status);
    }

    //更改图片
    this.updatePicpath=function(pic){
        return $http.get('../compy/updatePic.do?pic='+pic);
    }
});

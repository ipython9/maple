app.service('loginService',function ($http) {
    this.showName=function(){
        return $http.get('../compy/name.do')
    }
    //增加
    this.add=function(entity){
        return  $http.post('../compy/add.do',entity );
    }
    //修改
    this.update=function(entity){
        return  $http.post('../compy/update.do',entity );
    }
    this.finaAll=function(){
        return $http.get('../compy/findindustry.do')
    }
})
app.service('loginService',function ($http) {
    this.showName=function(){
        return $http.get('../user/name.do')
    }

    //增加
    this.add=function(entity){
        return  $http.post('../user/add.do',entity );
    }
    //修改
    this.update=function(entity){
        return  $http.post('../user/update.do',entity );
    }

    //上传文件
    this.uploadFile=function() {
        var formdata = new FormData();
        formdata.append('file', file.files[0]);//file 文件上传框的name

        return $http({
            url: '../upload.do',
            method: 'post',
            data: formdata,
            headers: {'Content-Type': undefined},
            transformRequest: angular.identity
        });
    }

})
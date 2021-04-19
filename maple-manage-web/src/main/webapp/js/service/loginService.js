app.service('loginService',function ($http) {
    this.showName=function(){
        return $http.get('../compy/name.do')
    }
})
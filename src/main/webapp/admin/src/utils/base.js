const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm1n539/",
            name: "ssm1n539",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm1n539/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于SSM框架的Angel医院门诊在线预约挂号系统"
        } 
    }
}
export default base

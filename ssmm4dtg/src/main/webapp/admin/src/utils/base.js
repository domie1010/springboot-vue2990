const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmm4dtg/",
            name: "ssmm4dtg",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmm4dtg/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "高校学生管理系统"
        } 
    }
}
export default base

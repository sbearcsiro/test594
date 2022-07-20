package test521

class BootStrap {

    def testService

    def init = { servletContext ->
        testService.initData()
    }
    def destroy = {
    }
}

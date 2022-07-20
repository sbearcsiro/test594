package test521

class TestController {

    def testService

    def index() {
        render testService.checkSortAssociatedProperty()
    }

    def test() {
        render testService.checkSortEmbedProperty()
    }

    def test2() {
        render testService.checkSortAssociatedEmbedProperty()
    }
}

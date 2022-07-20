package test521

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class TestTwoSpec extends Specification implements DomainUnitTest<TestTwo> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}

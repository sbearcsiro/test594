package test521

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class TestOneSpec extends Specification implements DomainUnitTest<TestOne> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}

package test521

import grails.test.hibernate.HibernateSpec
import grails.testing.services.ServiceUnitTest

class TestServiceSpec extends HibernateSpec implements ServiceUnitTest<TestService> {

    def setup() {
    }

    def cleanup() {
    }

    void "test sort"() {
        setup:
        def testOne = new TestOne(name: 'name', testEmbed: new TestEmbed(code: 'code', value: 'value')).save(failOnError: true)
        def testTwo = new TestTwo(desc: 'desc', testEmbed: new TestEmbed(code: 'code', value: 'value'), testOne: testOne).save(failOnError: true)
        when:
        def results = service.checkSortAssociatedProperty()
        then:
        results.size() == 1
    }

    void "test sortEmbed"() {
        setup:
        def testOne = new TestOne(name: 'name', testEmbed: new TestEmbed(code: 'code', value: 'value')).save(failOnError: true)
        def testTwo = new TestTwo(desc: 'desc', testEmbed: new TestEmbed(code: 'code', value: 'value'), testOne: testOne).save(failOnError: true)
        when:
        def results = service.checkSortEmbedProperty()
        then:
        results.size() == 1
    }

    void "test sortAssociatedEmbed"() {
        setup:
        def testOne = new TestOne(name: 'name', testEmbed: new TestEmbed(code: 'code', value: 'value')).save(failOnError: true)
        def testTwo = new TestTwo(desc: 'desc', testEmbed: new TestEmbed(code: 'code', value: 'value'), testOne: testOne).save(failOnError: true)
        when:
        def results = service.checkSortAssociatedEmbedProperty()
        then:
        results.size() == 1
    }
}

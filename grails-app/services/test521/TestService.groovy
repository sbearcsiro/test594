package test521

import grails.gorm.transactions.Transactional
import groovy.util.logging.Slf4j

@Transactional
@Slf4j
class TestService {

    def initData() {
        if (TestOne.count() == 0) {
            log.error("Bootstrap")
            def testOne = new TestOne(name: 'name', testEmbed: new TestEmbed(code: 'code', value: 'value')).save(failOnError: true)
            def testTwo = new TestTwo(desc: 'desc', testEmbed: new TestEmbed(code: 'code', value: 'value'), testOne: testOne).save(failOnError: true)
        }
    }

    def checkSortAssociatedProperty() {
        log.error("${TestTwo.count} ${TestOne.count}")
        TestTwo.findAll(sort: 'testOne.name')
    }

    def checkSortEmbedProperty() {
        TestTwo.findAll(sort: 'testEmbed.code')
    }

    def checkSortAssociatedEmbedProperty() {
        TestTwo.findAll(sort: 'testOne.testEmbed.code')
    }
}

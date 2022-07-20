package test521

class TestTwo {

    Long id
    String desc
    TestOne testOne

    TestEmbed testEmbed

    static embedded = ['testEmbed']

    static constraints = {
    }
}

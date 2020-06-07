package guru.springframework

class JavaHelloWorldSpecTest extends spock.lang.Specification {

    def "GetHello"() {

        when:
        def foo = "123"

        then:
        true
    }
}

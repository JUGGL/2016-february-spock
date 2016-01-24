package us.juggl.twentysixteen.february.spock

import spock.lang.Specification
import us.juggl.twentysixteen.february.spock.Example

/**
 * An example of a Spock BDD Specification
 */
class ExampleSpec extends Specification {
    def example = new Example();

    def "adding 2 integers should work"() {
        when: "2 values, 10 & 12, are added"
        def result = example.add(10, 12)

        then: "The result MUST be 22"
        result == 22
    }
}

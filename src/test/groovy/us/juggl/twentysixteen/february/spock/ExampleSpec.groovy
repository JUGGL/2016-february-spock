package us.juggl.twentysixteen.february.spock

import spock.lang.Specification

/**
 * An example of a Spock BDD Specification
 */
class ExampleSpec extends Specification {
    def example = new Example();

    /**
     * A test which ensures that adding 2 values produces the correct result
     */
    def "adding 2 integers should work"() {
        setup:
        def a = 10
        def b = 12

        when: "2 values, 10 & 12, are added"
        def result = example.add(a, b)

        then: "The result MUST be 22"
        result == 22
    }

    /**
     * A test which tests the {@link Example#add(int, int)} method with various values and results using a
     * data table
     * @param a The first addend
     * @param b The second addend
     * @param c The expected result
     */
    def "Adding 2 integers should always return accurate values"(int a, int b, int c) {
        expect:
        example.add(a, b) == c

        where:
        a | b | c
        1 | 2 | 3
        2 | 4 | 6
        12| 13| 25
    }
}

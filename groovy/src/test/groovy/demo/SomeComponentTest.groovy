package demo

import groovy.util.logging.Slf4j
import org.junit.experimental.categories.Category
import org.kurron.categories.ComponentTest
import org.springframework.boot.test.SpringApplicationContextLoader
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

/**
 * Example of a component test.
 */
@Category( ComponentTest )
@Slf4j
@ContextConfiguration( classes = Application, loader = SpringApplicationContextLoader )
class SomeComponentTest extends Specification {

    def 'contextLoads'() {
        given:
        def foo = true

        expect:
        log.info( 'some component test ran!' )
        foo
    }

}

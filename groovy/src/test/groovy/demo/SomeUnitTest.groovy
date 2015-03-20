package demo

import groovy.util.logging.Slf4j
import org.junit.experimental.categories.Category
import org.kurron.categories.UnitTest
import spock.lang.Specification

/**
 * An example unit test
 */
@Slf4j
@Category( UnitTest )
class SomeUnitTest  extends Specification {

    def 'always passes'() {
        given:
        def foo = true

        expect:
        log.info( 'Unit test passed!' )
        foo
    }
}

package demo

import groovy.util.logging.Slf4j
import org.junit.experimental.categories.Category
import org.kurron.categories.EndToEndTest
import org.springframework.boot.test.SpringApplicationContextLoader
import org.springframework.boot.test.WebIntegrationTest
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

/**
 * Example of an end-to-end test.
 */
@Category( EndToEndTest )
@Slf4j
@ContextConfiguration( classes = Application, loader = SpringApplicationContextLoader )
@WebIntegrationTest( randomPort = true )
class SomeEndToEndTest extends Specification {

    def 'contextLoads'() {
        given:
        def foo = true

        expect:
        log.info( 'some end-to-end test ran!' )
        foo
    }

}

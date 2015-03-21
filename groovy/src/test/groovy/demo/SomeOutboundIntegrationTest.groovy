package demo

import groovy.util.logging.Slf4j
import org.junit.experimental.categories.Category
import org.kurron.categories.OutboundIntegrationTest
import org.springframework.boot.test.SpringApplicationContextLoader
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

/**
 * An example of an outbound gateway integration test.
 */
@Category( OutboundIntegrationTest )
@Slf4j
@ContextConfiguration( classes = Application, loader = SpringApplicationContextLoader )
class SomeOutboundIntegrationTest extends Specification {

    def 'contextLoads'() {
        given:
        def foo = true

        expect:
        log.info( 'some outbound integration test ran!' )
        foo
    }

}

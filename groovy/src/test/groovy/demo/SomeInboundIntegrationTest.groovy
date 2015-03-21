package demo

import groovy.util.logging.Slf4j
import org.junit.experimental.categories.Category
import org.kurron.categories.InboundIntegrationTest
import org.kurron.categories.OutboundIntegrationTest
import org.springframework.boot.test.SpringApplicationContextLoader
import org.springframework.boot.test.WebIntegrationTest
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

@Category( InboundIntegrationTest )
@Slf4j
@ContextConfiguration( classes = Application, loader = SpringApplicationContextLoader )
@WebIntegrationTest( randomPort = true )
class SomeInboundIntegrationTest extends Specification{

    def 'contextLoads'() {
        given:
        def foo = true

        expect:
        log.info( 'some inbound integration test ran!' )
        foo
    }

}

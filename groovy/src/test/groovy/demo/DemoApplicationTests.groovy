package demo

import groovy.util.logging.Slf4j
import org.junit.experimental.categories.Category
import org.kurron.categories.ComponentTest
import spock.lang.Specification

@Category( ComponentTest )
@Slf4j
class DemoApplicationTests extends Specification{

    def 'contextLoads'() {
        log.info( 'some component test ran!' )
    }

}

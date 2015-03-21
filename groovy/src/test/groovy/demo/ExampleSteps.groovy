package demo

import cucumber.api.PendingException
import cucumber.api.java.After
import cucumber.api.java.Before
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import groovy.util.logging.Slf4j

/**
 * Step definitions for the example scenarios.
 */
@Slf4j
class ExampleSteps {

    @Before
    void setup() {
        log.debug( 'setup called' )
    }

    @After
    void teardown() {
        log.debug( 'teardown called' )
    }

    @Given( '^an asset has previously been uploaded$' )
    void 'an asset has previously been uploaded'() {
        log.debug( 'an asset has previously been uploaded' )
    }

    @Given( '^an Accept header filled in with the desired media-type of the bits to be downloaded$' )
    void 'an Accept header filled in with the desired media-type of the bits to be downloaded'() {
        log.debug( 'an Accept header filled in with the desired media-type of the bits to be downloaded' )
    }

    @When( '^a GET request is made to the URI$' )
    void 'a GET request is made to the URI'() {
        log.debug( 'a GET request is made to the URI' )
    }

    @Then( '^a response with a (\\d+) HTTP status code is returned$' )
    void 'a response with an N HTTP status code is returned'( int status )  {
        log.debug( 'a response with an {} HTTP status code is returned', status )
    }

    @Then( '^the Content-Type header matches the Accept header$' )
    void 'the Content-Type header matches the Accept header'() {
        log.debug( 'the Content-Type header matches the Accept header' )
    }

    @Then('^the body contains the asset$')
    void 'the body contains the asset'() {
        log.debug( 'the body contains the asset' )
    }
}

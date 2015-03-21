package demo;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Step definitions for the example scenarios.
 */
public class ExampleSteps {
    static final Logger log = LoggerFactory.getLogger( ExampleSteps.class );

    static class MyWorld {
        public String someAttribute = "shared";
    }

    MyWorld sharedState;

    @Before
    void setup() {
        log.debug( "setup called" );
        sharedState = new MyWorld();
    }

    @After
    void teardown() {
        log.debug( "teardown called" );
        sharedState = null;
    }

    @Given("^an asset has previously been uploaded$")
    public void an_asset_has_previously_been_uploaded() throws Throwable {
    }

    @Given("^an Accept header filled in with the desired media-type of the bits to be downloaded$")
    public void an_Accept_header_filled_in_with_the_desired_media_type_of_the_bits_to_be_downloaded() throws Throwable {
    }

    @When("^a GET request is made to the URI$")
    public void a_GET_request_is_made_to_the_URI() throws Throwable {
    }

    @Then("^a response with a (\\d+) HTTP status code is returned$")
    public void a_response_with_a_HTTP_status_code_is_returned(int arg1) throws Throwable {
    }

    @Then("^the Content-Type header matches the Accept header$")
    public void the_Content_Type_header_matches_the_Accept_header() throws Throwable {
    }

    @Then("^the body contains the asset$")
    public void the_body_contains_the_asset() throws Throwable {
    }
}

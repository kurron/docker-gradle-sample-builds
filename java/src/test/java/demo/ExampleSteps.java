package demo;

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
public final class ExampleSteps {
    /**
     * Message logger to use.
     */
    static final Logger LOG = LoggerFactory.getLogger(ExampleSteps.class);

    /**
     * Shared state instance.
     */
    MyWorld sharedState;

    @Before
    void setup() {
        LOG.debug("setup called");
        sharedState = new MyWorld();
    }

    @After
    void teardown() {
        LOG.debug("teardown called");
        sharedState = null;
    }

    @Given("^an asset has previously been uploaded$")
    public void anAssetHasPreviouslyBeenUploaded() {
        LOG.debug("anAssetHasPreviouslyBeenUploaded called");
    }

    @Given("^an Accept header filled in with the desired media-type of the bits to be downloaded$")
    public void anAcceptHeaderFilledInWithTheDesiredMediaTypeOfTheBitsToBeDownloaded() {
        LOG.debug("anAcceptHeaderFilledInWithTheDesiredMediaTypeOfTheBitsToBeDownloaded called");
    }

    @When("^a GET request is made to the URI$")
    public void aGETRequestIsMadeToTheURI() {
        LOG.debug("aGETRequestIsMadeToTheURI called");
    }

    @Then("^a response with a (\\d+) HTTP status code is returned$")
    public void aResponseWithAHttpStatusCodeIsReturned(final int status) {
        LOG.debug("aResponseWithAHTTPStatusCodeIsReturned called with a ode of {}", status);
    }

    @Then("^the Content-Type header matches the Accept header$")
    public void theContentTypeHeaderMatchesTheAcceptHeader() {
        LOG.debug("theContentTypeHeaderMatchesTheAcceptHeader called");
    }

    @Then("^the body contains the asset$")
    public void theBodyContainsTheAsset() {
        LOG.debug("theBodyContainsTheAsset called");
    }

    /**
     * Shared state between steps.
     */
    static class MyWorld {
        /**
         * Some state to share.
         */
        public String someAttribute = "shared";
    }
}

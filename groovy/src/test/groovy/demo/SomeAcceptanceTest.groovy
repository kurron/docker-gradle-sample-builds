package demo

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

/**
 * Driver for all acceptance tests.
 */
@CucumberOptions( strict = false,
                  tags = ['~@slow'], // by default do not run the slow tests
                  plugin = ['pretty', 'html:build/reports/acceptanceTests'],
                  monochrome = true )
@RunWith( Cucumber )
class SomeAcceptanceTest {
}

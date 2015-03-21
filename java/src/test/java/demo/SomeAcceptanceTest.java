package demo;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
/**
 * Driver for all acceptance tests.
 */
@CucumberOptions(strict = false,
                 tags = {"~@slow"},
                 plugin = {"pretty", "html:build/reports/acceptanceTests"},
                 monochrome = true,
                 snippets = SnippetType.CAMELCASE)
@RunWith(Cucumber.class)
public class SomeAcceptanceTest {
}

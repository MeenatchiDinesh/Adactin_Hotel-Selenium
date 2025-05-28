package adactin.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/Meenatchi/eclipse-workspace/AcadtinHotelUsingCucumber/src/test/resources/Adactin.feature",
                  glue = "adactin.steps",dryRun = false,
                  plugin = {
                	        "pretty",
                	        "html:target/cucumber-reports.html",         // HTML report
                	        "json:target/cucumber.json",                 // JSON for other integrations
                	        "junit:target/cucumber.xml"                  // JUnit XML
                	    })
public class Runner {}

package com.epam.jdi.httptests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/",
        glue = {"com/epam/jdi/httptests/steps", "com/epam/jdi/http/stepdefs/en"},
        tags = {"@smoke"})
public class HttpTestsRunner extends AbstractTestNGCucumberTests {
}

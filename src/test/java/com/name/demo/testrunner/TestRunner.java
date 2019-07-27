package com.name.demo.testrunner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/web", glue = "com.name.demo.web.steps", monochrome = true)
public class TestRunner {

}

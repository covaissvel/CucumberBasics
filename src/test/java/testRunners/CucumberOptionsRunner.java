package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)//src/test/
@CucumberOptions(features = {"src/test/resources/features/loginWithCucumberOptions.feature"}, glue = {"stepDefinitions"},
tags = {"@Prod"}, monochrome = false)
public class CucumberOptionsRunner {

}

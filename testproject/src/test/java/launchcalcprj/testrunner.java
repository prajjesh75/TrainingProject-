package launchcalcprj;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/featuresfiles",glue={"stepdefinitions"})
public class testrunner {

}

package cucumberdemo_a_package;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/cucumber_demofolder/cucumber_demofile2.feature",
                                   glue="cucumberdemo_a_package")

public class runner {

}

package TestRunnerBlock;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "./src/main/java/FeatureFiles",
				 glue="StepDefinationBlock",
				 dryRun = false)
public class LoginRunner extends AbstractTestNGCucumberTests  {

}

package MyRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Automation Test\\MyBDDFrameWork\\src\\main\\java\\Features\\amazonLogin.feature",
		glue = {"step_def"},
		format = {"pretty", "html:test-output"}
		)

public class AmazonRunner {
	
		
	}



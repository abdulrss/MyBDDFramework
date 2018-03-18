package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Automation Test\\MyBDDFrameWork\\src\\main\\java\\Features\\login.feature"
		,glue= {"step_def"},
		format= {"pretty", "html:test-output"}
		,tags= {"@AmazonTest"}
		)


public class TestRunner {
	

}

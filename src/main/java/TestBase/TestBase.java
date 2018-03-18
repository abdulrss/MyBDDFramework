package TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
	
	public static WebDriver driver;
	
	
	public static void waitForResults(WebElement searchResults) {
		
		long timeOutInSeconds = 5;
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		WebElement element = null;
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}

}

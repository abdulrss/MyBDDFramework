package TestBase;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
	
	public static WebDriver driver;
	String browserName = "chrome";
	
	public static long PAGELOAD_MAX_TIME_OUT = 20;
	public static long IMPLICT_WAIT = 10;
		
	public static void waitForResults(WebElement searchResults) {
		
		long timeOutInSeconds = 5;
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		WebElement element = null;
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	@BeforeClass public void initiateBrowser() {
							
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Automation Test\\chromedriver.exe");
			driver = new ChromeDriver();
			}
		else if (browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Automation Test\\geckodriver.exe");
			driver = new FirefoxDriver();			
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(PAGELOAD_MAX_TIME_OUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(IMPLICT_WAIT, TimeUnit.SECONDS);		
		
	}
	
	
}

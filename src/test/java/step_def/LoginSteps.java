package step_def;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginSteps {
	
	WebDriver driver;
	
	@Given("^User is already on the Login page$")
	public void user_on_Login_page() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation Test\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/");		
	}
	
	@When("^User verifies tile of the page is freeCRM$")
	public void user_veifies_page_title() {
		String WinTitle = driver.getTitle();		
		Assert.assertEquals("#1 Free CRM for Any Business: Online Customer Relationship Software", WinTitle);		
	}
	
	@Then("^User enters userid and password$")
	public void user_enters_userid_and_password(){
	    driver.findElement(By.name("username")).sendKeys("abdulrss");
	    driver.findElement(By.name("password")).sendKeys("abdulrss");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 }
	
	@Then("^User clicks on SubmitButton$")
	public void user_clicks_on_SubmitButton() {
		
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
	    JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", loginBtn);			
	}
	@Then("^User navigates to HomePage$")
	public void user_navigates_to_HomePage(){
	    
		String title = driver.getTitle();
		Assert.assertEquals("CRMPRO", title);
		driver.close();
	}
	
	

}


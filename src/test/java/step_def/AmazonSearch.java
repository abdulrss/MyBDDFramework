package step_def;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestBase.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class AmazonSearch extends TestBase{
	
	WebDriver driver;
	
	
	@Given("^User is on Amazon home Page$")
	public void user_is_on_Amazon_home_Page() {
		System.setProperty("webdriver.gecko.driver", "C:\\Automation Test\\geckodriver.exe");
		driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Automation Test\\chromedriver.exe");
		//driver = new ChromeDriver();
		driver.get("https://www.amazon.co.uk");
		driver.manage().window().maximize();
		String homePageTitle = driver.getTitle();
		Assert.assertEquals("Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more", homePageTitle);
	}
	
	@When("^I search for the book$")
	public void i_search_for_the_book(){
		
		String bookname = "Java in 21 Days";
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(bookname);
		driver.findElement(By.cssSelector(".nav-input")).click();
		
		//wait for results page to load, should go into a testbase file
		WebElement SearchResults = driver.findElement(By.id("resultsCol"));
		
		long timeOutInSeconds = 5;
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds );
		wait.until(ExpectedConditions.visibilityOf(SearchResults));
		
		//waitForResults(SearchResults);			    
	}
	
	@Then("^I am retured a list of correct books$")
	public void i_am_retured_a_list_of_correct_books() {
		
		//Verify the first book contains Java in 21 days text
		String searchTitle = driver.getTitle();
		Assert.assertEquals("Amazon.co.uk: Java in 21 Days", searchTitle);
		
		//Select the first element
	    
	}
	
	@When("^I add the first book to the basket$")
	public void i_add_the_first_book_to_the_basket(){
	    
		 /*WebElement item2 = driver.findElement(By.cssSelector("#s-results-list-atf>.li:nth-of-type(1).a-link-normal"));
		Actions actions = new Actions (driver);
		actions.moveToElement(item2).click().build().perform();*/
		driver.findElement(By.partialLinkText("Java in 21 Days")).click();
		
		//Add the book to basket
		WebElement addToBasketBtn = driver.findElement(By.name("submit.add-to-cart"));
		addToBasketBtn.click();
		
		//Verify Checkout button is displayed
		WebElement checkOutBtn = driver.findElement(By.id("hlb-ptc-btn-native"));
		assert(checkOutBtn).isDisplayed();		
	}

	@Then("^I check the basket total$")
	public void i_check_the_basket_total() {
		
		WebElement basketIcon = driver.findElement(By.id("nav-cart-count"));
		basketIcon.click();
		
		//Get the total
		WebElement totalPrice2 = driver.findElement(By.cssSelector("#sc-subtotal-amount-activecart > span:nth-child(1)"));
		//String totalPrice = driver(By.id("sc-subtotal-amount-activecart"));
		String price = totalPrice2.getText();
		System.out.println("Total price is: " + price);  
		Assert.assertEquals("£32.99", price);
		driver.close();
		
	}

	

}

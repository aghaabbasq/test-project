package signUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ScenarioOne {

	WebDriver driver;
	
	@Given("^Open Chrome and go to  https://www.campaignmonitor.com/signup/$")
	public void Open_Chrome_and_go_to_https_www_campaignmonitor_com_signup() throws Throwable {
	    
		System.setProperty("webdriver.chrome.driver", "/Users/aghaabbasqazvini/Documents/abbas/seleniumJava/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://campaignmonitor.com/signup");
	}

	@Then("^User signup as \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and create an account$")
	public void User_signup_as_and_create_an_account(String Name, String Company, String Email, String Password) throws Throwable {
	   // parameterising test data

		driver.findElement(By.name("contactName")).sendKeys(Name);
		driver.findElement(By.name("companyName")).sendKeys(Company);
		driver.findElement(By.name("email")).sendKeys(Email);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.className("primary")).click();
		
	}

	@Then("^User will provide account type details by selecting options from dropdown and continue$")
	public void User_will_provide_details_by_selecting_options_from_dropdown_and_continue() throws Throwable {
	    
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.c-button-user-account-list__nested-button-inner")));
		// Waiting for element to be visible
		driver.findElement(By.cssSelector("div.c-button-user-account-list__nested-button-inner")).click();
		driver.findElement(By.cssSelector("#accordion-target-0 > ul > li:nth-child(1) > form > button")).click();
		

	}
	@Then("^User has successfully signed up$")
	public void User_has_successfully_signed_up() throws Throwable {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.microservice-header")));
		//Verifying that user has sign up  and verifying dashboard header
		
		driver.close();
		
	}

}

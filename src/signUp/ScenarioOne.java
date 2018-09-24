package signUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioOne {

	WebDriver driver;
	
	@Given("^Open Chrome and go to  https://www.campaignmonitor.com/signup/$")
	public void Open_Chrome_and_go_to_https_www_campaignmonitor_com_signup() throws Throwable {
	    
		System.setProperty("webdriver.chrome.driver", "/Users/aghaabbasqazvini/Documents/abbas/seleniumJava/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://campaignmonitor.com/signup");
	}

	@Then("^User fill form by \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void User_signup_as_and_create_an_account(String Name, String Company, String Email, String Password) throws Throwable {
	   // parameterising test data. This will allow us to define test date before writing script.
		
		driver.findElement(By.name("contactName")).sendKeys(Name);
		driver.findElement(By.name("companyName")).sendKeys(Company);
		driver.findElement(By.name("email")).sendKeys(Email);
		driver.findElement(By.name("password")).sendKeys(Password);
		// finding input fields and passing input values 
		
	}
	
	@When("^User click on button to create an account$")
	public void User_click_on_button_to_create_an_account() throws Throwable {
	    
		// driver.findElement(By.className("primary")).click();
		
		driver.findElement(By.cssSelector("button.cmbtn.primary")).click();
		// This verifies that there is a button which can be clicked
	}

	@Then("^User will provide account type details by selecting options from dropdown and continue$")
	public void User_will_provide_details_by_selecting_options_from_dropdown_and_continue() throws Throwable {
	    
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.c-button-user-account-list__nested-button-inner")));
		// Waiting for element to be visible
		
		driver.findElement(By.cssSelector("div.c-button-user-account-list__nested-button-inner")).click();
		driver.findElement(By.cssSelector("button.c-button-user-account.c-button-user-account--no-avatar:nth-child(2)")).click();
		//As there are 4 buttons with same class using "nth-child(2)"

	}
	@Then("^User has successfully signed up$")
	public void User_has_successfully_signed_up() throws Throwable {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.microservice-header")));
		//Verifying that user has sign up  and verifying dashboard header
		
		driver.findElement(By.cssSelector("a[href='#menu-button-target-1']")).click();;
		// finding menu button to verify that user has signup successfully.
		// As a user should be signin to click on dropdown menu
		
		driver.close();
		
	}

}

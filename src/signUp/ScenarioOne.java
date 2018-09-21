package signUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioOne {

	WebDriver driver;
		
	@Given("^Open Chrome V-(\\d+) and go to  https://www.campaignmonitor.com/signup/$")
	public void Open_Chrome_V_and_go_to_https_www_campaignmonitor_com_signup(int arg1) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "/Users/aghaabbasqazvini/Documents/abbas/seleniumJava/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://campaignmonitor.com/signup");
	}

	@When("^User input \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
	public void User_input_and(String Name, String Company, String Email, String Password) throws Throwable {
	    
		driver.findElement(By.name("contactName")).sendKeys(Name);
		driver.findElement(By.name("companyName")).sendKeys(Company);
		driver.findElement(By.name("email")).sendKeys(Email);
		driver.findElement(By.name("password")).sendKeys(Password);
		
	}

	@Then("^User should be navigated to Step-2$")
	public void User_should_be_navigated_to_next_page() throws Throwable {
	    
		driver.findElement(By.className("primary")).click(); 
		
	}

}

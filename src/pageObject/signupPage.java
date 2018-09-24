//This is a signup page class which contains locators, one constructor and methods to use them

package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// this class stores all the locators for signup

public class signupPage {
	
	WebDriver driver; // reference local variable to perform actions in browser
	
	By name=By.name("contactName"); //Locate elements by page objects
	By companyNmae=By.name("companyName");
	By email=By.name("email");
	By password=By.name("password");
	By button=By.cssSelector("button.cmbtn.primary");

	public signupPage (WebDriver driver) { //constructor to initialise webdriver and call from test cases 
	
		this.driver=driver;
	}
	
	public void SignupForCampaignMonitor(String userName, String userCompanyNmae, String userEmail, String userPassword ) {
		
		driver.findElement(name).sendKeys(userName);
		driver.findElement(companyNmae).sendKeys(userCompanyNmae);
		driver.findElement(email).sendKeys(userEmail);
		driver.findElement(password).sendKeys(userPassword);
		driver.findElement(button).click();
		
	}
}

package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
		By Email = By.xpath("//input[@id='user_email']");
		By Password = By.xpath("//input[@id='user_password']");
		By LogIn= By.xpath("//input[@type='submit']");
		
		
		
		public WebElement username() {
			return driver.findElement(Email);
			
		}
		public WebElement password() {
			return driver.findElement(Password);
		}
		public WebElement signIn() {
			return driver.findElement(LogIn);
		}
	}



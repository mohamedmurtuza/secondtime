package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	WebDriver driver;

	By Login = By.xpath("//ul/li[4]/a/span");
	By title = By.xpath("//*[text()='Featured Courses']");
	By navigation = By.cssSelector("ul[class='nav navbar-nav navbar-right']");

	public LandingPage(WebDriver driver) {

		this.driver = driver;

	}

	public WebElement login() {

		return driver.findElement(Login);

	}

	public WebElement course() {
		return driver.findElement(title);
	}

	public WebElement navibar() {

		return driver.findElement(navigation);
	}
}

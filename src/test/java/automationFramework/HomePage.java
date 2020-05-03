package automationFramework;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.apache.logging.log4j.*;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class HomePage extends Base {

	Logger log = LogManager.getLogger(HomePage.class.getName());
	@BeforeClass
	public void initializer() throws IOException {
		driver = initializeDriver();
		
		log.info("opening browser");

		driver.get(prop.getProperty("URL"));

	}

	@Test

	public void basePageNavigation() throws IOException {

		LandingPage landpg = new LandingPage(driver);
		
		Assert.assertEquals(landpg.course().getText(), "FEATURED COURSES");
		log.info("Successfully validated");

		landpg.login().click();
		log.info("Successfully Clicked");
		LoginPage logpg = new LoginPage(driver);
		logpg.username().sendKeys("mohamedmurtuza3@gmail.com");
		logpg.password().sendKeys("ZaharaJabeen@123$");
		logpg.signIn().click();
		//driver.close();

	}
	
	@AfterClass
	public void close() {
		driver.close();
		driver= null;
	}
	
}

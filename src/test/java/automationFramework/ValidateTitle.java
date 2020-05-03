package automationFramework;

import java.io.IOException;
import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.Base;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class ValidateTitle extends Base {

	
	Logger log = LogManager.getLogger(ValidateTitle.class.getName());
	@BeforeClass
	public void initializer() throws IOException {
		driver = initializeDriver();

		driver.get(prop.getProperty("URL"));
		log.info("Successfully Navigated");

	}

	@Test
	public void validateCourseTitle() throws IOException {

		LandingPage landpg = new LandingPage(driver);

		Assert.assertEquals(landpg.course().getText(), prop.getProperty("course"));
		log.info("Successfully validated the course");

	}

	@AfterClass
	public void close() {
		driver.close();
		driver= null;
	}

}

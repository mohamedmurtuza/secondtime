package automationFramework;

import java.io.IOException;
import org.apache.logging.log4j.*;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.Base;

public class NavigationBarVa extends Base {
	
	public static Logger log = LogManager.getLogger(NavigationBarVa.class.getName());
	@BeforeClass
	public void initializer() throws IOException {
		driver = initializeDriver();

		driver.get(prop.getProperty("URL"));
		log.info("Successfully Navigated");
	}

	@Test
	public void navigation() throws IOException {

		LandingPage ldpg = new LandingPage(driver);

		Assert.assertTrue(ldpg.navibar().isDisplayed());
		log.info("Successfully displyed");
	}

	@AfterClass
	public void close() {
		driver.close();
		log.info("Closed the browser");
		driver= null;
	}

}

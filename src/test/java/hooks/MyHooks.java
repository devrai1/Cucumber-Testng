package hooks;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import Factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utiles.ConfigReader;


public class MyHooks {
	
	WebDriver driver;
	@Before
	public void setUp() {
		Properties prop = ConfigReader.intializeProperties();
		DriverFactory.initilizeDriver(prop.getProperty("browser"));
		driver = DriverFactory.getDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("url"));
		
	}
//	@After
//	public void tearDown() {
//		
//		driver.close();
//		
//	}
	
	



}

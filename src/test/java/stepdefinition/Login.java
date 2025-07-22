package stepdefinition;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import Factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import page.LoginPage;
import utiles.ConfigReader;

public class Login {
	
	WebDriver driver;
	//Properties prop;
	LoginPage lp;
	Properties prop ;

	@Given("I am on login page")
	public void i_am_on_login_page() {
		driver = DriverFactory.getDriver();
		lp = new LoginPage(driver);
		prop = ConfigReader.intializeProperties();
		 
	}

	@Given("enter the userName")
	public void enter_the_user_name() {
		lp.enter_userName(prop.getProperty("userName"));;
		}
	@Given("enter the password")
	public void enter_the_password() {
		 lp.enter_Password(prop.getProperty("password"));
	}

	@Then("click on login button")
	public void click_on_login_button() {
		lp.ClickOnLoginBtn();
		 
	}

	@Then("check i am dashbord page")
	public void check_i_am_dashbord_page() {
		 
	}

}

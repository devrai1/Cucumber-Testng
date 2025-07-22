package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	// to initialize the webElement we use this constructor
		public LoginPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this); // 💡 REQUIRED!
	    }
		
		
		@FindBy (id="user-name")
		private WebElement userInput;
		
		@FindBy (id="password")
		private WebElement passwordInput ;
		
		@FindBy (id= "login-button")
		private WebElement loginBtn ;
		
		 
		
////
		
		public void enter_userName(String emial){
			userInput.click();
			userInput.sendKeys(emial);
		}
		
		public void enter_Password(String pass) {
			passwordInput.sendKeys(pass);
			
		}
		
		public void ClickOnLoginBtn() {
			loginBtn.click();
		}

}

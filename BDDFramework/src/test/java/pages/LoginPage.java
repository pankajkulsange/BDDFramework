package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	// ID of user name
	By txt_username=By.id("user-name");
	
	// ID of password
	By txt_password=By.id("password");
	
	// XPath for Login Button
	By btn_login=By.id("login-button");
	
	// XPath of Home page logo
	By lbl_logo=By.xpath("//div[@class='app_logo']");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUserName(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void clickLoginButton() {
		driver.findElement(btn_login).click();
	}
	
	public void isAppLogoDisplayed() {
		driver.findElement(lbl_logo).isDisplayed();
	}
	
	public void userLogin(String username, String password) {
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
	}
	
	
	
}

package StepDefinations;

import java.time.Duration;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.homePageFactory;
import pageFactory.loginPageFactory;

public class PageFactLogin {

	static WebDriver driver;

	loginPageFactory loginPF;
	homePageFactory home;
	@Given("User is on login page")
	public void user_is_on_login_page() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/v1/");
		System.out.println("Step 1 Completed");
	}

	@When("User enters valid {string} and {string}")
	public void User_enters_valid_username_and_password(String uName, String pass) {
		loginPF = new loginPageFactory(driver);
		loginPF.enterUsername(uName);
		loginPF.enterPassword(pass);
		
	}

	@And("Clicks on Login button")
	public void clicks_on_login_button() {
		loginPF.clickLoginButton();
	}

	@Then("User should navigate to homepage")
	public void user_should_navigated_to_the_home_page() {
		home = new homePageFactory(driver);
		
		home.isCartDispalyed();
	}

	@And("Close the browser")
	public void close_the_browser() {
		driver.quit();
	}

}

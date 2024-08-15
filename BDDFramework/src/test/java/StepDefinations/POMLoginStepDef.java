//package StepDefinations;
//
//import java.time.Duration;
//
////import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
////import org.testng.Assert;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pages.LoginPage;
//
//public class POMLoginStepDef {
//	WebDriver driver;
//	
//	LoginPage login;
//	
//	@Given("User is on login page")
//	public void user_is_on_login_page() {
//	   driver = new ChromeDriver();
//	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	   driver.get("https://www.saucedemo.com/v1/");
//	}
//	
//	@When("User enters valid {string} and {string}")
//	public void User_enters_valid_username_and_password(String uName, String pass) {
//		 login =  new LoginPage(driver);
//		login.enterUserName(uName);
//		login.enterPassword(pass);
//	}
//
//	@And("Clicks on Login button")
//	public void clicks_on_login_button() {
//		login.clickLoginButton();
//	}
//	
//
//	@Then("User should navigate to homepage")
//	public void user_should_navigated_to_the_home_page() {
//		login.isAppLogoDisplayed();
//		System.out.println("User is navigated to homepage");
//	}
//	
//	@And("Close the browser")
//	public void close_the_browser() {
//		driver.quit();
//	}
//}

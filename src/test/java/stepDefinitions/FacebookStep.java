package stepDefinitions;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookStep {
	WebDriver driver;
	
	@Given("Open facebook website")
	public void openFacebookWebsite() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Then("Verify email textbox is display")
	public void verifyEmailTextboxIsDisplay() {
		Assert.assertTrue(driver.findElement(By.id("email")).isDisplayed());
		
	}
	
	@Then("Verify password textbox is display")
	public void verifyPasswordTextboxIsDisplay() {
		Assert.assertTrue(driver.findElement(By.id("pass")).isDisplayed());
	}
	
	@Then("Close browser")
	public void closeBrowser() {
	    driver.quit();
	}
	
	@When("Input to Username textbox with {string}")
	public void inputToUsernameTextboxWith(String userName) {
	    System.out.println(userName);
	}
	@When("Input to Password textbox with {string}")
	public void inputToPasswordTextboxWith(String password) {
		System.out.println(password);
	}
	@When("Click to Submit button")
	public void clickToSubmitButton() {
		System.out.println("Click login");
	}
	@When("Input to Username and Password")
	public void inputToUsernameAndPassword(DataTable dataTable) {
	    List<Map<String, String>> customer = dataTable.asMaps(String.class, String.class);
	    System.out.println("Username: " + customer.get(0).get("Username"));
	}
	
	@When("Use multi input to Username and Password")
	public void useMultiInputToUsernameAndPassword(DataTable dataTable) {
		for(Map<String, String> loginInfo: dataTable.asMaps(String.class, String.class)) {
			System.out.println("Value Username: " + loginInfo.get("Username"));
			System.out.println("Value Password: " + loginInfo.get("Password"));
			System.out.println("Value Address: " + loginInfo.get("Address"));
		}
	}
}

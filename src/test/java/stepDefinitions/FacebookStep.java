package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

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
}

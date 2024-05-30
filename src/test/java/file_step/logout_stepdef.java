package file_step;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logout_stepdef {
	public WebDriver driver;

	@Before
	public void loginSetup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Given("user navigates to LoginPage")
	public void user_navigates_to_LoginPage() {
		Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(), 'Returning Customer')]")).isDisplayed());
		
	}
	
	 @When("user logs out from application")
	 public void user_logs_out_from_application() {
		 driver.findElement(By.xpath("//div[@id='account-account']")).click();
	 }
	 
	 @Then("Message displayed logout successfully")
	 public void message_displayed_logout_successfully() {
		 driver.findElement(By.xpath("//div[@id='common-success']")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		 }
	 
	  @And("Browser quit by driver")
	  public void browser_quit_by_driver() {
}
}
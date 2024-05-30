package file_step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_stepdef {
	public WebDriver driver;
	
	@Before
	public void loginSetup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.linkText("My Account")).click();
		
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
@Given("user navigates to LoginPage")
public void user_navigates_to_LoginPage() {
	Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(), 'Returning Customer')]")).isDisplayed());
	
}

	@When ("user enters valid email {string} into email textbox field")
	public void user_enters_valid_email_into_email_textbox_field(String emailText) {
		driver.findElement(By.id("input-email")).sendKeys(emailText);
		
	}
	
	@And ("user enters valid password {string} into password textbox field")
	public void user_enters_valid_password_into_password_textbox_field(String passwordText) {
		driver.findElement(By.id("input-password")).sendKeys(passwordText);
	}
	
	@And("user clicks on Login button")
	public void user_clicks_on_Login_button() {
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
	@Then ("user is navigated to AccountPage")
	public void user_is_navigated_to_AccountPage() {
		driver.findElement(By.linkText("Logout")).click();
	}
	}

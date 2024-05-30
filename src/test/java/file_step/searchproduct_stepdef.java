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

public class searchproduct_stepdef {
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
	
@Given("user opens the application")
public void user_opens_the_application() {
}

@When("user enters the valid product {string}")
public void user_enters_the_valid_product(String  ValidProductText) {
	driver.findElement(By.name("search")).sendKeys(ValidProductText);
}


@And("user clicks on the search button")
public void user_clicks_on_the_search_button() {
	driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
}

@Then("user gets valid product info display in the searchpage")
public void user_gets_valid_product_info_display_in_the_searchpage() {
	Assert.assertTrue(driver.findElement(By.linkText("HP LP3065")).isDisplayed());
	
}

@Then("user gets warning message")
public void user_gets_warning_message() {
	Assert.assertTrue(driver.findElement(By.xpath("//[contains(text(), 'There is no prroduct that matches the serach criteria.')]")).isDisplayed());
	
}
}
	

